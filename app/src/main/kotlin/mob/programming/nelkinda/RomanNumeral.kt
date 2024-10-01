package mob.programming.nelkinda

class RomanNumeral(val s: String) {
    fun toInt(): Int {
        if (s == "I") {
            return 1
        } else if (s == "II") {
            return 2
        } else {
            return 3
        }
    }

}
