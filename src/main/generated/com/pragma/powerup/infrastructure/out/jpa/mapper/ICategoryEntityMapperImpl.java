package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.CategoryModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.CategoryEntity;
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
public class ICategoryEntityMapperImpl implements ICategoryEntityMapper {

    @Override
    public CategoryEntity toEntity(CategoryModel categoryModel) {
        if ( categoryModel == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( categoryModel.getId() );
        categoryEntity.setNombre( categoryModel.getNombre() );
        categoryEntity.setDescripcion( categoryModel.getDescripcion() );

        return categoryEntity;
    }

    @Override
    public CategoryModel toCategoryModel(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setId( categoryEntity.getId() );
        categoryModel.setNombre( categoryEntity.getNombre() );
        categoryModel.setDescripcion( categoryEntity.getDescripcion() );

        return categoryModel;
    }

    @Override
    public List<CategoryModel> toCategoryModelList(List<CategoryEntity> categoryEntityList) {
        if ( categoryEntityList == null ) {
            return null;
        }

        List<CategoryModel> list = new ArrayList<CategoryModel>( categoryEntityList.size() );
        for ( CategoryEntity categoryEntity : categoryEntityList ) {
            list.add( toCategoryModel( categoryEntity ) );
        }

        return list;
    }
}
