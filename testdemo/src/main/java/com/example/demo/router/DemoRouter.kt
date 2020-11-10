package com.example.demo.router

import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RequestPredicates.contentType
import org.springframework.web.reactive.function.server.RouterFunctions

class DemoRouter {
    @Bean
    fun routes(demoHandler: DemoHandler) = RouterFunctions.route(RequestPredicates.POST("/demo")
            .and(contentType(APPLICATION_JSON)),demoHandler::post)
}



