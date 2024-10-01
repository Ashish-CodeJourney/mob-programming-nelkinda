package mob.programming.nelkinda

class RomanNumeral(val s: String) {
    fun toInt(): Int {
        if (s == "IV") {
            return 4
        }
        val count = s.count()
        return count
    }

}
