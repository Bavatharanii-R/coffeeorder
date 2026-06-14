package com.example.coffeeorder;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    private List<CoffeeOrder> orders = new ArrayList<>();
    private int idCounter = 1;
    public CoffeeOrder orderCoffe(CoffeeOrder order) {
        order.setId(idCounter++);
        orders.add(order);
        return order;
    }
    public List<CoffeeOrder> getOrders(){
        return orders;
    }
}
