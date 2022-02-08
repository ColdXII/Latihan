fun main()
{
    //menggunakan when
    val hari = 4

    val Days = when(hari)
    {
        in 2 .. 5 -> "Kerja"
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"

        else -> "Tidak ada dalam kalender"
    }

    println(Days)
}