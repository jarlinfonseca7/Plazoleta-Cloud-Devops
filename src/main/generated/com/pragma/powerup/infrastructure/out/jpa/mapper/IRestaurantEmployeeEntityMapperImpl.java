package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.RestaurantEmployeeModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RestaurantEmployeeEntity;
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
public class IRestaurantEmployeeEntityMapperImpl implements IRestaurantEmployeeEntityMapper {

    @Override
    public RestaurantEmployeeEntity toEntity(RestaurantEmployeeModel restaurantEmployeeModel) {
        if ( restaurantEmployeeModel == null ) {
            return null;
        }

        RestaurantEmployeeEntity restaurantEmployeeEntity = new RestaurantEmployeeEntity();

        restaurantEmployeeEntity.setId( restaurantEmployeeModel.getId() );
        restaurantEmployeeEntity.setRestaurantId( restaurantEmployeeModel.getRestaurantId() );
        restaurantEmployeeEntity.setPersonId( restaurantEmployeeModel.getPersonId() );

        return restaurantEmployeeEntity;
    }

    @Override
    public RestaurantEmployeeModel toRestaurantEmployeeModel(RestaurantEmployeeEntity restaurantEmployeeEntity) {
        if ( restaurantEmployeeEntity == null ) {
            return null;
        }

        RestaurantEmployeeModel restaurantEmployeeModel = new RestaurantEmployeeModel();

        restaurantEmployeeModel.setId( restaurantEmployeeEntity.getId() );
        restaurantEmployeeModel.setRestaurantId( restaurantEmployeeEntity.getRestaurantId() );
        restaurantEmployeeModel.setPersonId( restaurantEmployeeEntity.getPersonId() );

        return restaurantEmployeeModel;
    }

    @Override
    public List<RestaurantEmployeeModel> toRestaurantEmployeeModelList(List<RestaurantEmployeeEntity> restaurantEmployeeEntityList) {
        if ( restaurantEmployeeEntityList == null ) {
            return null;
        }

        List<RestaurantEmployeeModel> list = new ArrayList<RestaurantEmployeeModel>( restaurantEmployeeEntityList.size() );
        for ( RestaurantEmployeeEntity restaurantEmployeeEntity : restaurantEmployeeEntityList ) {
            list.add( toRestaurantEmployeeModel( restaurantEmployeeEntity ) );
        }

        return list;
    }
}
