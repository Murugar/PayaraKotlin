package com.iqmsoft.payara.kotlin

import javax.ws.rs.*
import javax.ws.rs.core.*
import javax.json.*

@ApplicationPath("api")
class TestApp : Application() {

}

@Path("test")
class TestResource {
    @GET
    fun hello(@QueryParam("name") name:String?): JsonObject{
        return Json.createObjectBuilder()
                .add("msg", "Payara Kotlin " + name)
                .build()
    }
}

