package hellojpa.domain;

import hellojpa.domain.Order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delivery extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;
    private Order order;
    private String city;
    private String zipcode;
    private DeliveryStatus status;
}
