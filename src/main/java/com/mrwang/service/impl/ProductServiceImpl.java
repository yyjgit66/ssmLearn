package com.mrwang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrwang.beans.Details;
import com.mrwang.beans.Product;
import com.mrwang.beans.ProductDetails;
import com.mrwang.beans.ProductVo;
import com.mrwang.dao.ProductDao;
import com.mrwang.service.ProductService;
import com.mrwang.utils.Page;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {
	@Resource(name="productDao")
	private ProductDao dao;
	@Transactional
	public Page<Product> selectProduct(ProductVo po){
		
		po.setStart((po.getPage()-1)*po.getRows());
		
		Integer count = dao.selectCountProduct();
		
		List<Product>  products =  dao.selectProduct(po);
		
		Page<Product> page = new Page<Product>(count,po.getPage(),po.getRows(),products);
	   return page;
	
	}
	
	@Transactional
	public Details selectDetils(String productDetailsId) {
		Details detail = dao.selectDetils(productDetailsId);
		if(detail.getImgsId()>0){
			ProductDetails productDetails = dao.selectProductDetils(detail.getImgsId());
			detail.setPd(productDetails);
		}
		
		return detail;
	}

	@Override
	public int addShoppingCart(String detailsId) { 
		int count = 0; 
		if("detailsId".equals(detailsId)){
			count = dao.selectCartCount();
		}else{
			dao.addShoppingCart(detailsId);
			count = dao.selectCartCount();
		}
		return count;
	}

}
