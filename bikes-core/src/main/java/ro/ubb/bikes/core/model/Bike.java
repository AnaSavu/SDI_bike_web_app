package ro.ubb.bikes.core.model;


import lombok.*;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Bike extends BaseEntity<Long> {
    private String serialNumber;
    private String manufacturer;
    private String color;
    private int price;
}
