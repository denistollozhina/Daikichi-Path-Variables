package com.denistollozhina.daikichicontroller;

import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {

    // Route with path variable for travel destination
    @GetMapping("/daikichi/travel/{city}")
    public String travelToCity(@PathVariable String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }

    // Route with path variable for lotto number
    @GetMapping("/daikichi/lotto/{number}")
    public String checkLottoNumber(@PathVariable int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }

    // Other routes and methods...

}