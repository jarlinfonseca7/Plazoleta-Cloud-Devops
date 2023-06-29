package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.RestaurantEmployeeRequestDto;
import com.pragma.powerup.domain.model.RestaurantEmployeeModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:34-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IRestaurantEmployeeRequestMapperImpl implements IRestaurantEmployeeRequestMapper {

    @Override
    public RestaurantEmployeeModel toRestaurantEmployeeModel(RestaurantEmployeeRequestDto restaurantEmployeeRequestDto) {
        if ( restaurantEmployeeRequestDto == null ) {
            return null;
        }

        RestaurantEmployeeModel restaurantEmployeeModel = new RestaurantEmployeeModel();

        restaurantEmployeeModel.setRestaurantId( restaurantEmployeeRequestDto.getRestaurantId() );
        restaurantEmployeeModel.setPersonId( restaurantEmployeeRequestDto.getPersonId() );

        return restaurantEmployeeModel;
    }
}
