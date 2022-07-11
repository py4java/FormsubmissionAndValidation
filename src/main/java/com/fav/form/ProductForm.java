package com.fav.form;

public class ProductForm {

	protected String productName;
	protected String description;
	protected String manufacturer;
	protected int warrantyMonths;
	protected double price;

	public ProductForm() {
	}

	public ProductForm(String productName, String description, String manufacturer, int warrantyMonths, double price) {
		this.productName = productName;
		this.description = description;
		this.manufacturer = manufacturer;
		this.warrantyMonths = warrantyMonths;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getWarrantyMonths() {
		return warrantyMonths;
	}

	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductForm [productName=" + productName + ", description=" + description + ", manufacturer="
				+ manufacturer + ", warrantyMonths=" + warrantyMonths + ", price=" + price + "]";
	}

}
