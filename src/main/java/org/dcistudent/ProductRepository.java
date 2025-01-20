package org.dcistudent;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository<T> {
  List<T> products = new ArrayList<>();

  public void addProduct(T product) {
    this.products.add(product);
  }

  public Boolean removeProduct(T product) {
    return this.products.remove(product);
  }

  public List<T> getProducts() {
    return this.products;
  }
}
