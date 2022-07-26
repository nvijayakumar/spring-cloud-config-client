/**
 * 
 */
package org.vj.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author vijayakumar
 * @Since  26-Jul-2022
 *
 */

@Configuration
public class ClientConfiguration {

	@Value("${my.first.property}")
	private String myProperty;
	
	
	public String getMyProperty() {
		return myProperty;
	}
}
