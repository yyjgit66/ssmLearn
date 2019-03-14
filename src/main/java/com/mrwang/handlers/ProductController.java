package com.mrwang.handlers;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mrwang.beans.Details;
import com.mrwang.beans.Product;
import com.mrwang.beans.ProductVo;
import com.mrwang.service.ProductService;
import com.mrwang.utils.Page;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	@Qualifier("productServiceImpl")
	private  ProductService service;

	/**
	 * 查询所有产品
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/productAll.do")
	public String selectProduct(Product pr,ProductVo po,HttpServletRequest request, HttpServletResponse response, 
			                   Integer currentPage,Integer bistinguishBetween,Integer rowNo) throws Exception {
		Page<Product> page = service.selectProduct(po);
		request.setAttribute("page",page);
		return "index";
	}
	
	
	/**
	 * 根据详情id查询详情信息
	 * @return
	 */
	@RequestMapping("/detils.do")
	public String selectDetils(@RequestParam(value = "productDetailsId") String productDetailsId,HttpServletRequest request){
		Details detail = service.selectDetils(productDetailsId);
		request.setAttribute("detail",detail);
		return "detailsProdect";
	}
	
	/**
	 * 我的购物车
	 * @return
	 */
	@RequestMapping("/myShoppingCart.do")
	public String myShoppingCart(){
		return "shoppingCart";
	}
	 
	/**
	 * 加入购物车
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/addShoppingCart.do")
	@ResponseBody
	public JSONObject addShoppingCart(@RequestParam(value = "detailsId",required = false) String detailsId,HttpServletRequest request,HttpServletResponse response) throws IOException{
		int count = 	service.addShoppingCart(detailsId); 
		JSONObject js = new JSONObject();
		js.put("count", count); 
	    return js;
			
 
	}
}
