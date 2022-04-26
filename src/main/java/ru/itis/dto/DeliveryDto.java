package ru.itis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.models.Delivery;
import ru.itis.models.Product;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryDto {
    private Long id;
    private Integer amount;

    public static DeliveryDto from(Delivery delivery) {
        return DeliveryDto.builder()
                .id(delivery.getId())
                .amount(delivery.getAmount())
                .build();
    }

    public static Set<DeliveryDto> from (Set<Delivery> deliveries) {
        return deliveries.stream().map(DeliveryDto::from).collect(Collectors.toSet());
    }
}
