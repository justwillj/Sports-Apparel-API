package io.catalyte.training.sportsproducts.data;

import io.catalyte.training.sportsproducts.domains.product.Product;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * This class provides tools for random generation of products.
 */
public class ProductFactory {

  private static final String[] colors = {
      "#000000", // white
      "#ffffff", // black
      "#39add1", // light blue
      "#3079ab", // dark blue
      "#c25975", // mauve
      "#e15258", // red
      "#f9845b", // orange
      "#838cc7", // lavender
      "#7d669e", // purple
      "#53bbb4", // aqua
      "#51b46d", // green
      "#e0ab18", // mustard
      "#637a91", // dark gray
      "#f092b0", // pink
      "#b7c0c7"  // light gray
  };
  private static final String[] names = {
          "Retro",
          "Professional Athlete Franchise",
          "Bland",
          "Good Gear"
  };
  private static final String[] demographics = {
      "Men",
      "Women",
      "Kids",
      "Pets"
  };
  private static final String[] description = {
          "Moisture wicking technology",
          "Stylish, yet rugged and versatile",
          "Extra durable construction"
  };
  private static final String[] categories = {
      "Golf",
      "Soccer",
      "Basketball",
      "Hockey",
      "Football",
      "Running",
      "Baseball",
      "Skateboarding",
      "Boxing",
      "Weightlifting",
      "Swimming",
      "Pet"
  };
  private  static  final String[] teamSportCategories = {
      "Golf",
      "Soccer",
      "Basketball",
      "Hockey",
      "Football",
      "Baseball"
  };
  private static final String[] soloSportCategories = {
      "Running",
      "Skateboarding",
      "Boxing",
      "Weightlifting"
  };
  private static final String[] recreation = {
      "Swimming"
  };
  private static final String[] adjectives = {
      "Lightweight",
      "Slim",
      "Shock Absorbing",
      "Exotic",
      "Elastic",
      "Fashionable",
      "Trendy",
      "Next Gen",
      "Colorful",
      "Comfortable",
      "Water Resistant",
      "Wicking",
      "Heavy Duty"
  };
  private static final String[] types = {
      "Pant",
      "Short",
      "Shoe",
      "Glove",
      "Jacket",
      "Tank Top",
      "Sock",
      "Sunglasses",
      "Hat",
      "Helmet",
      "Belt",
      "Visor",
      "Shin Guard",
      "Elbow Pad",
      "Headband",
      "Wristband",
      "Hoodie",
      "Flip Flop",
      "Pool Noodle",
      "Squeak-toy",
      "Bed"
  };
  private static final String[] clothing = {
          "Pant",
          "Short",
          "Jacket",
          "Tank Top",
          "Sock",
          "Hoodie",
          "Shoe",
          "Belt",
          "Visor"
  };
  private static final String[] accessories = {
          "Hat",
          "Headband",
          "Wristband",
          "Glove",
          "Sunglasses",

  };
  private static final String[] outdoorWear = {
          "Flip Flop",
          "Pool Noodle"
  };
  private static final String[] forPets = {
          "Squeak-toy",
          "Bed"
  };
  private static final String[] breed = {
      "Dog",
      "Cat",
      "Other"
  };

  /**
   * Returns a random demographic from the list of demographics.
   *
   * @return - a demographic string
   */
  public static String getNames() {
    Random randomGenerator = new Random();
    return names[randomGenerator.nextInt(names.length)];
  }
  public static String getDemographic() {
    Random randomGenerator = new Random();
    return demographics[randomGenerator.nextInt(demographics.length)];
  }
  public static String getRecreation() {
    Random randomGenerator = new Random();
    return recreation[randomGenerator.nextInt(recreation.length)];
  }
//  public static String getPet() {
//    Random randomGenerator = new Random();
//    Predicate<String> isPet = Predicate.isEqual("Pets");
//    List<String> pet = new ArrayList<>((Collection) Arrays.stream(demographics).filter(isPet));
//    return pet.get(0);
//  }
  public static String getDescription() {
    Random randomGenerator = new Random();
    return description[randomGenerator.nextInt(description.length)];
  }
  public static String getCategories() {
    Random randomGenerator = new Random();
    return categories[randomGenerator.nextInt(categories.length)];
  }
  public static String getTypes() {
    Random randomGenerator = new Random();
    return types[randomGenerator.nextInt(types.length)];
  }
  public static String getBreed() {
    Random randomGenerator = new Random();
    return breed[randomGenerator.nextInt(breed.length)];
  }
  public static String getForPets() {
    Random randomGenerator = new Random();
    return forPets[randomGenerator.nextInt(forPets.length)];
  }
  public static String getTeamSportCategories() {
    Random randomGenerator = new Random();
    return teamSportCategories[randomGenerator.nextInt(teamSportCategories.length)];
  }
  public static String getSoloSportCategories() {
    Random randomGenerator = new Random();
    return soloSportCategories[randomGenerator.nextInt(soloSportCategories.length)];
  }
  public static String getClothing() {
    Random randomGenerator = new Random();
    return clothing[randomGenerator.nextInt(clothing.length)];
  }
  public static String getAccessories() {
    Random randomGenerator = new Random();
    return accessories[randomGenerator.nextInt(accessories.length)];
  }
  public static String getOutdoorWear() {
    Random randomGenerator = new Random();
    return outdoorWear[randomGenerator.nextInt(outdoorWear.length)];
  }
  /**
   * Generates a random product offering id.
   *
   * @return - a product offering id
   */
  public static String getRandomProductId() {
    return "po-" + RandomStringUtils.random(7, false, true);
  }

