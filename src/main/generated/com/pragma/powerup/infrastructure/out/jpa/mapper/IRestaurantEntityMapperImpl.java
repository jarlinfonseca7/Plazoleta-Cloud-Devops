package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.RestaurantModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RestaurantEntity;
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
public class IRestaurantEntityMapperImpl implements IRestaurantEntityMapper {

    @Override
    public RestaurantEntity toEntity(RestaurantModel restaurantModel) {
        if ( restaurantModel == null ) {
            return null;
        }

        RestaurantEntity restaurantEntity = new RestaurantEntity();

        restaurantEntity.setId( restaurantModel.getId() );
        restaurantEntity.setNombre( restaurantModel.getNombre() );
        restaurantEntity.setNit( restaurantModel.getNit() );
        restaurantEntity.setDireccion( restaurantModel.getDireccion() );
        restaurantEntity.setTelefono( restaurantModel.getTelefono() );
        restaurantEntity.setUrlLogo( restaurantModel.getUrlLogo() );
        restaurantEntity.setIdPropietario( restaurantModel.getIdPropietario() );

        return restaurantEntity;
    }

    @Override
    public RestaurantModel toRestaurantModel(RestaurantEntity restaurantEntity) {
        if ( restaurantEntity == null ) {
            return null;
        }

        RestaurantModel restaurantModel = new RestaurantModel();

        restaurantModel.setId( restaurantEntity.getId() );
        restaurantModel.setNombre( restaurantEntity.getNombre() );
        restaurantModel.setNit( restaurantEntity.getNit() );
        restaurantModel.setDireccion( restaurantEntity.getDireccion() );
        restaurantModel.setTelefono( restaurantEntity.getTelefono() );
        restaurantModel.setUrlLogo( restaurantEntity.getUrlLogo() );
        restaurantModel.setIdPropietario( restaurantEntity.getIdPropietario() );

        return restaurantModel;
    }

    @Override
    public List<RestaurantModel> toRestaurantModelList(List<RestaurantEntity> restaurantModelList) {
        if ( restaurantModelList == null ) {
            return null;
        }

        List<RestaurantModel> list = new ArrayList<RestaurantModel>( restaurantModelList.size() );
        for ( RestaurantEntity restaurantEntity : restaurantModelList ) {
            list.add( toRestaurantModel( restaurantEntity ) );
        }

        return list;
    }
}
