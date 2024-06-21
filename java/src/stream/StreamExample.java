package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Product product = new Product(i, "상품" + i, "회사", (int) (10000 * Math.random()));
            list.add(product);
        }

        Stream<Product> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
