package io.catalyte.training.sportsproducts.domains.shoppingCart;

import io.catalyte.training.sportsproducts.domains.user.User;
import java.util.List;

/**
 * This interface provides an abstraction layer for the ShoppingCart Service
 */
public interface ShoppingCartService {

  List<ShoppingCart> getAll();

  ShoppingCart createShoppingCart(ShoppingCart shoppingCart);
}
