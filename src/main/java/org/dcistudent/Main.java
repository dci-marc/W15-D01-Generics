package org.dcistudent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
  public static void main(String[] args) {
    new Main();
  }

  public Main() {
    Main.task1();
    Main.task2();
    Main.task3();
    Main.task4();
    Main.bonus();
  }

  private static void task1() {
    Pair<Integer, String> pair = new Pair<>(1, "one");
    System.out.println(pair);

    System.out.println("--------------------------------------------------");
  }

  private static void task2() {
    NumberStats<Integer> numberStats = new NumberStats<>();
    Integer[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Average: " + numberStats.calculateAverage(numbers));
    System.out.println("Max: " + numberStats.findMax(numbers));

    System.out.println("--------------------------------------------------");
  }

  private static void task3() {
    Main.printList(List.of(1, 2, 3, 4, 5));
    Main.printList(List.of("one", "two", "three", "four", "five"));

    System.out.println("--------------------------------------------------");
  }

  private static void task4() {
    ProductRepository<Product> productRepository = new ProductRepository<>();
    productRepository.addProduct(new Product(UUID.randomUUID().toString(), "one"));
    productRepository.addProduct(new Product(UUID.randomUUID().toString(), "two"));
    productRepository.addProduct(new Product(UUID.randomUUID().toString(), "three"));
    productRepository.addProduct(new Product(UUID.randomUUID().toString(), "four"));
    productRepository.addProduct(new Product(UUID.randomUUID().toString(), "five"));

    List<Product> products = productRepository.getProducts();
    for (Product product : products) {
      System.out.println(product);
    }

    System.out.println("--------------------------------------------------");
  }

  private static void bonus() {
    Sortable<String> stringSorter = new StringSorter();
    List<String> strings = new ArrayList<>();

    strings.add("Apple");
    strings.add("Banana");
    strings.add("Cherry");
    strings.add("Strawberry");
    strings.add("Pineapple");
    strings.add("Orange");

    stringSorter.sort(strings);
    Main.printList(strings);

    System.out.println("--------------------------------------------------");
  }

  private static void printList(List<?> list) {
    for (Object o : list) {
      System.out.println(o);
    }
  }
}