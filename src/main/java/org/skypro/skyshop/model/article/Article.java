package org.skypro.skyshop.model.article;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

@Data
public final class Article implements Searchable {


    private final UUID id;
    private final String name;
    private final String text;

    public Article(UUID id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s \n %s", name, text);
    }

    @JsonIgnore
    @Override
    public String searchTerm() {
        return toString();
    }

    @JsonIgnore
    @Override
    public String getTypeContent() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Searchable o) {
        return Integer.compare(o.getName().length(), this.getName().length());
    }
}
