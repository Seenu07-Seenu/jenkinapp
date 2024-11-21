package com.jenkinapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkin {
@GetMapping(value="/data")
public String get(String a) {
	return "hello world";
}
}
