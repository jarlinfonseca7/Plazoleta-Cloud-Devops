package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.RestaurantResponseDto;
import com.pragma.powerup.domain.model.RestaurantModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:34-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IRestaurantResponseMapperImpl implements IRestaurantResponseMapper {

    @Override
    public RestaurantResponseDto toResponse(RestaurantModel restaurantModel) {
        if ( restaurantModel == null ) {
            return null;
        }

        RestaurantResponseDto restaurantResponseDto = new RestaurantResponseDto();

        restaurantResponseDto.setId( restaurantModel.getId() );
        restaurantResponseDto.setNombre( restaurantModel.getNombre() );
        restaurantResponseDto.setNit( restaurantModel.getNit() );
        restaurantResponseDto.setDireccion( restaurantModel.getDireccion() );
        restaurantResponseDto.setTelefono( restaurantModel.getTelefono() );
        restaurantResponseDto.setUrlLogo( restaurantModel.getUrlLogo() );
        restaurantResponseDto.setIdPropietario( restaurantModel.getIdPropietario() );

        return restaurantResponseDto;
    }

    @Override
    public List<RestaurantResponseDto> toResponseList(List<RestaurantModel> restaurantModelList) {
        if ( restaurantModelList == null ) {
            return null;
        }

        List<RestaurantResponseDto> list = new ArrayList<RestaurantResponseDto>( restaurantModelList.size() );
        for ( RestaurantModel restaurantModel : restaurantModelList ) {
            list.add( toResponse( restaurantModel ) );
        }

        return list;
    }
}
