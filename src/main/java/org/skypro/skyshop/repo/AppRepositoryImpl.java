package org.skypro.skyshop.repo;

import lombok.RequiredArgsConstructor;
import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.search.SearchResult;
import org.skypro.skyshop.model.search.Searchable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class AppRepositoryImpl implements AppRepository {

    private final Storage storage;

    @Override
    public List<Product> findProducts() {
        return new ArrayList<>(storage.getProductMap().values());
    }

    @Override
    public List<Article> findArticles() {
        return new ArrayList<>(storage.getArticleMap().values());
    }

    @Override
    public Collection<SearchResult> searchByName(String name) {
        return findSearchable().stream().filter(e->e.getName().equals(name)).map(SearchResult::fromSearchable).toList();
    }

    @Override
    public List<Searchable> findSearchable() {
        List<Searchable> all = new ArrayList<>();
        all.addAll(findProducts());
        all.addAll(findArticles());
        return all;
    }

}
