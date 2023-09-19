package com.image.shipment.rules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.image.shipment.rules.model.ShipmentTypeRequest;
import com.image.shipment.rules.model.ShipmentTypeResponse;
import com.image.shipment.rules.service.ShipmentTypeService;

@RestController
@RequestMapping("/api")
public class EngineRateController {
	
	@Autowired
	ShipmentTypeService shipmentTypeService;
	
	@PostMapping("/engineRate")
    public ResponseEntity<ShipmentTypeResponse> getCustomer(@RequestBody ShipmentTypeRequest shipmentTypeRequest) {
        ShipmentTypeResponse engineRateRes = shipmentTypeService.getEngineRate(shipmentTypeRequest);
        return new ResponseEntity<>(engineRateRes, HttpStatus.OK);
    }

}
