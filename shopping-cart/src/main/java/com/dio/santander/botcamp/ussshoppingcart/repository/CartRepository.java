package com.dio.santander.botcamp.ussshoppingcart.repository;

import com.dio.santander.botcamp.ussshoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
