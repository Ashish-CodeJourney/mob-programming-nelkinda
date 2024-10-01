package mob.programming.nelkinda

class RomanNumeral(val s: String) {
    fun toInt(): Int {
        if (s == "IV") {
            return 4
        }
        if (s == "V") {
            return 5
        }

        val count = s.count()
        return count
    }

}
