package org.shop.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GateWayApplication {

    // java代码方式配置路由信息
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route( r -> r.path("/jd")
//                    .uri("http://jd.com:80/").id("jd_route")
//                ).build();
//    }


    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
