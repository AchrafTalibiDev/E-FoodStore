package com.example.efoodbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.efoodbackend.dto.FinalOrderDTO;
import com.example.efoodbackend.dto.FinalOrderIdAndStatusDTO;
import com.example.efoodbackend.dto.OrderItemDTO;
import com.example.efoodbackend.model.FinalOrder;

@Service
public interface FinalOrderService {
	
	FinalOrder save(FinalOrder finalOrder);
	Long makeFinalOrder(OrderItemDTO orderItemDTO);
	FinalOrder findOne(Long id);
	List<FinalOrderDTO> getAllActiveFinalOrders();
	List<FinalOrderDTO> getAllDeliveredFinalOrders();
	String setFinalOrderToDelivered(Long finalOrderId);
	List<FinalOrderDTO> getAllMyActiveFinalOrders(Long currentUserId);
	List<FinalOrderDTO> getAllMyDeliveredFinalOrders(Long currentUserId);
	String changeFinalOrderStatus (FinalOrderIdAndStatusDTO foIdStatus);
	String delete(Long finalOrderId);

}
