package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.RestaurantRequestDto;
import com.pragma.powerup.domain.model.RestaurantModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:34-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IRestaurantRequestMapperImpl implements IRestaurantRequestMapper {

    @Override
    public RestaurantModel toRestaurant(RestaurantRequestDto restaurantRequestDto) {
        if ( restaurantRequestDto == null ) {
            return null;
        }

        RestaurantModel restaurantModel = new RestaurantModel();

        restaurantModel.setNombre( restaurantRequestDto.getNombre() );
        restaurantModel.setNit( restaurantRequestDto.getNit() );
        restaurantModel.setDireccion( restaurantRequestDto.getDireccion() );
        restaurantModel.setTelefono( restaurantRequestDto.getTelefono() );
        restaurantModel.setUrlLogo( restaurantRequestDto.getUrlLogo() );
        restaurantModel.setIdPropietario( restaurantRequestDto.getIdPropietario() );

        return restaurantModel;
    }

    @Override
    public RestaurantRequestDto toRequest(RestaurantModel restaurantModel) {
        if ( restaurantModel == null ) {
            return null;
        }

        RestaurantRequestDto restaurantRequestDto = new RestaurantRequestDto();

        restaurantRequestDto.setNombre( restaurantModel.getNombre() );
        restaurantRequestDto.setNit( restaurantModel.getNit() );
        restaurantRequestDto.setDireccion( restaurantModel.getDireccion() );
        restaurantRequestDto.setTelefono( restaurantModel.getTelefono() );
        restaurantRequestDto.setUrlLogo( restaurantModel.getUrlLogo() );
        restaurantRequestDto.setIdPropietario( restaurantModel.getIdPropietario() );

        return restaurantRequestDto;
    }
}
