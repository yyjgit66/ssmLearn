package com.mrwang.service;

import com.mrwang.beans.Product;
import com.mrwang.beans.ProductVo;
import com.mrwang.beans.Details;
import com.mrwang.utils.Page;

public interface ProductService {

	Page<Product> selectProduct(ProductVo po);

	Details selectDetils(String productDetailsId);
	
	int addShoppingCart(String detailsId); 
}