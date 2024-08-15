package com.dghs.citizenportal.awaztulun.ui.awaztulun.model

import com.google.gson.annotations.SerializedName

data class AppVersionResponse(
    @SerializedName("version") var version: String = "",
)
