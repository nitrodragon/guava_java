package com.nitrodragon.fluentiterable;

import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.nitrodragon.beans.Car;

import java.util.List;

public class GuavaFluentIterable {

      public static void main(String[] args) {
        List<Car> cars = Lists.newArrayList(new Car(1, "Audi", 52642),
                new Car(2, "Mercedes", 57127),
                new Car(3, "Toyota", 9000),
                new Car(4, "Volvo", 29000));

        Predicate<Car> byPrice = car -> car.getPrice() <= 30000;

        List<String> results = FluentIterable.from(cars).filter(byPrice)
                .transform(Functions.toStringFunction()).toList();

        System.out.println(results);
    }
}