package com.cc.cn.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 配置文件
 *
 * @author qingyan.guo
 * @version V1.0
 * @date 2018/8/31 11:20
 */
@Configuration
@EnableSwagger2
public class swagger2 {

	/**
	 * 注意-接口所在包路径
	 */
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				//接口所在包路径
				.apis(RequestHandlerSelectors.basePackage("com.cc.cn.springbootdemo.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	/**
	 * API文档描述
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				//标题
				.title("Spring Boot集成swagger ui")
				//作者
				.contact(new Contact("owlAdmin", "http://www.cnowl.com", "owl_email@163.com"))
				//版本
				.version("1.0")
				//描述
				.description("描述")
				.build();
	}
}
