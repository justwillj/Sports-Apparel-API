package io.catalyte.training.sportsproducts.domains.shoppingCart;

import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

  private final Logger logger = LoggerFactory.getLogger(ShoppingCartService.class);

  @Autowired
  private ShoppingCartService shoppingCartService;

  /**
   * This method retrieves all roomtypes from the database
   *
   * @return a collection of roomtypes and 200 status codes
   * @throws Exception
   */
  @GetMapping
  public ResponseEntity<List<ShoppingCart>> getAllShoppingCart() {
    logger.info(" Get all request received");
    return new ResponseEntity<>(shoppingCartService.getAll(), HttpStatus.OK);
  }

//  /**
//   * This method retrieves a single roomtype from the database
//   *
//   * @return a roomtype by the id provided and 200 status code
//   * @throws Exception
//   */
//  @GetMapping("/{id}")
//  public ResponseEntity<RoomType> getRoomTypeById(@PathVariable Long id) {
//    logger.info(" Get all request received");
//    return new ResponseEntity<>(roomTypeService.getById(id), HttpStatus.OK);
//  }

  /**
   * This method creates a new roomtype record and saves it to the database
   *
   * @param shoppingCart to be created
   * @return created roomtype and 201 status code
   * @throws Exception
   */
  @PostMapping
  public ResponseEntity<ShoppingCart> createShoppingCart(@Valid @RequestBody ShoppingCart shoppingCart) {
    logger.info(" Post request received");
    return new ResponseEntity<>(shoppingCartService.createShoppingCart(shoppingCart), HttpStatus.CREATED);
  }

//  /**
//   * This method updates an existing roomtype record
//   *
//   * @param id       of the roomtype to be updated
//   * @param roomType updated roomtype information
//   * @return updated roomtype and 200 status code
//   * @throws Exception
//   */
//  @PutMapping("/{id}")
//  public ResponseEntity<RoomType> updateRoomType(
//      @PathVariable Long id, @Valid @RequestBody RoomType roomType) {
//    logger.info(" Put request received");
//    return new ResponseEntity<>(roomTypeService.updateRoom(id, roomType), HttpStatus.OK);
//  }
}
