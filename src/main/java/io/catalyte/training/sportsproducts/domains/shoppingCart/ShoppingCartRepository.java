package io.catalyte.training.sportsproducts.domains.shoppingCart;

import io.catalyte.training.sportsproducts.domains.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User repository
 */
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {


}
