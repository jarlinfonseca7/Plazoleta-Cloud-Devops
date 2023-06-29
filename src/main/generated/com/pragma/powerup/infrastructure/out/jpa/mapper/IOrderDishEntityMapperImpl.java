package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.CategoryModel;
import com.pragma.powerup.domain.model.DishModel;
import com.pragma.powerup.domain.model.OrderDishModel;
import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.domain.model.RestaurantEmployeeModel;
import com.pragma.powerup.domain.model.RestaurantModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.CategoryEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.DishEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.OrderDishEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.OrderEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.RestaurantEmployeeEntity;
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
public class IOrderDishEntityMapperImpl implements IOrderDishEntityMapper {

    @Override
    public OrderDishEntity toEntity(OrderDishModel orderDishModel) {
        if ( orderDishModel == null ) {
            return null;
        }

        OrderDishEntity orderDishEntity = new OrderDishEntity();

        orderDishEntity.setId( orderDishModel.getId() );
        orderDishEntity.setPedido( orderModelToOrderEntity( orderDishModel.getPedido() ) );
        orderDishEntity.setPlato( dishModelToDishEntity( orderDishModel.getPlato() ) );
        orderDishEntity.setCantidad( orderDishModel.getCantidad() );

        return orderDishEntity;
    }

    @Override
    public OrderDishModel toOrderModel(OrderDishEntity orderDishEntity) {
        if ( orderDishEntity == null ) {
            return null;
        }

        OrderDishModel orderDishModel = new OrderDishModel();

        orderDishModel.setId( orderDishEntity.getId() );
        orderDishModel.setPedido( orderEntityToOrderModel( orderDishEntity.getPedido() ) );
        orderDishModel.setPlato( dishEntityToDishModel( orderDishEntity.getPlato() ) );
        orderDishModel.setCantidad( orderDishEntity.getCantidad() );

        return orderDishModel;
    }

    @Override
    public List<OrderDishModel> toOrderDishModelList(List<OrderDishEntity> orderDishEntities) {
        if ( orderDishEntities == null ) {
            return null;
        }

        List<OrderDishModel> list = new ArrayList<OrderDishModel>( orderDishEntities.size() );
        for ( OrderDishEntity orderDishEntity : orderDishEntities ) {
            list.add( toOrderModel( orderDishEntity ) );
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

    protected OrderEntity orderModelToOrderEntity(OrderModel orderModel) {
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

    protected CategoryEntity categoryModelToCategoryEntity(CategoryModel categoryModel) {
        if ( categoryModel == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( categoryModel.getId() );
        categoryEntity.setNombre( categoryModel.getNombre() );
        categoryEntity.setDescripcion( categoryModel.getDescripcion() );

        return categoryEntity;
    }

    protected DishEntity dishModelToDishEntity(DishModel dishModel) {
        if ( dishModel == null ) {
            return null;
        }

        DishEntity dishEntity = new DishEntity();

        dishEntity.setId( dishModel.getId() );
        dishEntity.setNombre( dishModel.getNombre() );
        dishEntity.setPrecio( dishModel.getPrecio() );
        dishEntity.setDescripcion( dishModel.getDescripcion() );
        dishEntity.setUrlImagen( dishModel.getUrlImagen() );
        dishEntity.setActivo( dishModel.getActivo() );
        dishEntity.setRestauranteId( restaurantModelToRestaurantEntity( dishModel.getRestauranteId() ) );
        dishEntity.setCategoriaId( categoryModelToCategoryEntity( dishModel.getCategoriaId() ) );

        return dishEntity;
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

    protected OrderModel orderEntityToOrderModel(OrderEntity orderEntity) {
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

    protected CategoryModel categoryEntityToCategoryModel(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setId( categoryEntity.getId() );
        categoryModel.setNombre( categoryEntity.getNombre() );
        categoryModel.setDescripcion( categoryEntity.getDescripcion() );

        return categoryModel;
    }

    protected DishModel dishEntityToDishModel(DishEntity dishEntity) {
        if ( dishEntity == null ) {
            return null;
        }

        DishModel dishModel = new DishModel();

        dishModel.setId( dishEntity.getId() );
        dishModel.setNombre( dishEntity.getNombre() );
        dishModel.setPrecio( dishEntity.getPrecio() );
        dishModel.setDescripcion( dishEntity.getDescripcion() );
        dishModel.setUrlImagen( dishEntity.getUrlImagen() );
        dishModel.setActivo( dishEntity.getActivo() );
        dishModel.setRestauranteId( restaurantEntityToRestaurantModel( dishEntity.getRestauranteId() ) );
        dishModel.setCategoriaId( categoryEntityToCategoryModel( dishEntity.getCategoriaId() ) );

        return dishModel;
    }
}
