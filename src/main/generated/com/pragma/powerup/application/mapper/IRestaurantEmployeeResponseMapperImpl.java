package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.RestaurantEmployeeResponseDto;
import com.pragma.powerup.domain.model.RestaurantEmployeeModel;
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
public class IRestaurantEmployeeResponseMapperImpl implements IRestaurantEmployeeResponseMapper {

    @Override
    public RestaurantEmployeeResponseDto toResponse(RestaurantEmployeeModel restaurantEmployeeModel) {
        if ( restaurantEmployeeModel == null ) {
            return null;
        }

        RestaurantEmployeeResponseDto restaurantEmployeeResponseDto = new RestaurantEmployeeResponseDto();

        restaurantEmployeeResponseDto.setId( restaurantEmployeeModel.getId() );
        restaurantEmployeeResponseDto.setRestaurantId( restaurantEmployeeModel.getRestaurantId() );
        restaurantEmployeeResponseDto.setPersonId( restaurantEmployeeModel.getPersonId() );

        return restaurantEmployeeResponseDto;
    }

    @Override
    public List<RestaurantEmployeeResponseDto> toResponseList(List<RestaurantEmployeeModel> restaurantEmployeeModelList) {
        if ( restaurantEmployeeModelList == null ) {
            return null;
        }

        List<RestaurantEmployeeResponseDto> list = new ArrayList<RestaurantEmployeeResponseDto>( restaurantEmployeeModelList.size() );
        for ( RestaurantEmployeeModel restaurantEmployeeModel : restaurantEmployeeModelList ) {
            list.add( toResponse( restaurantEmployeeModel ) );
        }

        return list;
    }
}
