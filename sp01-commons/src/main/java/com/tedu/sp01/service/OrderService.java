package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 获取订单数据
	 * @param orderId 订单id
	 * @return 订单信息
	 */
	Order getOrder(String orderId);
	/**
	 * 保存订单
	 * @param order
	 */
	void addOrder(Order order);
}
