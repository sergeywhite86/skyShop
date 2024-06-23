package org.skypro.skyshop.service;

import lombok.RequiredArgsConstructor;
import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.search.SearchResult;
import org.skypro.skyshop.model.search.Searchable;
import org.skypro.skyshop.repo.AppRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
@RequiredArgsConstructor
public class ShopService {

    private final AppRepositoryImpl repository;


    public Collection<Product> getProducts() {
        return repository.findProducts();
    }

    public Collection<Article> getArticles() {
        return repository.findArticles();
    }

    public Collection<Searchable> getSearchable() {
        return repository.findSearchable();
    }

    public Collection<SearchResult> getSearchResultsByName(String name) {
        return repository.searchByName(name);
    }
//    public Collection<Searchable> getSearchResultsByNames(String name) {
//        return repository.searchByNames(name);
//    }
}
