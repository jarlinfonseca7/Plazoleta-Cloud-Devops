package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.CategoryRequestDto;
import com.pragma.powerup.domain.model.CategoryModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:34-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class ICategoryRequestMapperImpl implements ICategoryRequestMapper {

    @Override
    public CategoryModel toCategory(CategoryRequestDto categoryRequestDto) {
        if ( categoryRequestDto == null ) {
            return null;
        }

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setNombre( categoryRequestDto.getNombre() );
        categoryModel.setDescripcion( categoryRequestDto.getDescripcion() );

        return categoryModel;
    }

    @Override
    public CategoryRequestDto toRequest(CategoryModel categoryModel) {
        if ( categoryModel == null ) {
            return null;
        }

        CategoryRequestDto categoryRequestDto = new CategoryRequestDto();

        categoryRequestDto.setNombre( categoryModel.getNombre() );
        categoryRequestDto.setDescripcion( categoryModel.getDescripcion() );

        return categoryRequestDto;
    }
}
