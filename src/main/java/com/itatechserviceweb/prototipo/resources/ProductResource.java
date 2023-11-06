package com.itatechserviceweb.prototipo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itatechserviceweb.prototipo.entities.Product;
import com.itatechserviceweb.prototipo.services.ProductService;

@RestController
@RequestMapping(value = "/users")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> List = service.findAll();
		return ResponseEntity.ok().body(List);
	}
	
	@GetMapping(value = "/(id)")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
