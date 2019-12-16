package com.dss.order.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger基础信息配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private Swagger2MetaConfig metaConfig;

    @Bean
    public Docket createRestApi() {
        //添加head参数start
        /*ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("authorization").description("令牌").
                modelRef(new ModelRef("string")).
                parameterType("header").required(false).build();
        pars.add(tokenPar.build());*/
        //添加head参数end

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(RequestMapping.class))
                .apis(RequestHandlerSelectors.basePackage(metaConfig.getScanpath()))
                .paths(PathSelectors.any())
                .build()
                //.globalOperationParameters(pars)
                ;

    }

    private ApiInfo buildApiInfo() {
        Contact contact = new Contact(metaConfig.getName(), metaConfig.getUrl(), metaConfig.getEmail());
        return new ApiInfoBuilder()
                .title(metaConfig.getTitle())
                .version(metaConfig.getVersion())
                .contact(contact)
                .description(metaConfig.getDescription())
                .build();
    }


    /*@Bean
    public Docket createRestAPI() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                // 标题
                .title("A Test Api for YAPI")
                // 描述
                .description("RESTFUL API文档")
                // API服务端地址
                .termsOfServiceUrl("http://localhost:8889")
                // 版本
                .version("1.0")
                // 作者
                .contact(new Contact("fugithubs", "", "fuxiaorong@kqgeo.com"))
                .build();
        //添加head参数start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("authorization").description("令牌").
                modelRef(new ModelRef("string")).
                parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        //添加head参数end
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                // API基础包
                .apis(RequestHandlerSelectors.basePackage("com.dss.order.controller"))
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }*/
}
