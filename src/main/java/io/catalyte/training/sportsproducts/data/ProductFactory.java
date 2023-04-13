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
      "Dog",
      "Cat",
      "Other"
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
          "Dog",
          "Cat",
          "Other"
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
      "Toy",
      "Bed",
      "Treats"
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
          "Toy",
          "Bed",
          "Treats"
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
   * filters contents of String array based on a String
   * using to organize category for appropriate type for createRandomProduct()
   * @param a - the term to filter by
   * @param b - the array being filtered
   */
  Boolean filterProduct(String a, String[] b) {
    Predicate<String> isA = Predicate.isEqual(a);
    Boolean isMatch = Arrays.stream(b).anyMatch(isA);
    return isMatch;
  }
  /**
   * inserts image based on a String
   * using to provide images for createRandomProduct()
   * @param category - the term used to provide correct image
   * @return String url
   */
  String insertImage(String category) {
    if (category == "Golf") {
      return "https://unicorncay.com/wp-content/uploads/2019/06/golf.jpg";
    }
    if (category == "Football") {
      return "https://1.bp.blogspot.com/-0QPjXpuaaqc/T0Zxqgy01bI/AAAAAAAAAUI/wreslkQFE_A/s1600/American+Football+Wallpapers.jpg";
    }
    if (category == "Soccer") {
      return "https://wallpapertag.com/wallpaper/full/7/b/4/824935-gorgerous-soccer-players-wallpapers-2000x1250-photo.jpg";
    }
    if (category == "Basketball") {
      return "https://pixfeeds.com/images/basketball/1280-594909788-basketball-player-shooting-at-basket.jpg";
    }
    if (category == "Hockey") {
      return "https://darkroom-cdn.s3.amazonaws.com/2014/02/USPW-2014-02-21T172254Z_1780392570_NOCID_RTRMADP_3_OLYMPICS-ICE.jpg";
    }
    if (category == "Running") {
      return "https://static01.nyt.com/images/2016/12/14/well/move/14physed-running-photo/14physed-running-photo-facebookJumbo.jpg";
    }
    if (category == "Baseball") {
      return "https://greggnixon.net/gallery/Youth%20Sports/Baseball/tyler1.jpg";
    }
    if (category == "Skateboarding") {
      return "https://www.factinate.com/wp-content/uploads/2017/08/GettyImages-1015395376.jpg";
    }
    if (category == "Boxing") {
      return "http://greensboroboxing.org/wp-content/uploads/2021/02/B32I6381_1.jpg";
    }
    if (category == "Weightlifting") {
      return "https://simplygym.co.uk/wp-content/uploads/2018/06/AdobeStock_86572660-e1528100935530.jpeg";
    }
    if (category == "Swimming") {
      return "https://images.thestar.com/777_xR_claRwOtCStiymyWZXQ50=/1200x798/smart/filters:cb(1513617764172)/https://www.thestar.com/content/dam/thestar/life/homes/diy/2016/07/29/how-to-use-pool-noodles-outside-of-the-water/pool-noodles-main.jpg";
    }
    if (category == "Dog") {
      return "https://regencysurfaceclean.com/wp-content/uploads/2018/06/Header_Pets.jpg";
    }
    if (category == "Cat") {
      return "https://regencysurfaceclean.com/wp-content/uploads/2018/06/Header_Pets.jpg";
    }
    if (category == "Other") {
      return "https://regencysurfaceclean.com/wp-content/uploads/2018/06/Header_Pets.jpg";
    }
    return "https://hesolutions.com.pk/wp-content/uploads/2019/01/picture-not-available.jpg";
  }
  /**
   * Uses random generators to build a product.
   *
   * @return - a randomly generated product
   */

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
    product.setImageUrl("https://hesolutions.com.pk/wp-content/uploads/2019/01/picture-not-available.jpg");
//    product.setBreed(breed);

    //conditions for mocking realistic products and separating pets from  humans
    if (demographic != "Pets") {
      if(filterProduct(category, nonPaddedSportCategories)) {
        String nonPaddedImg = insertImage(nonPadded);
        product.setCategory(nonPadded);
        product.setType(noPads);
        product.setImageUrl(nonPaddedImg);
      }
      if (filterProduct(category, paddedSportCategories)) {
        String paddedImg = insertImage(padded);
        product.setCategory(padded);
        product.setType(pads);
        product.setImageUrl(paddedImg);
      }
      if (filterProduct(category, runningSport)) {
        String runningImg = insertImage(running);
        product.setCategory(running);
        product.setType(runningGear);
        product.setImageUrl(runningImg);
      }
      if (filterProduct(category, weightliftingSport)) {
        String weightliftingImg = insertImage(weight);
        product.setCategory(weight);
        product.setType(weightGear);
        product.setImageUrl(weightliftingImg);
      }
      if (filterProduct(category, footSports)) {
        String footSportsImg = insertImage(foot);
        product.setCategory(foot);
        product.setType(soccer);
        product.setImageUrl(footSportsImg);
      }
      if (filterProduct(category, handSports)) {
        String handSportsImg = insertImage(hand);
        product.setCategory(hand);
        product.setType(basketball);
        product.setImageUrl(handSportsImg);
      }
      if (filterProduct(category, water)) {
        String waterImg = insertImage(swim);
        product.setCategory(swim);
        product.setType(swimming);
        product.setImageUrl(waterImg);
      }
    }
    if (product.getDemographic().equals("Pets")){
      String petsImg = insertImage(petCatagory);
      product.setCategory(petCatagory);
      product.setType(pet);
      product.setImageUrl(petsImg);
    }
    if (filterProduct(category, petDept)){
      String petsImg = insertImage(petCatagory);
      product.setDemographic("Pets");
      product.setCategory(petCatagory);
      product.setType(pet);
      product.setImageUrl(petsImg);
    }

    return product;
  }

}