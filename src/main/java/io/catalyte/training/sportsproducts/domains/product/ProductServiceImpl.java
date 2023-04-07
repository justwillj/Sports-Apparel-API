package io.catalyte.training.sportsproducts.domains.product;

import io.catalyte.training.sportsproducts.exceptions.ResourceNotFound;
import io.catalyte.training.sportsproducts.exceptions.ServerError;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * This class provides the implementation for the ProductService interface.
 */
@Service
public class ProductServiceImpl implements ProductService {

  private final Logger logger = LogManager.getLogger(ProductServiceImpl.class);

  ProductRepository productRepository;

  @Autowired
  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  /**
   * Retrieves all products from the database, optionally making use of an example if it is passed.
   *
   * @param product - an example product to use for querying
   * @return - a list of products matching the example, or all products if no example was passed
   */
  public List<Product> getProducts(Product product) {

    try {
      return productRepository.findAll(Example.of(product));
    } catch (DataAccessException e) {
      logger.error(e.getMessage());
      throw new ServerError(e.getMessage());
    }
  }

  /**
   * Retrieves the product with the provided id from the database.
   *
   * @param id - the id of the product to retrieve
   * @return - the product
   */
  public Product getProductById(Long id) {
    Product product;

    try {
      product = productRepository.findById(id).orElse(null);
    } catch (DataAccessException e) {
      logger.error(e.getMessage());
      throw new ServerError(e.getMessage());
    }

    if (product != null) {
      return product;
    } else {
      logger.info("Get by id failed, it does not exist in the database: " + id);
      throw new ResourceNotFound("Get by id failed, it does not exist in the database: " + id);
    }
  }

  /**
   * Counts the number of matching products in repository
   * @param product - example product from get request, used to filter results
   * @return Long - count of matching products
   */
    @Override
    public Long countProducts(Product product) {
       logger.info("Counting matches...");
       try {
         return productRepository.count(Example.of(product));
       } catch (DataAccessException e) {
         logger.error(e.getMessage());
         throw new ServerError(e.getMessage());
       }
    }

  /**
   * Returns a page of matching products
   * @param start - start index of what products to return
   * @param product - example product from get request, used to filter results
   * @return
   */
  @Override
  public List<Product> getProductPage(Product product, Long start) {
      Long count = countProducts(product);
      int startIndexInt = start.intValue();
      int stopIndex;
      List<Product> matchingProducts = new ArrayList<>();
      List<Product> productPage = new ArrayList<>();

      //set stopIndex to get at most 20 products per page
      if(count.intValue() - startIndexInt > 20) {
        stopIndex = startIndexInt + 20;
      } else {
        stopIndex = startIndexInt + (count.intValue() - startIndexInt);
      }

      try {
        logger.info("Building Product Page...");
        return getProducts(product).subList(startIndexInt,stopIndex);
      } catch (DataAccessException e) {
        logger.error(e.getMessage());
        throw new ServerError(e.getMessage());
      }
  }
}