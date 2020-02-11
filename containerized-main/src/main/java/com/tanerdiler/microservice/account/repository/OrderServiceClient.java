package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Repository
@FeignClient("containerized-orders")
public interface OrderServiceClient
{
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/orders/{orderId}")
	Order findById(@PathVariable("orderId") Integer orderId);

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/orders")
	List<Order> findAll();
}
