package one.digitalinnovation.beer_stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.beer_stock.entity.Beer;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
