package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.DishRequestDto;
import com.pragma.powerup.application.dto.request.DishUpdateRequestDto;
import com.pragma.powerup.domain.model.CategoryModel;
import com.pragma.powerup.domain.model.DishModel;
import com.pragma.powerup.domain.model.RestaurantModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:34-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IDishRequestMapperImpl implements IDishRequestMapper {

    @Override
    public DishModel toDish(DishRequestDto dishRequestDto) {
        if ( dishRequestDto == null ) {
            return null;
        }

        DishModel dishModel = new DishModel();

        dishModel.setRestauranteId( dishRequestDtoToRestaurantModel( dishRequestDto ) );
        dishModel.setCategoriaId( dishRequestDtoToCategoryModel( dishRequestDto ) );
        dishModel.setNombre( dishRequestDto.getNombre() );
        dishModel.setPrecio( dishRequestDto.getPrecio() );
        dishModel.setDescripcion( dishRequestDto.getDescripcion() );
        dishModel.setUrlImagen( dishRequestDto.getUrlImagen() );
        dishModel.setActivo( dishRequestDto.getActivo() );

        return dishModel;
    }

    @Override
    public DishModel toDishUpdate(DishUpdateRequestDto dishUpdateRequestDto) {
        if ( dishUpdateRequestDto == null ) {
            return null;
        }

        DishModel dishModel = new DishModel();

        dishModel.setPrecio( dishUpdateRequestDto.getPrecio() );
        dishModel.setDescripcion( dishUpdateRequestDto.getDescripcion() );

        return dishModel;
    }

    protected RestaurantModel dishRequestDtoToRestaurantModel(DishRequestDto dishRequestDto) {
        if ( dishRequestDto == null ) {
            return null;
        }

        RestaurantModel restaurantModel = new RestaurantModel();

        restaurantModel.setId( dishRequestDto.getRestauranteId() );

        return restaurantModel;
    }

    protected CategoryModel dishRequestDtoToCategoryModel(DishRequestDto dishRequestDto) {
        if ( dishRequestDto == null ) {
            return null;
        }

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setId( dishRequestDto.getCategoriaId() );

        return categoryModel;
    }
}
