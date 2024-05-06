package com.learnavro.dto;

import com.learnavro.domain.generated.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineItemDTO {
    @NotBlank(message = "coffeeOrder.orderLineItem.name is mandatory")
    private String name;

    @NotNull(message = "coffeeOrder.orderLineItem.size is mandatory")
    private Size size;

    @NotNull(message = "coffeeOrder.orderLineItem.size is mandatory")
    private Integer quantity;

    @NotNull
    private BigDecimal cost;
}
