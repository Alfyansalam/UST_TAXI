package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/offerrideServiceFallBack")
    public String offerrideFallBackMethod() {
        return "offerride Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/passengertServiceFallBack")
    public String passengerServiceFallBackMethod() {
        return "passenger Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/loginServiceFallBack")
    public String loginServiceFallBackMethod() {
        return "login Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallBackMethod() {
        return "payment Service is taking longer than Expected." +
                " Please try again later";
    }
}
