package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.OrderDishResponseDto;
import com.pragma.powerup.application.dto.response.OrderResponseDto;
import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.domain.model.orders.OrderDishResponseModel;
import com.pragma.powerup.domain.model.orders.OrderResponseModel;
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
public class IOrderResponseMapperImpl implements IOrderResponseMapper {

    @Override
    public OrderResponseDto toResponse(OrderModel orderModel) {
        if ( orderModel == null ) {
            return null;
        }

        OrderResponseDto orderResponseDto = new OrderResponseDto();

        orderResponseDto.setId( orderModel.getId() );
        orderResponseDto.setIdCliente( orderModel.getIdCliente() );
        orderResponseDto.setFecha( orderModel.getFecha() );

        return orderResponseDto;
    }

    @Override
    public List<OrderResponseDto> toResponseList(List<OrderModel> orderModels) {
        if ( orderModels == null ) {
            return null;
        }

        List<OrderResponseDto> list = new ArrayList<OrderResponseDto>( orderModels.size() );
        for ( OrderModel orderModel : orderModels ) {
            list.add( toResponse( orderModel ) );
        }

        return list;
    }

    @Override
    public List<OrderResponseDto> toOrderResponseList(List<OrderResponseModel> orderResponseModels) {
        if ( orderResponseModels == null ) {
            return null;
        }

        List<OrderResponseDto> list = new ArrayList<OrderResponseDto>( orderResponseModels.size() );
        for ( OrderResponseModel orderResponseModel : orderResponseModels ) {
            list.add( orderResponseModelToOrderResponseDto( orderResponseModel ) );
        }

        return list;
    }

    protected OrderDishResponseDto orderDishResponseModelToOrderDishResponseDto(OrderDishResponseModel orderDishResponseModel) {
        if ( orderDishResponseModel == null ) {
            return null;
        }

        OrderDishResponseDto orderDishResponseDto = new OrderDishResponseDto();

        orderDishResponseDto.setId( orderDishResponseModel.getId() );
        orderDishResponseDto.setNombre( orderDishResponseModel.getNombre() );
        orderDishResponseDto.setPrecio( orderDishResponseModel.getPrecio() );
        orderDishResponseDto.setDescripcion( orderDishResponseModel.getDescripcion() );
        orderDishResponseDto.setUrlImagen( orderDishResponseModel.getUrlImagen() );
        orderDishResponseDto.setCategoriaId( orderDishResponseModel.getCategoriaId() );
        orderDishResponseDto.setCantidad( orderDishResponseModel.getCantidad() );

        return orderDishResponseDto;
    }

    protected List<OrderDishResponseDto> orderDishResponseModelListToOrderDishResponseDtoList(List<OrderDishResponseModel> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderDishResponseDto> list1 = new ArrayList<OrderDishResponseDto>( list.size() );
        for ( OrderDishResponseModel orderDishResponseModel : list ) {
            list1.add( orderDishResponseModelToOrderDishResponseDto( orderDishResponseModel ) );
        }

        return list1;
    }

    protected OrderResponseDto orderResponseModelToOrderResponseDto(OrderResponseModel orderResponseModel) {
        if ( orderResponseModel == null ) {
            return null;
        }

        OrderResponseDto orderResponseDto = new OrderResponseDto();

        orderResponseDto.setId( orderResponseModel.getId() );
        orderResponseDto.setIdCliente( orderResponseModel.getIdCliente() );
        orderResponseDto.setIdChef( orderResponseModel.getIdChef() );
        orderResponseDto.setFecha( orderResponseModel.getFecha() );
        orderResponseDto.setPedidoPlatos( orderDishResponseModelListToOrderDishResponseDtoList( orderResponseModel.getPedidoPlatos() ) );

        return orderResponseDto;
    }
}
