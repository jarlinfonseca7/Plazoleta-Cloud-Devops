package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.domain.model.RestaurantEmployeeModel;
import com.pragma.powerup.domain.model.RestaurantModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.OrderEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.RestaurantEmployeeEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.RestaurantEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:35-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IOrderEntityMapperImpl implements IOrderEntityMapper {

    @Override
    public OrderEntity toEntity(OrderModel orderModel) {
        if ( orderModel == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setId( orderModel.getId() );
        orderEntity.setIdCliente( orderModel.getIdCliente() );
        orderEntity.setFecha( orderModel.getFecha() );
        orderEntity.setEstado( orderModel.getEstado() );
        orderEntity.setChef( restaurantEmployeeModelToRestaurantEmployeeEntity( orderModel.getChef() ) );
        orderEntity.setRestaurante( restaurantModelToRestaurantEntity( orderModel.getRestaurante() ) );

        return orderEntity;
    }

    @Override
    public OrderModel toOrderModel(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        OrderModel orderModel = new OrderModel();

        orderModel.setId( orderEntity.getId() );
        orderModel.setIdCliente( orderEntity.getIdCliente() );
        orderModel.setFecha( orderEntity.getFecha() );
        orderModel.setEstado( orderEntity.getEstado() );
        orderModel.setChef( restaurantEmployeeEntityToRestaurantEmployeeModel( orderEntity.getChef() ) );
        orderModel.setRestaurante( restaurantEntityToRestaurantModel( orderEntity.getRestaurante() ) );

        return orderModel;
    }

    @Override
    public List<OrderModel> toOrderModelList(List<OrderEntity> orderEntities) {
        if ( orderEntities == null ) {
            return null;
        }

        List<OrderModel> list = new ArrayList<OrderModel>( orderEntities.size() );
        for ( OrderEntity orderEntity : orderEntities ) {
            list.add( toOrderModel( orderEntity ) );
        }

        return list;
    }

    protected RestaurantEmployeeEntity restaurantEmployeeModelToRestaurantEmployeeEntity(RestaurantEmployeeModel restaurantEmployeeModel) {
        if ( restaurantEmployeeModel == null ) {
            return null;
        }

        RestaurantEmployeeEntity restaurantEmployeeEntity = new RestaurantEmployeeEntity();

        restaurantEmployeeEntity.setId( restaurantEmployeeModel.getId() );
        restaurantEmployeeEntity.setRestaurantId( restaurantEmployeeModel.getRestaurantId() );
        restaurantEmployeeEntity.setPersonId( restaurantEmployeeModel.getPersonId() );

        return restaurantEmployeeEntity;
    }

    protected RestaurantEntity restaurantModelToRestaurantEntity(RestaurantModel restaurantModel) {
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

    protected RestaurantEmployeeModel restaurantEmployeeEntityToRestaurantEmployeeModel(RestaurantEmployeeEntity restaurantEmployeeEntity) {
        if ( restaurantEmployeeEntity == null ) {
            return null;
        }

        RestaurantEmployeeModel restaurantEmployeeModel = new RestaurantEmployeeModel();

        restaurantEmployeeModel.setId( restaurantEmployeeEntity.getId() );
        restaurantEmployeeModel.setRestaurantId( restaurantEmployeeEntity.getRestaurantId() );
        restaurantEmployeeModel.setPersonId( restaurantEmployeeEntity.getPersonId() );

        return restaurantEmployeeModel;
    }

    protected RestaurantModel restaurantEntityToRestaurantModel(RestaurantEntity restaurantEntity) {
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
}
