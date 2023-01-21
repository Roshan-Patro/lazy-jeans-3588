package com.OnlineShoppingApp.Service;

import java.time.LocalDate;
import java.util.List;

import com.OnlineShoppingApp.DTO.AddressDTO;
import com.OnlineShoppingApp.Entity.Orders;
import com.OnlineShoppingApp.Exception.AddressException;
import com.OnlineShoppingApp.Exception.CustomerException;
import com.OnlineShoppingApp.Exception.OrdersException;

public interface OrdersService {
	
	public Orders addOrder(Orders order, Integer customerID, Integer addressId) throws OrdersException, CustomerException, AddressException;
	
	public Orders addOrderWithNewAddress(Integer customerId, AddressDTO dto, String key) throws CustomerException,OrdersException;
	
	public Orders updateOrder(Orders order) throws OrdersException;
	
	public Orders removeOrder(Integer orderId, String key) throws OrdersException;
	
	public Orders getOrderByOrderId(Integer orderId) throws OrdersException;
	
	public List<Orders> getAllOrdersByDate(LocalDate date) throws OrdersException;
	
	public List<Orders> getAllOrderByCityName(String city) throws OrdersException;
	
	public List<Orders> getAllOrdersByCustomerId(Integer customerId) throws OrdersException,CustomerException;
	
}
