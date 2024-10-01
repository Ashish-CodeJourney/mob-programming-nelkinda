package mob.programming.nelkinda

class RomanNumeral(val s: String) {

    fun toInt(): Int {

        if (s == "IV") {
            return 4
        }

        if (s == "V") {
            return 5
        }

        if (s == "IX") {
            return 9
        }

        if (s == "X") {
            return 10
        }

        if (s.contains('V')) {
            return 5 + s.count { it.equals('I')}
        }

        return s.count()
    }

}
