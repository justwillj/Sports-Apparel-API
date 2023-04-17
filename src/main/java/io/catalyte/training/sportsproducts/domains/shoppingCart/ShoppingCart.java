package io.catalyte.training.sportsproducts.domains.shoppingCart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Shopping cart entity in database
 */
@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  Long customerId;
  Long productId;


  public ShoppingCart() {}

  public ShoppingCart(Long id, Long customerId, Long productId) {
    this.id = id;
    this.customerId = customerId;
    this.productId = productId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  @Override
  public String toString() {
    return "ShoppingCart{" +
        "id=" + id +
        ", customerId=" + customerId +
        ", productId=" + productId +
        '}';
  }
}
