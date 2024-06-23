package org.skypro.skyshop.controller;

import lombok.RequiredArgsConstructor;
import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.search.SearchResult;
import org.skypro.skyshop.model.search.Searchable;
import org.skypro.skyshop.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;



@RestController
@RequiredArgsConstructor
public class ShopController {

    private final ShopService service;

    @GetMapping("/products")
    public Collection<Product> getAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/articles")
    public Collection<Article> getAllArticles() {
        return service.getArticles();
    }

    @GetMapping("/all")
    public Collection<Searchable> getAllSearchResults() {
        return service.getSearchable();
    }

    @GetMapping("/search/{pattern}")
    public Collection<SearchResult> searchProduct(@PathVariable String pattern) {
        return service.getSearchResultsByName(pattern);
    }

}
