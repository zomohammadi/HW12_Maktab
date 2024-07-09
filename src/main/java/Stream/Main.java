package Stream;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<String> list = new ArrayList<>();
        IntStream.range(0, 30).forEach(i -> list.add(i, faker.name().firstName()));
        System.out.println("my list: " + list);
        System.out.println("-------------------------------------");
        //------------------------
        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
        map.entrySet().forEach((v) -> System.out.println(v.getValue()));
        System.out.println("-------------------------------------");
        map.forEach((k, v) -> System.out.println(k + "->" + v));
        //------------------------


    }
}
