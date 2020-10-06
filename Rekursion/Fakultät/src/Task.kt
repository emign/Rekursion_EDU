fun fak(n : Int) : Long {
    return when {
        n == 0 -> 1
        else -> fak(n-1)*n
    }
}