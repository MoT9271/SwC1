package by.bntu.fitr.poisit.matnik.university.model.logic;

import by.bntu.fitr.poisit.matnik.university.model.entity.Hero;
import by.bntu.fitr.poisit.matnik.university.view.Printer;

import java.util.Arrays;

public class Sorter {
    public static void sortByLevel(Hero[] heroes){
        for (int i = 0; i < heroes.length; i++){
            for (int j = i + 1; j < heroes.length; j++){
                if (heroes[i].getLevel() > heroes[j].getLevel()){
                    Hero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
        for (int i = 0; i < heroes.length; i++){
            Printer.print(heroes[i]);
            Printer.printStats(Manager.getStats(heroes[i]));
        }
    }
    public static void sortByName(Hero[] heroes){
        for (int i = 0; i < heroes.length; i++){
            for (int j = i + 1; j < heroes.length; j++){
                if (heroes[i].getName().compareTo(heroes[j].getName()) > 0){
                    Hero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
        for (int i = 0; i < heroes.length; i++){
            Printer.print(heroes[i]);
            Printer.printStats(Manager.getStats(heroes[i]));
        }
    }
    public static void sortByBuildCost(Hero[] heroes){
        for (int i = 0; i < heroes.length; i++){
            for (int j = i + 1; j < heroes.length; j++){
                if (Manager.getStats(heroes[i])[6] > Manager.getStats(heroes[j])[6]){
                    Hero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
        for (int i = 0; i < heroes.length; i++){
            Printer.print(heroes[i]);
            Printer.printStats(Manager.getStats(heroes[i]));
        }
    }
}
