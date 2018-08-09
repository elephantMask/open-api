package com.open.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>Title: SwaggerConfiguration . </p>
 * <p>Swagger配置文件  </p>
 *
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-06-08 上午11:29
 */
@Configuration
@EnableSwagger2
@Profile({"dev"})
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).
                //用来创建该Api的基本信息
                apiInfo(apiInfo()).
                //暴露哪些接口来访问
                select().
                //此处暴露整个controller包下类
                apis(RequestHandlerSelectors.basePackage("com.open.api.web")).
                paths(PathSelectors.any()).
                build();
    }

    private ApiInfo apiInfo(){
        //标题
        return new ApiInfoBuilder().title("对接平台管理系统").
                //描述
                description("对接平台接口简介").
                contact(new Contact("向铭涛","","xmto8sky@126.com")).
                build();
    }
}
