package com.example.efoodbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.efoodbackend.dto.ItemFromCartDTO;
import com.example.efoodbackend.model.OrderItem;

@Service
public interface OrderItemService {
	
	OrderItem save(OrderItem orderItem);
	List<OrderItem> findAll();
	List<OrderItem> getOrderItemsByFinalOrderId(Long finalOrderId);
	List<ItemFromCartDTO> getItemFromCartByFinalOrderId(Long finalOrderId);

}
