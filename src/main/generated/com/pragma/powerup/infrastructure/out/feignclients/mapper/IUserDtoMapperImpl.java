package com.pragma.powerup.infrastructure.out.feignclients.mapper;

import com.pragma.powerup.domain.model.RolModel;
import com.pragma.powerup.domain.model.UserModel;
import com.pragma.powerup.infrastructure.out.feignclients.dto.RolDto;
import com.pragma.powerup.infrastructure.out.feignclients.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:35-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IUserDtoMapperImpl implements IUserDtoMapper {

    @Override
    public UserModel toUserModel(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setId( userDto.getId() );
        userModel.setNombre( userDto.getNombre() );
        userModel.setApellido( userDto.getApellido() );
        userModel.setDocumentoDeIdentidad( userDto.getDocumentoDeIdentidad() );
        userModel.setCelular( userDto.getCelular() );
        userModel.setCorreo( userDto.getCorreo() );
        userModel.setClave( userDto.getClave() );
        userModel.setRol( rolDtoToRolModel( userDto.getRol() ) );

        return userModel;
    }

    protected RolModel rolDtoToRolModel(RolDto rolDto) {
        if ( rolDto == null ) {
            return null;
        }

        RolModel rolModel = new RolModel();

        rolModel.setId( rolDto.getId() );
        rolModel.setNombre( rolDto.getNombre() );
        rolModel.setDescripcion( rolDto.getDescripcion() );

        return rolModel;
    }
}
