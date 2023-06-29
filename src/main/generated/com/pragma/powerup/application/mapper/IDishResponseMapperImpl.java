package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.DishResponseDto;
import com.pragma.powerup.domain.model.DishModel;
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
public class IDishResponseMapperImpl implements IDishResponseMapper {

    @Override
    public DishResponseDto toResponse(DishModel dishModel) {
        if ( dishModel == null ) {
            return null;
        }

        DishResponseDto dishResponseDto = new DishResponseDto();

        dishResponseDto.setId( dishModel.getId() );
        dishResponseDto.setNombre( dishModel.getNombre() );
        dishResponseDto.setPrecio( dishModel.getPrecio() );
        dishResponseDto.setDescripcion( dishModel.getDescripcion() );
        dishResponseDto.setUrlImagen( dishModel.getUrlImagen() );
        dishResponseDto.setActivo( dishModel.getActivo() );
        dishResponseDto.setRestauranteId( dishModel.getRestauranteId() );
        dishResponseDto.setCategoriaId( dishModel.getCategoriaId() );

        return dishResponseDto;
    }

    @Override
    public List<DishResponseDto> toResponseList(List<DishModel> dishModelList) {
        if ( dishModelList == null ) {
            return null;
        }

        List<DishResponseDto> list = new ArrayList<DishResponseDto>( dishModelList.size() );
        for ( DishModel dishModel : dishModelList ) {
            list.add( toResponse( dishModel ) );
        }

        return list;
    }
}
