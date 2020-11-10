package com.example.demo.router

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Slf4j
@Service
class DemoService {

    val logger = LoggerFactory.getLogger(DemoService::class.java)

    fun post(demoModelFlux : Flux<DemoModel>)=demoModelFlux.flatMap {
        logger.debug("demoModel : {}",it)
        Flux.just(DemoResponse(it,true))
    }
}
