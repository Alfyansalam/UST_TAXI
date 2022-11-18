package com.example.spring.offerride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.spring.offerride.ResourceNotFoundException;
import com.example.spring.offerride.model.OfferRide;
import com.example.spring.offerride.repository.OfferRideRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class OfferRideController {

    @Autowired
    private OfferRideRepository offerrideRepository;

    @PostMapping("/offer")
    public OfferRide addOffer(@RequestBody OfferRide offerride) {
        return offerrideRepository.save(offerride);
    }


    @GetMapping("/offer")
    public ResponseEntity<List<OfferRide>> getAllofferride() {

        return ResponseEntity.ok(offerrideRepository.findAll());
    }

    @GetMapping("/offer/{u_id}")
    public ResponseEntity<OfferRide> getOfferById(@PathVariable(value = "u_id") Integer id)
            throws ResourceNotFoundException {
        OfferRide offerrideRespository = offerrideRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("OfferRide not found for this id :: " + id));
        return ResponseEntity.ok().body(offerrideRespository);
    }

    @PutMapping("/offer/{u_id}")
    public ResponseEntity<OfferRide> updateOffer(@PathVariable(value = "u_id") Integer id,
   
                                                   @RequestBody OfferRide Details) throws ResourceNotFoundException {
    	OfferRide offerride = offerrideRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("OfferRide not found for this id :: " + id));
    	offerride.setU_id(Details.getU_id());
    	offerride.setName(Details.getName());
    	offerride.setV_no(Details.getV_no());
    	offerride.setPhone(Details.getPhone());
    	offerride.setStart_point(Details.getStart_point());
    	offerride.setDest_point(Details.getDest_point());
    	offerride.setStart_time(Details.getStart_time());
    	offerride.setDest_time(Details.getDest_time());
    	offerride.setLicense_no(Details.getLicense_no());
    	offerride.setPrice(Details.getPrice());
        

        final OfferRide updated = offerrideRepository.save(offerride);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/offer/{u_id}")
    public Map<String, Boolean> deleteOffer(@PathVariable(value = "u_id") Integer id)
            throws ResourceNotFoundException {
        OfferRide offerride = offerrideRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("OfferRide not found for this id :: " + id));

        offerrideRepository.delete(offerride);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

