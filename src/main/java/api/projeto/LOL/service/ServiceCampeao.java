package api.projeto.LOL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCampeao {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	public Product createProductById(Long id) {
		return productRepository.save(product);
	}
	
	public ServiceCampeao() {
		// TODO Auto-generated constructor stub
	}

}
