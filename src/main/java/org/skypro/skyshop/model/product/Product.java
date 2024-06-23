package org.skypro.skyshop.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;


@Getter
@Data
public abstract class Product implements Searchable {

    private final UUID id;
    private final String name;

    public Product(UUID id, String name) {
        this.id = id;
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;

    }

    @JsonIgnore
    @Override
    public String searchTerm() {
        return name;
    }

    @JsonIgnore
    @Override
    public String getTypeContent() {
        return "PRODUCT";
    }


    public abstract boolean isSpecial();


    public abstract int getPrice();

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Searchable o) {
        return Integer.compare(o.getName().length(), this.getName().length());
    }
}
