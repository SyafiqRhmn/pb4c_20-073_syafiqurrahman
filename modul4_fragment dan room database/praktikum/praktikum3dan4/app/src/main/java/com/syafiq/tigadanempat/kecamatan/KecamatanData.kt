package com.syafiq.tigadanempat.kecamatan

object KecamatanData {
    private var data = arrayOf(
        arrayOf(
            "Ambunten"),
        arrayOf(
            "Arjasa"),
        arrayOf(
            "Batang-Batang"),
        arrayOf(
            "Batuan"),
        arrayOf(
            "Batu Putih"),
        arrayOf(
            "Bluto"),
        arrayOf(
            "Dasuk" ),
        arrayOf(
            "Dungkek"),
        arrayOf(
            "Ganding"),
        arrayOf(
            "Gapura"),
        arrayOf(
            "Gayam"),
        arrayOf(
            "Gili Genting"),
        arrayOf(
            "Guluk-Guluk"),
        arrayOf(
            "Kalianget"),
        arrayOf(
            "Kangayan"),
        arrayOf(
            "Kota Sumenep"),
        arrayOf(
            "Lenteng"),
        arrayOf(
            "Manding"),
        arrayOf(
            "Masalembu"),
        arrayOf(
            "Nonggunong"),
        arrayOf(
            "Pasongsongan"),
        arrayOf(
            "Pragaan"),
        arrayOf(
            "Ra'as"),
        arrayOf(
            "Rubaru"),
        arrayOf(
            "Sapeken"),
        arrayOf(
            "Saronggi"),
        arrayOf(
            "Talango")

    )

    val listData: ArrayList<Kecamatan>
        get() {
            val list = ArrayList<Kecamatan>()
            for (aData in data) {
                val kecamatan = Kecamatan()
                kecamatan.name = aData[0]

                list.add(kecamatan)
            }
            return list
        }
}