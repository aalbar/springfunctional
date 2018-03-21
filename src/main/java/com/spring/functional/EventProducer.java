package com.spring.functional;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.time.Duration;
import java.util.stream.Stream;

public class EventProducer {




    public static void main(String[] args) {
        List<String> elements = new ArrayList<String>();
//        Flux.just(1, 2, 3, 4)
//                .log()
//                .map(i -> i * 2)
//                .subscribe(elements::add);

        Flux.just(1, 2, 3, 4)
                .log()
                .map(i -> i * 2)
                .zipWith(Flux.range(0, Integer.MAX_VALUE),
                        (two, one) -> String.format("First Flux: %d, Second Flux: %d", one, two))
                .subscribe(elements::add);

        Stream.of(elements).forEach(System.out::println);


//        List<Long> elements2 = new ArrayList<Long>();
//        for (int i = 0; i < 50; i++) {
//            elements2.add(new Random().nextLong());
//        }
//        List<Long> elements3 = new ArrayList<Long>();
//        Disposable fromValues = Flux.fromIterable(elements2)
//                .delayElements(Duration.ofMillis(1000))
//                .log()
//                .subscribe(elements3::add);
    }
}
