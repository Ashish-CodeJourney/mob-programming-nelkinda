package mob.programming.nelkinda

class RomanNumeral(val s: String) {

    fun toInt(): Int {
        if(s.contains('V')) {
            return numeralContaining('V', 5)
        } else if (s.contains('X')) {
            return numeralContaining('X', 10)
        } else {
            return s.count()
        }
    }

    private fun numeralContaining(numeral: Char, value: Int): Int {
        if (s == "I" + numeral) {
            return value - 1
        } else if (s == numeral.toString()) {
            return value
        } else {
            return value + s.count { it.equals('I') }
        }
    }

}
