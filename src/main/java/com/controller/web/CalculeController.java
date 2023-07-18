package com.controller.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calcule")
public class CalculeController {
	Calcule c=new Calcule();
@PostMapping("somme")
public String calculesomme(@RequestParam int x,@RequestParam int y)
{
	return "la somme est: "+c.somme(x, y); 
}
	@PostMapping("produit")
	public String calculeProduit(@RequestParam int x,@RequestParam int y)
	{
		return "le produit est: "+c.produit(x, y); 
	}
	@GetMapping("fact")
	public String calculeFacto(@RequestParam int x)
	{
		return "la factoriel est: "+c.fact(x);
	}
	
}
