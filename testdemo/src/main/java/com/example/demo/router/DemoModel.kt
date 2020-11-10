package com.example.demo.router

import java.time.LocalDateTime
import javax.validation.constraints.NotBlank

class DemoModel (@NotBlank id: String,@NotBlank data: Map<String,String>,@NotBlank createDateTime : LocalDateTime,@NotBlank source : String,@NotBlank version : Double= 1.0 ){}
