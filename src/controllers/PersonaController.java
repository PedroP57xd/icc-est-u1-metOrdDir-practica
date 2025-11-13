package controllers;

import models.Person;

public class PersonaController {
    public void sortByName(Person[] people) {
        if (people == null || people.length < 2)
            return; // Casos edge: arreglo nulo o de un solo elemento

        for (int i = 0; i < people.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - 1 - i; j++) {
                Person p1 = people[j];
                Person p2 = people[j + 1];

                if (p1 == null && p2 != null) {
                    people[j] = p2;
                    people[j + 1] = p1;
                    swapped = true;
                    continue;

                } else if (p1 != null && p2 != null) {
                    String name1 = p1.getName();
                    String name2 = p2.getName();

                    if (name1 == null && name2 == null)
                        continue;

                    if (name1 == null) {
                        people[j] = p2;
                        people[j + 1] = p1;
                        swapped = true;
                        continue;
                    } else if (name2 == null) {
                        continue;
                    }

                    if (name1.compareToIgnoreCase(name2) > 0) {
                        people[j] = p2;
                        people[j + 1] = p1;
                        swapped = true;
                    }
                }
            }
            if (!swapped)
                break;
        }
    }
}
