package io.catalyte.training.sportsproducts.domains.advert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * This class is a representation of a sports apparel advert.
 */
@Entity
public class Advert {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String description;

  private String demographic;

  private String category;

  private String type;

  private String releaseDate;

  private String primaryColorCode;

  private String secondaryColorCode;

  private String styleNumber;

  private String globalProductCode;

  private Boolean active;

  private String imageURL;

  private Integer discount;

  private BigDecimal price;

  public Advert() {
  }

  public Advert(String name, String description,
                String demographic, String category,
                String type, String releaseDate) {
    this.name = name;
    this.description = description;
    this.demographic = demographic;
    this.category = category;
    this.type = type;
    this.releaseDate = releaseDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDemographic() {
    return demographic;
  }

  public void setDemographic(String demographic) {
    this.demographic = demographic;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getPrimaryColorCode() {
    return primaryColorCode;
  }

  public void setPrimaryColorCode(String primaryColorCode) {
    this.primaryColorCode = primaryColorCode;
  }

  public String getSecondaryColorCode() {
    return secondaryColorCode;
  }

  public void setSecondaryColorCode(String secondaryColorCode) {
    this.secondaryColorCode = secondaryColorCode;
  }

  public String getStyleNumber() {
    return styleNumber;
  }

  public void setStyleNumber(String styleNumber) {
    this.styleNumber = styleNumber;
  }

  public String getGlobalProductCode() {
    return globalProductCode;
  }

  public void setGlobalProductCode(String globalProductCode) {
    this.globalProductCode = globalProductCode;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public String getImageURL() { return imageURL; }

  public void setImageURL(String imageURL) { this.imageURL = imageURL; }

  public Integer getDiscount() { return discount; }

  public void setDiscount(Integer discount) { this.discount = discount; }

  public BigDecimal getPrice() { return price; }

  public void setPrice(BigDecimal price) { this.price = price; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Advert advert = (Advert) o;

    if (name != null ? !name.equals(advert.name) : advert.name != null) {
      return false;
    }
    if (description != null ? !description.equals(advert.description)
        : advert.description != null) {
      return false;
    }
    if (demographic != null ? !demographic.equals(advert.demographic)
        : advert.demographic != null) {
      return false;
    }
    if (category != null ? !category.equals(advert.category) : advert.category != null) {
      return false;
    }
    if (type != null ? !type.equals(advert.type) : advert.type != null) {
      return false;
    }
    if (releaseDate != null ? !releaseDate.equals(advert.releaseDate)
        : advert.releaseDate != null) {
      return false;
    }
    if (primaryColorCode != null ? !primaryColorCode.equals(advert.primaryColorCode)
        : advert.primaryColorCode != null) {
      return false;
    }
    if (secondaryColorCode != null ? !secondaryColorCode.equals(advert.secondaryColorCode)
        : advert.secondaryColorCode != null) {
      return false;
    }
    if (styleNumber != null ? !styleNumber.equals(advert.styleNumber)
        : advert.styleNumber != null) {
      return false;
    }
    if (globalProductCode != null ? !globalProductCode.equals(advert.globalProductCode)
        : advert.globalProductCode != null) {
      return false;
    }
    if (imageURL != null ? !imageURL.equals(advert.imageURL) : advert.imageURL != null) {
      return false;
    }
    if (discount != null ? !discount.equals(advert.discount) : advert.discount != null) {
      return false;
    }
    if (price != null ? !price.equals(advert.price) : advert.price != null) {
      return false;
    }
    return active != null ? active.equals(advert.active) : advert.active == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (demographic != null ? demographic.hashCode() : 0);
    result = 31 * result + (category != null ? category.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
    result = 31 * result + (primaryColorCode != null ? primaryColorCode.hashCode() : 0);
    result = 31 * result + (secondaryColorCode != null ? secondaryColorCode.hashCode() : 0);
    result = 31 * result + (styleNumber != null ? styleNumber.hashCode() : 0);
    result = 31 * result + (globalProductCode != null ? globalProductCode.hashCode() : 0);
    result = 31 * result + (active != null ? active.hashCode() : 0);
    result = 31 * result + (imageURL != null ? imageURL.hashCode() : 0);
    result = 31 * result + (discount != null ? discount.hashCode() : 0);
    result = 31 * result + (price != null ? price.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Advert{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", demographic='" + demographic + '\'' +
            ", category='" + category + '\'' +
            ", type='" + type + '\'' +
            ", releaseDate='" + releaseDate + '\'' +
            ", primaryColorCode='" + primaryColorCode + '\'' +
            ", secondaryColorCode='" + secondaryColorCode + '\'' +
            ", styleNumber='" + styleNumber + '\'' +
            ", globalProductCode='" + globalProductCode + '\'' +
            ", active=" + active +
            ", imageURL='" + imageURL + '\'' +
            ", discount=" + discount +
            ", price=" + price +
            '}';
  }
}
