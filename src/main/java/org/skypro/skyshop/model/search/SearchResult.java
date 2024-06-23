package org.skypro.skyshop.model.search;

public record SearchResult(String id, String name, String contentType) {

    public static SearchResult fromSearchable(Searchable searchable) {
        return new SearchResult(searchable.getId().toString(), searchable.getName(), searchable.getTypeContent());
    }
}
