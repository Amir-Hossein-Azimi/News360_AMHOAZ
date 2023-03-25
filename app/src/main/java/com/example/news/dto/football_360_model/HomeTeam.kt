package com.example.news.dto.football_360_model

data class HomeTeam(
    val country: CountryX,
    val full_title: String,
    val id: String,
    val is_active: Boolean,
    val is_national: Boolean,
    val logo: String,
    val slug: String,
    val thumbnail: String,
    val title: String,
    val to_be_decided: Boolean
)