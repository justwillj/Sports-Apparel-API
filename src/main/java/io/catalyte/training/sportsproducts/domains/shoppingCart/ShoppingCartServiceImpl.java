package io.catalyte.training.sportsproducts.domains.shoppingCart;

import io.catalyte.training.sportsproducts.auth.GoogleAuthService;
import io.catalyte.training.sportsproducts.domains.user.UserController;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * Implements user service interface
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LogManager.getLogger(UserController.class);

  private final ShoppingCartRepository shoppingCartRepository;
  private final GoogleAuthService googleAuthService;

  @Autowired
  public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository,
      GoogleAuthService googleAuthService) {
    this.shoppingCartRepository = shoppingCartRepository;
    this.googleAuthService = googleAuthService;
  }

  // METHODS

  /**
   * Retrieves all rooms from the database.
   *
   * @return a list of all rooms.
   */
  @Override
  public List<ShoppingCart> getAll() {
    List<ShoppingCart> shoppingCartList = new ArrayList<>();

    try {
      shoppingCartList = shoppingCartRepository.findAll();
    } catch (DataAccessException e) {
      logger.error(e.getMessage());
    }

    return shoppingCartList.stream()
        .sorted(Comparator.comparing(ShoppingCart::getId))
        .collect(Collectors.toList());
  }


  /**
   * Persists a new room to the database.
   *
   * @param roomType the room object to persist
   * @return the persisted room
   */
  @Override
  public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {
    ShoppingCart postedShoppingCart = null;

    try {
      postedShoppingCart = shoppingCartRepository.save(shoppingCart);
    } catch (DataAccessException e) {
      logger.error(e.getMessage());
    }

    return postedShoppingCart;
  }


}