  /**
   * Generates a random style code.
   *
   * @return - a style code string
   */
  public static String getStyleCode() {
    return "sc" + RandomStringUtils.random(5, false, true);
  }

  /**
   * Finds a random date between two date bounds.
   *
   * @param startInclusive - the beginning bound
   * @param endExclusive   - the ending bound
   * @return - a random date as a LocalDate
   */
  private static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
    long startEpochDay = startInclusive.toEpochDay();
    long endEpochDay = endExclusive.toEpochDay();
    long randomDay = ThreadLocalRandom
        .current()
        .nextLong(startEpochDay, endEpochDay);

    return LocalDate.ofEpochDay(randomDay);
  }


  /**
   * Generates a number of random products based on input.
   *
   * @param numberOfProducts - the number of random products to generate
   * @return - a list of random products
   */
  public List<Product> generateRandomProducts(Integer numberOfProducts) {

    List<Product> productList = new ArrayList<>();

    for (int i = 0; i < numberOfProducts; i++) {
      productList.add(createRandomProduct());
    }

    return productList;
  }

  /**
   * Uses random generators to build a product.
   *
   * @return - a randomly generated product
   */
  Boolean filterProduct(String a, String[] b) {
   Predicate<String> isA = Predicate.isEqual(a);
   Boolean isMatch = Arrays.stream(b).anyMatch(isA);
   return isMatch;
  }
  double oddOrEven() {
    double isEven = Math.round(Math.random());
    return isEven;
  }
  public Product createRandomProduct() {
    Product product = new Product();
    String demographic = ProductFactory.getDemographic();
    String description = ProductFactory.getDescription();
    String category = ProductFactory.getCategories();
    String type = ProductFactory.getTypes();
    String name = ProductFactory.getNames();
    String breed = ProductFactory.getBreed();
    String teamSport = ProductFactory.getTeamSportCategories();
    String soloSport = ProductFactory.getSoloSportCategories();
    String recreate = ProductFactory.getRecreation();
    String cloths = ProductFactory.getClothing();
    String accessory = ProductFactory.getAccessories();
    String outdoor = ProductFactory.getOutdoorWear();
    String pet = ProductFactory.getForPets();
//    product.setCategory("Running");
//    product.setType("Short");
    product.setName(name);
    if (demographic != "Pets") {
      if(filterProduct(category, teamSportCategories)) {
        product.setCategory(teamSport);
        product.setType(cloths);
        product.setDemographic(demographic);
        product.setDescription(description);
        product.setGlobalProductCode(ProductFactory.getRandomProductId());
        product.setStyleNumber(ProductFactory.getStyleCode());
      }
      if (filterProduct(category, soloSportCategories)) {
        if(oddOrEven()%2 != 0) {
          product.setType(cloths);
        } else {
          product.setType(accessory);
        }
        product.setCategory(soloSport);
        product.setDemographic(demographic);
        product.setDescription(description);
        product.setGlobalProductCode(ProductFactory.getRandomProductId());
        product.setStyleNumber(ProductFactory.getStyleCode());
      }
      if (filterProduct(category, recreation)) {
        product.setCategory(recreate);
        product.setType(outdoor);
        product.setDemographic(demographic);
        product.setDescription(description);
        product.setGlobalProductCode(ProductFactory.getRandomProductId());
        product.setStyleNumber(ProductFactory.getStyleCode());
      }
    }else{
      product.setDemographic(demographic);
      product.setCategory("Pet");
      product.setType(pet);
      product.setDescription(description);
      product.setGlobalProductCode(ProductFactory.getRandomProductId());
      product.setStyleNumber(ProductFactory.getStyleCode());
    }
//    product.setType(type);
//    product.setCategory(category);
//    product.setDemographic(demographic);
//    product.setDescription(description);
//    product.setGlobalProductCode(ProductFactory.getRandomProductId());
//    product.setStyleNumber(ProductFactory.getStyleCode());
//    product.setBreed(breed);

    return product;
  }

}