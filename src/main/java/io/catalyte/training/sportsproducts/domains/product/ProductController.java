package io.catalyte.training.sportsproducts.domains.product;

import static io.catalyte.training.sportsproducts.constants.Paths.PRODUCTS_PATH;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The ProductController exposes endpoints for product related actions.
 */
@RestController
@RequestMapping(value = PRODUCTS_PATH)
public class ProductController {

  Logger logger = LogManager.getLogger(ProductController.class);

  @Autowired
  private ProductService productService;

  @GetMapping
  public ResponseEntity<List<Product>> getProducts(Product product) {
    logger.info("Request received for getProducts");

    return new ResponseEntity<>(productService.getProducts(product), HttpStatus.OK);
  }

  @GetMapping(value = "/{id}")
  @ResponseStatus(value = HttpStatus.OK)
  public ResponseEntity<Product> getProductById(@PathVariable Long id) {
    logger.info("Request received for getProductsById: " + id);

    return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
  }

  /**
   * This get returns the count for how many products match the example product
   * @param product - example product
   * @return  Long - count of matching products
   */
  @GetMapping("/count")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Long> countProducts(Product product) {
    logger.info("Request received for countProducts");

    return new ResponseEntity<>(productService.countProducts(product), HttpStatus.OK);
  }

  /**
   * This get returns a List of at most 20 products
   * @param start - startIndex to determine where to start getting products
   * @param product - example product to filter return List
   * @return List<Product> - List of at most 20 filtered products
   */
  @GetMapping("/productPage/{start}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<List<Product>> getProductPage(@PathVariable("start") Long start, Product product) {
    logger.info("Request received for product page");

    //sets up empty product for empty query
    if(!(product != null)) {
      product = new Product();
    }
    return new ResponseEntity<>(productService.getProductPage(product, start), HttpStatus.OK);
  }
}
