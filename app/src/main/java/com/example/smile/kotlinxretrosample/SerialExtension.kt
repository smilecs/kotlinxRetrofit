package com.example.smile.kotlinxretrosample

import kotlinx.serialization.json.JSON

fun String.toField(): Field {
    return JSON.parse(Field.serializer(), this)
}

fun Field.toJsonBody(): String {
    return JSON.stringify(Field.serializer(), this)
}