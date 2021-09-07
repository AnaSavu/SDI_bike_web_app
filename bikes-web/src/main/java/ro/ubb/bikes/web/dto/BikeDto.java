package ro.ubb.bikes.web.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BikeDto extends BaseDto {
    private String serialNumber;
    private String manufacturer;
    private String color;
    private int price;
}
