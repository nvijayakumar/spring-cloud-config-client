/**
 * 
 */
package org.vj.springcloud.controller;

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

	@GetMapping("/login")
	public String context() {
		return new ClientConfiguration().getMyProperty();
	}
}
