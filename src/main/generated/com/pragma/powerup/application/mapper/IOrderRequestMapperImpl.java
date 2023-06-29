package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.OrderDishRequestDto;
import com.pragma.powerup.application.dto.request.OrderRequestDto;
import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.domain.model.orders.OrderDishRequestModel;
import com.pragma.powerup.domain.model.orders.OrderRequestModel;
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
public class IOrderRequestMapperImpl implements IOrderRequestMapper {

    @Override
    public OrderModel toOrderModel(OrderRequestDto orderRequestDto) {
        if ( orderRequestDto == null ) {
            return null;
        }

        OrderModel orderModel = new OrderModel();

        return orderModel;
    }

    @Override
    public OrderRequestModel toOrderRequestModel(OrderRequestDto orderRequestDto) {
        if ( orderRequestDto == null ) {
            return null;
        }

        OrderRequestModel orderRequestModel = new OrderRequestModel();

        orderRequestModel.setPlatos( orderDishRequestDtoListToOrderDishRequestModelList( orderRequestDto.getPlatos() ) );
        orderRequestModel.setResturanteId( orderRequestDto.getResturanteId() );

        return orderRequestModel;
    }

    protected OrderDishRequestModel orderDishRequestDtoToOrderDishRequestModel(OrderDishRequestDto orderDishRequestDto) {
        if ( orderDishRequestDto == null ) {
            return null;
        }

        OrderDishRequestModel orderDishRequestModel = new OrderDishRequestModel();

        orderDishRequestModel.setIdPlatos( orderDishRequestDto.getIdPlatos() );
        orderDishRequestModel.setCantidad( orderDishRequestDto.getCantidad() );

        return orderDishRequestModel;
    }

    protected List<OrderDishRequestModel> orderDishRequestDtoListToOrderDishRequestModelList(List<OrderDishRequestDto> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderDishRequestModel> list1 = new ArrayList<OrderDishRequestModel>( list.size() );
        for ( OrderDishRequestDto orderDishRequestDto : list ) {
            list1.add( orderDishRequestDtoToOrderDishRequestModel( orderDishRequestDto ) );
        }

        return list1;
    }
}
