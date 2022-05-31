package com.example.colorpicker

class ColorObject(var name: String, var hex: String, var contrastHex: String)
{
    val  hexHash: String = "#$hex"
    val  contrastHexHash: String = "#$contrastHex"
}

//https://youtu.be/YsKjl8ZbM4g