package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.repository.ShopRepository;

public class ProductRepositoryTest {
    ShopRepository repo = new ShopRepository();
    Product product1 = new Product(11, "Product1", 70);
    Product product2 = new Product(22, "Product 2", 150);
    Product product3 = new Product(33, "Product 3", 170);
    Product product4 = new Product(44, "Product 4", 350);
    Product product5 = new Product(55, "Product 5", 15);
    Product product6 = new Product(66, "Product 6", 1000);

    @Test
    public void shouldAddProduct() {
        Product newProduct = new Product(77, "New Product", 410);
        repo.add(newProduct);
        Product[] expected = {newProduct};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldExceptionRemoveById() {
        Assertions.assertThrows(NotFoundException.class, () -> {repo.removeById(25);});
    }

    @Test
    public void shouldSaveProduct() {
        Product[] expected = {};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}