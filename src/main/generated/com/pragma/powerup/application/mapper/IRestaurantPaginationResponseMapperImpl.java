package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.RestaurantPaginationResponseDto;
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
public class IRestaurantPaginationResponseMapperImpl implements IRestaurantPaginationResponseMapper {

    @Override
    public List<RestaurantPaginationResponseDto> toResponseListPagination(List<RestaurantModel> restaurantModelList) {
        if ( restaurantModelList == null ) {
            return null;
        }

        List<RestaurantPaginationResponseDto> list = new ArrayList<RestaurantPaginationResponseDto>( restaurantModelList.size() );
        for ( RestaurantModel restaurantModel : restaurantModelList ) {
            list.add( restaurantModelToRestaurantPaginationResponseDto( restaurantModel ) );
        }

        return list;
    }

    protected RestaurantPaginationResponseDto restaurantModelToRestaurantPaginationResponseDto(RestaurantModel restaurantModel) {
        if ( restaurantModel == null ) {
            return null;
        }

        RestaurantPaginationResponseDto restaurantPaginationResponseDto = new RestaurantPaginationResponseDto();

        restaurantPaginationResponseDto.setNombre( restaurantModel.getNombre() );
        restaurantPaginationResponseDto.setUrlLogo( restaurantModel.getUrlLogo() );

        return restaurantPaginationResponseDto;
    }
}
