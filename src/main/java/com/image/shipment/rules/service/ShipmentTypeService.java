package com.image.shipment.rules.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.image.shipment.rules.model.ShipmentTypeRequest;
import com.image.shipment.rules.model.ShipmentTypeResponse;

@Service
public class ShipmentTypeService {
	
	@Autowired
	private KieContainer kieContainer;

	public ShipmentTypeResponse getEngineRate(ShipmentTypeRequest shipmentTypeRequest) {
		ShipmentTypeResponse shipmentTypeResponse=new ShipmentTypeResponse();
		 KieSession kieSession = kieContainer.newKieSession();
	        kieSession.setGlobal("shipmentTypeResponse", shipmentTypeResponse);
	        kieSession.insert(shipmentTypeRequest);
	        kieSession.fireAllRules();
	        kieSession.dispose();
		return shipmentTypeResponse;
	}

}
