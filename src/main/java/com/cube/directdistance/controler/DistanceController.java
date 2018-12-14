package com.cube.directdistance.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {
	
	@RequestMapping( method=RequestMethod.GET, path = "/distance" )
	public long getDistance( @RequestParam( name="addr1" ) String addr1, @RequestParam( name="addr2" )String addr2 ) {
		return 10;
	}

}
