package com.image.shipment.rules.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipmentType implements Serializable {
	private static final long serialVersionUID = 1L;
	private String zipCode;
	private int distance;
	private int rate;
	private int zone;

}
