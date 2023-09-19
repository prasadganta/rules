package com.image.shipment.rules.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Shipment implements Serializable{

	private static final long serialVersionUID = 1L;
	private String serviceType;
    private int weight;
    private int duration;
    private int rate;

}
