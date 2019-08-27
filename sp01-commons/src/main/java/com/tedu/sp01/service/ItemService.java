package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 通过订单ID获取商品列表
	 * @param orderId 订单ID
	 * @return 商品列表
	 */
	List<Item> getItems(String orderId);
	/**
	 * 减少商品库存
	 * @param list 商品列表
	 */
	void decreaseNumbers(List<Item> list);
}
