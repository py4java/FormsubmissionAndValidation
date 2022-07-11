package com.fav.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.fav.form.ProductForm;

@Component
public class ProductFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		if (clazz.isAssignableFrom(ProductForm.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		ProductForm form = (ProductForm) target;

		if (form.getProductName() == null || form.getProductName().trim().length() == 0) {
			errors.rejectValue("productName", "productName.blank");
		}

		if (form.getManufacturer() == null || form.getManufacturer().trim().length() == 0) {
			errors.rejectValue("manufacturer", "manufacturer.blank");
		}

		if (form.getWarrantyMonths() <= 0 || form.getWarrantyMonths() > 10) {
			errors.rejectValue("warrantyMonths", "warrantyMonths.invalid");
		}

		if (form.getPrice() <= 0 || form.getPrice() > 99999) {
			errors.rejectValue("price", "price.invalid");
		}
	}

}
