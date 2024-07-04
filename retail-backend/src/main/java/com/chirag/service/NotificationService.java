package com.chirag.service;

import java.util.List;

import com.chirag.model.Notification;
import com.chirag.model.Order;
import com.chirag.model.Restaurant;
import com.chirag.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
