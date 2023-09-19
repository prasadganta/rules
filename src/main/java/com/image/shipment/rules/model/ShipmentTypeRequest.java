package com.image.shipment.rules.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ShipmentTypeRequest  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private ShipmentType shipmentType;
    private Shipment shipment;

}
