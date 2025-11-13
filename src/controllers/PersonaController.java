package controllers;

import models.Person;

public class PersonaController {
    public void sortByName(Person[] people) {
    if (people == null || people.length < 2) return; // Casos edge: arreglo nulo o de un solo elemento

    for (int i = 0; i < people.length - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < people.length - 1 - i; j++) {
            Person p1 = people[j];
            Person p2 = people[j + 1];

            // Si ambos son nulos, no hacer nada
            if (p1 == null && p2 == null) continue;

            // Si p1 es nulo y p2 no, intercambiar para mover el nulo al final
            if (p1 == null && p2 != null) {
                people[j] = p2;
                people[j + 1] = p1;
                swapped = true;
                continue;
            }

            // Si p2 es nulo, dejarlo en su lugar (ya está al final)
            if (p1 != null && p2 == null) continue;

            // Ambos son no nulos: comparar nombres
            String name1 = p1.getName();
            String name2 = p2.getName();

            // Si ambos nombres son nulos, no hacer nada
            if (name1 == null && name2 == null) continue;

            // Si name1 es nulo y name2 no, mover el nulo al final
            if (name1 == null && name2 != null) {
                people[j] = p2;
                people[j + 1] = p1;
                swapped = true;
                continue;
            }

            // Si name2 es nulo, dejarlo en su lugar
            if (name1 != null && name2 == null) continue;

            // Comparación case-insensitive
            if (name1.compareToIgnoreCase(name2) > 0) {
                people[j] = p2;
                people[j + 1] = p1;
                swapped = true;
            }
        }
        if (!swapped) break; // Optimización: si no hubo intercambios, ya está ordenado
    }
}
}
