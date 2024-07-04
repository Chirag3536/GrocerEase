package com.chirag.service;

import com.chirag.Exception.CartException;
import com.chirag.Exception.CartItemException;
import com.chirag.Exception.FoodException;
import com.chirag.Exception.UserException;
import com.chirag.model.Cart;
import com.chirag.model.CartItem;
import com.chirag.model.Food;
import com.chirag.model.User;
import com.chirag.request.AddCartItemRequest;
import com.chirag.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
