package controllers;

import models.Person;
public class PersonaController {
    public void sortByName(Person[] people){
        for (int i = 0; i < people.length-1; i++) {
            boolean swepped=false;
            for (int j = 0; j < people.length-1-i; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j+1].getName())<0) {
                    Person aux = people[j];
                    people[j]=people[j+1];
                    people[j+1]=aux;
                    swepped=true;
                }
            }
            if (!swepped) {
                break;
            }
        }
    }
}
