package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.CategoryResponseDto;
import com.pragma.powerup.domain.model.CategoryModel;
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
public class ICategoryResponseMapperImpl implements ICategoryResponseMapper {

    @Override
    public CategoryResponseDto toResponse(CategoryModel categoryModel) {
        if ( categoryModel == null ) {
            return null;
        }

        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();

        categoryResponseDto.setId( categoryModel.getId() );
        categoryResponseDto.setNombre( categoryModel.getNombre() );
        categoryResponseDto.setDescripcion( categoryModel.getDescripcion() );

        return categoryResponseDto;
    }

    @Override
    public List<CategoryResponseDto> toResposeList(List<CategoryModel> categoryModelList) {
        if ( categoryModelList == null ) {
            return null;
        }

        List<CategoryResponseDto> list = new ArrayList<CategoryResponseDto>( categoryModelList.size() );
        for ( CategoryModel categoryModel : categoryModelList ) {
            list.add( toResponse( categoryModel ) );
        }

        return list;
    }
}
