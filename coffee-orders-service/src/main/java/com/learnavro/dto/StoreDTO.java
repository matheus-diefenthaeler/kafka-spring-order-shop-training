package com.learnavro.dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StoreDTO {
    @NotNull(message = "coffeeOrder.store.storeId is mandatory")
    private Integer storeId;

    @Valid
    @NotNull(message = "coffeeOrder.store.address is mandatory")
    private AddressDTO address;
}