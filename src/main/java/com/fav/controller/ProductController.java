package com.fav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fav.form.ProductForm;
import com.fav.validator.ProductFormValidator;

@Controller
@RequestMapping("/add-product.htm")
public class ProductController {

	@Autowired
	private ProductFormValidator productFormValidator;

	@GetMapping
	public String showAddProductPage(ModelMap map) {
		ProductForm productForm = new ProductForm();
		map.addAttribute("addProductForm", productForm);
		return "add-product";
	}

	@PostMapping
	public String addProduct(@ModelAttribute("addProductForm") ProductForm productForm, BindingResult errors,
			ModelMap modelMap) {
		if (productFormValidator.supports(productForm.getClass())) {
			productFormValidator.validate(productForm, errors);
			if (errors.hasErrors()) {
				return "add-product";
			}
		}
		modelMap.addAttribute("productName", productForm.getProductName());
		return "add-product-success";
	}
}
