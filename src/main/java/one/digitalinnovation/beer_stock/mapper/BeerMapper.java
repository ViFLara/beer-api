package one.digitalinnovation.beer_stock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.digitalinnovation.beer_stock.dto.BeerDTO;
import one.digitalinnovation.beer_stock.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
