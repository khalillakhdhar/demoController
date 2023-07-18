package com.controller.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("hello")
public String sayHello()
{
return "hello spring";	
}
@PostMapping("hello")
public String postHello()
{
return "hello world";	
}
@GetMapping
public String sayHi()
{
return "I am the spring";	
}
@GetMapping("/api")

public String getFoos(@RequestParam(required = false) String id) { 
	return "ID: " +id;
}
@PostMapping("/api")
public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam
String name) {
return "ID: " + fooId + " Name: " + name;
}
}
