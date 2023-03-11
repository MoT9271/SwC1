package by.bntu.fitr.poisit.vikvik.university.model.entity;

import java.util.Arrays;

public class Knight {

    public String name;
    public String race;
    public String archetype;
    public String[] artifacts;
    public int level;
    public Knight(String name, int level, String race, String archetype,String[] artifacts){
        this.archetype = archetype;
        this.artifacts = artifacts;
        this.level = level;
        this.name = name;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", archetype='" + archetype + '\'' +
                ", artifacts=" + Arrays.toString(artifacts) +
                ", level=" + level +
                '}';
    }
}
