package com.bignerdranch.android.finnesretrofitmvvm.domain.models.data


import java.time.LocalDateTime
import java.util.*

data class Data3AgeHeightWeightStorage(

    var id: Int? = null,
    var age: Int = 18,
    var height: Int = 140,
    var weight: String = "40.0",
    var desired_weight: String = "40.0",
    var date: String = LocalDateTime.now().toString().split("T")[0],
    var fitness_id:Int? = null,
)