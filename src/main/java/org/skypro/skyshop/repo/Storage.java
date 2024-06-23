package org.skypro.skyshop.repo;



import lombok.Getter;
import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.DiscountedProduct;
import org.skypro.skyshop.model.product.FixPriceProduct;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.springframework.stereotype.Repository;

import java.util.*;


@Getter
@Repository
public class Storage {

    private final Map<UUID, Product> productMap;
    private final Map<UUID, Article> articleMap;

    public Storage() {
        productMap = new HashMap<>();
        addProducts();
        articleMap = new HashMap<>();
        addArticles();
    }

    private void addProducts() {
        UUID id1 = UUID.randomUUID();
        productMap.put(id1, new SimpleProduct(id1, "apple", 80));
        UUID id2 = UUID.randomUUID();
        productMap.put(id2, new FixPriceProduct(id2, "orange"));
        UUID id3 = UUID.randomUUID();
        productMap.put(id3, new SimpleProduct(id3, "water", 120));
        UUID id4 = UUID.randomUUID();
        productMap.put(id4, new DiscountedProduct(id4, "milk", 30, 100));
        UUID id5 = UUID.randomUUID();
        productMap.put(id5, new SimpleProduct(id5, "milk", 75));
    }

    private void addArticles() {
        UUID id1 = UUID.randomUUID();
        articleMap.put(id1, new Article(id1, "text1", "bla bla bla 1"));
        UUID id2 = UUID.randomUUID();
        articleMap.put(id2, new Article(id2, "text2", "bla bla bla 2"));
        UUID id3 = UUID.randomUUID();
        articleMap.put(id3, new Article(id3, "text3", "bla bla bla 3"));
        UUID id4 = UUID.randomUUID();
        articleMap.put(id4, new Article(id4, "text4", "bla bla bla 4"));
        UUID id5 = UUID.randomUUID();
        articleMap.put(id5, new Article(id5, "text5", "bla bla bla 8"));
    }

}
