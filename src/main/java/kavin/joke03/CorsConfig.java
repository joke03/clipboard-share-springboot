package kavin.joke03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Description: 配置跨域访问
 */
@Configuration
public class CorsConfig {
	private CorsConfiguration buildConfig() {
		CorsConfiguration cf = new CorsConfiguration();
		cf.addAllowedOrigin("*"); //允许任何域名使用
		cf.addAllowedHeader("*"); //允许任何头
		cf.addAllowedMethod("*"); //允许任何方法(post、get)等
		return cf;
	}
	
	@Bean
	public CorsFilter corsFileter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", buildConfig()); //对接口配置跨域
		return new CorsFilter(source);
	}
}
