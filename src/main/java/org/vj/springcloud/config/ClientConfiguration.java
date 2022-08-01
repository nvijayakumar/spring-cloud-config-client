/**
 * 
 */
package org.vj.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author vijayakumar
 * @Since  26-Jul-2022
 *
 */

@Configuration
@RefreshScope
public class ClientConfiguration {

	@Value("${my.first.property}")
	private String myProperty;
	
	
	public String getMyProperty() {
		return myProperty;
	}
}
