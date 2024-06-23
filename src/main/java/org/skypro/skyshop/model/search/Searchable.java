package org.skypro.skyshop.model.search;


import java.util.UUID;

public interface Searchable extends Comparable<Searchable> {

    String searchTerm();

    String getTypeContent();

    String getName();

    UUID getId();

    default String getStringRepresentation() {
        return String.format("Имя - %s тип - %s ", getName(), getTypeContent());
    }
}
