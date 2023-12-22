package com.example.uas_ppapb;

// data class `FilmUserData` digunakan untuk merepresentasikan informasi film pada bagian pengguna (user)
// setiap properti pada data class ini merepresentasikan atribut dari sebuah film, seperti judul, sutradara
// durasi, rating, sinopsis, dan URL gambar
// data class ini digunakan untuk menyimpan data film ketika diambil dari Firebase atau digunakan di bagian pengguna aplikasi
class FilmUserData(
    val title : String?= null,
    val director : String?= null,
    val durasi : String? = null,
    val rating : String?= null,
    val sinopsis : String?= null,
    val imageUrl : String?= null,
)
