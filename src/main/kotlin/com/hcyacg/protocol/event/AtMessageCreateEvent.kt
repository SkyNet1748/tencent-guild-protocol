package com.hcyacg.protocol.event

import com.hcyacg.protocol.anno.NoArg
import kotlinx.coroutines.runBlocking


@NoArg
class AtMessageCreateEvent : EventApi() {


    fun messageContent(): String {
        return content.replace(Regex("<@!\\d+>"), "")
    }

}