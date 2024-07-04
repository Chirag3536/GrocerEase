package com.chirag.service;

import java.util.List;

import com.chirag.Exception.CartException;
import com.chirag.Exception.OrderException;
import com.chirag.Exception.RestaurantException;
import com.chirag.Exception.UserException;
import com.chirag.model.Order;
import com.chirag.model.PaymentResponse;
import com.chirag.model.User;
import com.chirag.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
