package com.example.smile.kotlinxretrosample

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
class Field {
    var userId = ""
    var id = 1
    var title = ""
    var completed = false
    @Optional
    var isOptional: Boolean = false
    @Transient
    var isTransient: Boolean = false
}