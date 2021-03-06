package com.piotrek.graingrowth.type;

/**
 * Enum containing all cellular automata neighbourhoods used on UI purpose.
 * Created by Piotr on 18.10.2016.
 * @author Piotr Hajder
 */
public enum CaNeighbourhood {
    VON_NEUMANN("Von Neumann"),
    MOORE("Moore"),
    HEXAGONAL_RANDOM("Hexagonal random"),
    PENTAGONAL_RANDOM("Pentagonal random"),
    SHAPE_CONTROL("Shape control");

    private String name;

    CaNeighbourhood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
