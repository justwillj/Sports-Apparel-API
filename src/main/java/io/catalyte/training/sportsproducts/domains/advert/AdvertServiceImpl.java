package io.catalyte.training.sportsproducts.domains.advert;

import io.catalyte.training.sportsproducts.exceptions.ResourceNotFound;
import io.catalyte.training.sportsproducts.exceptions.ServerError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class provides the implementation for the ProductService interface.
 */
@Service
public class AdvertServiceImpl implements AdvertService {

  private final Logger logger = LogManager.getLogger(AdvertServiceImpl.class);

  AdvertRepository advertRepository;

  @Autowired
  public AdvertServiceImpl(AdvertRepository advertRepository) {
    this.advertRepository = advertRepository;
  }

  /**
   * Retrieves all adverts from the database, optionally making use of an example if it is passed.
   *
   * @param advert - an example advert to use for querying
   * @return - a list of adverts matching the example, or all adverts if no example was passed
   */
  public List<Advert> getAdverts(Advert advert) {
    try {
      return advertRepository.findAll(Example.of(advert));
    } catch (DataAccessException e) {
      logger.error(e.getMessage());
      throw new ServerError(e.getMessage());
    }
  }

  /**
   * Retrieves the advert with the provided id from the database.
   *
   * @param id - the id of the advert to retrieve
   * @return - the advert
   */
  public Advert getAdvertById(Long id) {
    Advert advert;

    try {
      advert = advertRepository.findById(id).orElse(null);
    } catch (DataAccessException e) {
      logger.error(e.getMessage());
      throw new ServerError(e.getMessage());
    }

    if (advert != null) {
      return advert;
    } else {
      logger.info("Get by id failed, it does not exist in the database: " + id);
      throw new ResourceNotFound("Get by id failed, it does not exist in the database: " + id);
    }
  }
}