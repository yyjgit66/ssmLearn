package com.mrwang.dao;

import java.util.List;

import com.mrwang.beans.Details;
import com.mrwang.beans.Product;
import com.mrwang.beans.ProductDetails;
import com.mrwang.beans.ProductVo;

public interface ProductDao {
	/**
	 * 查询分页列表
	 * @param pageNumber
	 * @return
	 */
	List<Product> selectProduct(ProductVo po);
	/**
	 * 查询总记录数
	 * @param po
	 * @return
	 */
	Integer selectCountProduct();
	
	/**
	 *根据详情id查询详情 
	 * @param productDetailsId
	 * @return
	 */
	Details selectDetils(String productDetailsId);
	
	/**
	 *查询产品细节图片
	 * @param productDetailsId
	 * @return
	 */
	ProductDetails selectProductDetils(int imgId);
	
	/**
	 * 商品加入购物车
	 * @param detailsId
	 */
	void addShoppingCart(String detailsId);
	
	/**
	 * 获取购物车所有商品
	 * @return
	 */
	int selectCartCount();
 
}
