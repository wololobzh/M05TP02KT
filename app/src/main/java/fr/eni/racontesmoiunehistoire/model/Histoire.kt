package fr.eni.racontesmoiunehistoire.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Histoire(val prenom: String = "Simon", val lieu: String = "Chateau"): Parcelable

data class Histoire1(val prenom: String = "Simon", val lieu: String = "Chateau")

data class Histoire2(val prenom: String = "Simon", val lieu: String = "Chateau")

data class Histoire3(val prenom: String = "Simon", val lieu: String = "Chateau")