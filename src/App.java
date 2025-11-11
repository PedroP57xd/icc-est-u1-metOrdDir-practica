import controllers.PersonaController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaController personaController = new PersonaController();
        Person[] personas = makePersonList();
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        personaController.sortByName(personas);
        System.out.println();
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
    //coment
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

}
