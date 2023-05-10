package com.example.projectuts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Animal(
    val imgAnimal: Int,
    val nameAnimal: String,
    val descAnimal: String
) : Parcelable
