package com.wavity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	
	private List<Product> products= new ArrayList<>(Arrays.asList(
			new Product("spring", "Spring Framework", "desc"),
			new Product("core java", "core java ", " java desc"),
			new Product("html", "html Framework", " html desc")
			));
	
	public List<Product> getAllTopics(){
		return products;
	}
}
