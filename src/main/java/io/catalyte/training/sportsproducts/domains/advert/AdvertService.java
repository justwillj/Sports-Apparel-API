package io.catalyte.training.sportsproducts.domains.advert;

import java.util.List;

/**
 * This interface provides an abstraction layer for the Adverts Service
 */
public interface AdvertService {

  List<Advert> getAdverts(Advert product);

  Advert getAdvertById(Long id);
}
