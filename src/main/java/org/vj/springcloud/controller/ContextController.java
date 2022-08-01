/**
 * 
 */
package org.vj.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vj.springcloud.config.ClientConfiguration;

/**
 * @author vijayakumar
 * @Since  26-Jul-2022
 *
 */
@RequestMapping
@RestController
public class ContextController {

	@Autowired
	ClientConfiguration clientConfiguration;
	
	@GetMapping(path = {"/login"}, produces = {"plain/text"})
	public ResponseEntity<String> context() {
		System.out.println("Inside the controller.");
		String property = clientConfiguration.getMyProperty();
		System.out.println("property value is " + property);
		return new ResponseEntity<String>(property, HttpStatus.OK);
	}
}
