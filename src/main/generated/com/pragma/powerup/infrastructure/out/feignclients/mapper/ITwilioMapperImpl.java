package com.pragma.powerup.infrastructure.out.feignclients.mapper;

import com.pragma.powerup.application.dto.request.SmsMessageRequestDto;
import com.pragma.powerup.domain.model.SmsMessageModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T09:24:34-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class ITwilioMapperImpl implements ITwilioMapper {

    @Override
    public SmsMessageRequestDto toSmsRequest(SmsMessageModel smsMessageModel) {
        if ( smsMessageModel == null ) {
            return null;
        }

        SmsMessageRequestDto smsMessageRequestDto = new SmsMessageRequestDto();

        smsMessageRequestDto.setNumero( smsMessageModel.getNumero() );
        smsMessageRequestDto.setMensaje( smsMessageModel.getMensaje() );

        return smsMessageRequestDto;
    }
}
