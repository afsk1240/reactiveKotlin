package com.example.demo.router

import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Slf4j
@Component
class DemoHandler(val demoService: DemoService) {

    fun post(serverRequest: ServerRequest): Mono<ServerResponse> =
            ServerResponse.ok().body(demoService.post(serverRequest.bodyToFlux(DemoModel::class.java)), DemoResponse::class.java)
}
