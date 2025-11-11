package test;

import controllers.PersonController;
import models.Person;
import validaciones.Validators;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

public class PersonaControllerTest {

    private PersonController controller;

    @BeforeEach
    public void setUp() {
        controller = new PersonController();
    }

    public static Person[] makePersonList() {
        Person[] people = new Person[20];
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);
        people[3] = new Person("David", 28);
        people[4] = new Person("Emma", 32);
        people[5] = new Person("Frank", 27);
        people[6] = new Person("Grace", 29);
        people[7] = new Person("Henry", 31);
        people[8] = new Person("Ivy", 26);
        people[9] = new Person("Jack", 33);
        people[10] = new Person("Kate", 24);
        people[11] = new Person("Liam", 36);
        people[12] = new Person("Mia", 23);
        people[13] = new Person("Noah", 34);
        people[14] = new Person("Olivia", 22);
        people[15] = new Person("Paul", 37);
        people[16] = new Person("Quinn", 21);
        people[17] = new Person("Ruby", 38);
        people[18] = new Person("Sam", 20);
        people[19] = new Person("Tina", 39);
        return people;
    }

    @Test
    @DisplayName("Prueba ordenamiento básico por nombre")
    public void testOrdenamientoBasico() {
        Person[] original = makePersonList();
        Person[] paraOrdenar = Validators.copiarArreglo(List.of(original));

        // El estudiante debe implementar este método
        controller.sortByName(paraOrdenar);

        // Validar que el ordenamiento sea correcto
        Validators.validarOrdenamientoPorNombre(original, paraOrdenar);
        Validators.validarCasosEspeciales(paraOrdenar);
    }

    @Test
    @DisplayName("Prueba con nombres con mayúsculas y minúsculas")
    public void testCaseSensitive() {
        Person[] original = new Person[] {
                new Person("ana", 25),
                new Person("Bruno", 30),
                new Person("CARLOS", 20),
                new Person("diana", 35) };
        Person[] paraOrdenar = Validators.copiarArreglo(List.of(original));

        controller.sortByName(paraOrdenar);

        Validators.validarOrdenamientoPorNombre(original, paraOrdenar);
        Validators.validarCasosEspeciales(paraOrdenar);
    }

    @Test
    @DisplayName("Prueba con nombres con espacios y caracteres especiales")
    public void testNombresEspeciales() {
        Person[] original = new Person[] {
                new Person("María José", 25),
                new Person("José Luis", 30),
                new Person("Ana-Sofía", 20),
                new Person("Pedro Pablo", 35) };
        Person[] paraOrdenar = Validators.copiarArreglo(List.of(original));

        controller.sortByName(paraOrdenar);

        Validators.validarOrdenamientoPorNombre(original, paraOrdenar);
        Validators.validarCasosEspeciales(paraOrdenar);
    }
}
