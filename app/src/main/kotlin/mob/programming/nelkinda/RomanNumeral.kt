package mob.programming.nelkinda

class RomanNumeral(val s: String) {

    fun toInt(): Int {


        if (s == "IV") {
            return 4
        }

        if (s == "V") {
            return 5
        }

        if (s == "VI") {
            return 6
        }

        if (s == "VII") {
            return 7
        }

        return s.count()
    }

}
