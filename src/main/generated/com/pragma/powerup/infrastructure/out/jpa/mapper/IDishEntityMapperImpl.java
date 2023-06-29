package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.CategoryModel;
import com.pragma.powerup.domain.model.DishModel;
import com.pragma.powerup.domain.model.RestaurantModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.CategoryEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.DishEntity;
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
public class IDishEntityMapperImpl implements IDishEntityMapper {

    @Override
    public DishEntity toEntity(DishModel dishModel) {
        if ( dishModel == null ) {
            return null;
        }

        DishEntity dishEntity = new DishEntity();

        dishEntity.setRestauranteId( restaurantModelToRestaurantEntity( dishModel.getRestauranteId() ) );
        dishEntity.setCategoriaId( categoryModelToCategoryEntity( dishModel.getCategoriaId() ) );
        dishEntity.setId( dishModel.getId() );
        dishEntity.setNombre( dishModel.getNombre() );
        dishEntity.setPrecio( dishModel.getPrecio() );
        dishEntity.setDescripcion( dishModel.getDescripcion() );
        dishEntity.setUrlImagen( dishModel.getUrlImagen() );
        dishEntity.setActivo( dishModel.getActivo() );

        return dishEntity;
    }

    @Override
    public DishModel toDishModel(DishEntity dishEntity) {
        if ( dishEntity == null ) {
            return null;
        }

        DishModel dishModel = new DishModel();

        dishModel.setRestauranteId( restaurantEntityToRestaurantModel( dishEntity.getRestauranteId() ) );
        dishModel.setCategoriaId( categoryEntityToCategoryModel( dishEntity.getCategoriaId() ) );
        dishModel.setId( dishEntity.getId() );
        dishModel.setNombre( dishEntity.getNombre() );
        dishModel.setPrecio( dishEntity.getPrecio() );
        dishModel.setDescripcion( dishEntity.getDescripcion() );
        dishModel.setUrlImagen( dishEntity.getUrlImagen() );
        dishModel.setActivo( dishEntity.getActivo() );

        return dishModel;
    }

    @Override
    public List<DishModel> toDishModelList(List<DishEntity> dishEntityList) {
        if ( dishEntityList == null ) {
            return null;
        }

        List<DishModel> list = new ArrayList<DishModel>( dishEntityList.size() );
        for ( DishEntity dishEntity : dishEntityList ) {
            list.add( toDishModel( dishEntity ) );
        }

        return list;
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
}
