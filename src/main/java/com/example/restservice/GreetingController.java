package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController

public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greetings")
    public Greetings receiveArrayOfValues(@RequestParam String[] values)
    {
        return new Greetings(counter.incrementAndGet(), new String ("abc"), values);
    }
    @GetMapping("/greetingArray")
    public Greetings testArrayOfValues(@RequestParam List<String> values)
    {
        return new Greetings(counter.incrementAndGet(), new String ("abc"), values);
    }

    @GetMapping("/greetinglist")
    public Greetings testArrayOfValuestoList(@RequestParam List<String> values)
    {
        return new Greetings(counter.incrementAndGet(), new String ("abc"), values);
    }




}
