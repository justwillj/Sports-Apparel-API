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
  private  static  final String[] nonPaddedSportCategories = {
      "Golf",
      "Baseball",
      "Boxing",

  };
  private static final String[] weightliftingSport= {
      "Weightlifting",
  };
  private static final String[] runningSport = {
          "Running"
  };
  private  static  final String[] paddedSportCategories = {
          "Hockey",
          "Football",
          "Skateboarding",
  };
  private static final String[] footSports = {
          "Soccer",
  };
  private static final String[] handSports = {
          "Basketball",
  };

  private static final String[] water = {
      "Swimming"
  };
  private static final String[] petDept = {
          "Pet"
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
  private static final String[] contactApparel = {
          "Pant",
          "Short",
          "Sock",
          "Shoe",
          "Helmet",
          "Shin Guard",
          "Elbow Pad",
  };
  private static final String[] soloApparel = {
          "Glove",
          "Shoe",
          "Sock",
          "Hat",
  };
  private static final String[] weightliftingApparel = {
          "Glove",
          "Belt",
          "Shoe",
          "Tank Top",
          "Sock",
  };
  private static final String[] runningApparel = {
          "Jacket",
          "Sunglasses",
          "Headband",
          "Wristband",
          "Shoe",
          "Tank Top",
          "Sock",
          "Short",
          "Hoodie",
          "Visor",
  };
  private static final String[] basketballApparel = {
          "Headband",
          "Wristband",
          "Shoe",
          "Tank Top",
          "Sock",
          "Short",
  };
  private static final String[] soccerApparel = {
          "Headband",
          "Wristband",
          "Short",
          "Sock",
          "Shoe",
          "Shin Guard",
  };
  private static final String[] swimWear = {
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
  public static String getNonPaddedSportCategories() {
    Random randomGenerator = new Random();
    return nonPaddedSportCategories[randomGenerator.nextInt(nonPaddedSportCategories.length)];
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

  public static String getPet() {
    Random randomGenerator = new Random();
    return petDept[randomGenerator.nextInt(petDept.length)];
  }
  public static String getWeightliftingSport() {
    Random randomGenerator = new Random();
    return weightliftingSport[randomGenerator.nextInt(weightliftingSport.length)];
  }
  private static String getPaddedSportCategories() {
    Random randomGenerator = new Random();
    return paddedSportCategories[randomGenerator.nextInt(paddedSportCategories.length)];
  }
  public static String getRunningSport() {
    Random randomGenerator = new Random();
    return runningSport[randomGenerator.nextInt(runningSport.length)];
  }
  public static String getFootSports() {
    Random randomGenerator = new Random();
    return footSports[randomGenerator.nextInt(footSports.length)];
  }
  public static String getHandSports() {
    Random randomGenerator = new Random();
    return handSports[randomGenerator.nextInt(handSports.length)];
  }
  public static String getWater() {
    Random randomGenerator = new Random();
    return water[randomGenerator.nextInt(water.length)];
  }
  public static String getContactApparel() {
    Random randomGenerator = new Random();
    return contactApparel[randomGenerator.nextInt(contactApparel.length)];
  }
  public static String getSoloApparel() {
    Random randomGenerator = new Random();
    return soloApparel[randomGenerator.nextInt(soloApparel.length)];
  }
  public static String getWeightliftingApparel() {
    Random randomGenerator = new Random();
    return weightliftingApparel[randomGenerator.nextInt(weightliftingApparel.length)];
  }
  public static String getRunningApparel() {
    Random randomGenerator = new Random();
    return runningApparel[randomGenerator.nextInt(runningApparel.length)];
  }
  public static String getBasketballApparel() {
    Random randomGenerator = new Random();
    return basketballApparel[randomGenerator.nextInt(basketballApparel.length)];
  }
  public static String getSoccerApparel() {
    Random randomGenerator = new Random();
    return soccerApparel[randomGenerator.nextInt(soccerApparel.length)];
  }
  public static String getSwimWear() {
    Random randomGenerator = new Random();
    return swimWear[randomGenerator.nextInt(swimWear.length)];
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
    String petCatagory = ProductFactory.getPet();
    String running = ProductFactory.getRunningSport();
    String nonPadded = ProductFactory.getNonPaddedSportCategories();
    String padded = ProductFactory.getPaddedSportCategories();
    String weight = ProductFactory.getWeightliftingSport();
    String foot = ProductFactory.getFootSports();
    String hand = ProductFactory.getHandSports();
    String swim = ProductFactory.getWater();
    String pet = ProductFactory.getForPets();
    String runningGear = ProductFactory.getRunningApparel();
    String weightGear = ProductFactory.getWeightliftingApparel();
    String pads = ProductFactory.getContactApparel();
    String noPads = ProductFactory.getSoloApparel();
    String soccer = ProductFactory.getSoccerApparel();
    String basketball = ProductFactory.getBasketballApparel();
    String swimming = ProductFactory.getSwimWear();
//    product.setCategory("Running");
//    product.setType("Short");
    product.setName(name);
    product.setType(type);
    product.setCategory(category);
    product.setDemographic(demographic);
    product.setDescription(description);
    product.setGlobalProductCode(ProductFactory.getRandomProductId());
    product.setStyleNumber(ProductFactory.getStyleCode());
//    product.setBreed(breed);
    if (demographic != "Pets") {
      if(filterProduct(category, nonPaddedSportCategories)) {
        product.setCategory(nonPadded);
        product.setType(noPads);
      }
      if (filterProduct(category, paddedSportCategories)) {
        product.setCategory(padded);
        product.setType(pads);
      }
      if (filterProduct(category, runningSport)) {
        product.setCategory(running);
        product.setType(runningGear);
      }
      if (filterProduct(category, weightliftingSport)) {
        product.setCategory(weight);
        product.setType(weightGear);
      }
      if (filterProduct(category, footSports)) {
        product.setCategory(foot);
        product.setType(soccer);
      }
      if (filterProduct(category, handSports)) {
        product.setCategory(hand);
        product.setType(basketball);
      }
      if (filterProduct(category, water)) {
        product.setCategory(swim);
        product.setType(swimming);
      }
    }
    if (product.getDemographic().equals("Pets")){
      product.setCategory(petCatagory);
      product.setType(pet);
    }
    if (filterProduct(category, petDept)){
      product.setDemographic("Pets");
      product.setCategory(petCatagory);
      product.setType(pet);
    }

    return product;
  }

}