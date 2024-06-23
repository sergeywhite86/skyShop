package org.skypro.skyshop.repo;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.search.SearchResult;
import org.skypro.skyshop.model.search.Searchable;

import java.util.Collection;

public interface AppRepository {
    Collection<Product> findProducts();
    Collection<Article> findArticles();
    Collection<SearchResult> searchByName(String name);
    Collection<Searchable> findSearchable();
}
