package io.catalyte.training.sportsproducts.domains.advert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static io.catalyte.training.sportsproducts.constants.Paths.ADVERTS_PATH;

/**
 * The AdvertController exposes endpoints for product related actions.
 */
@RestController
@RequestMapping(value = ADVERTS_PATH)
public class AdvertController {

  Logger logger = LogManager.getLogger(AdvertController.class);

  @Autowired
  private AdvertService advertService;

  @GetMapping
  public ResponseEntity<List<Advert>> getAdverts(Advert advert) {
    logger.info("Request received for getAdverts");

    return new ResponseEntity<>(advertService.getAdverts(advert), HttpStatus.OK);
  }

  @GetMapping(value = "/{id}")
  @ResponseStatus(value = HttpStatus.OK)
  public ResponseEntity<Advert> getProductById(@PathVariable Long id) {
    logger.info("Request received for getProductsById: " + id);

    return new ResponseEntity<>(advertService.getAdvertById(id), HttpStatus.OK);
  }

}
