fun fib(n : Int) : Int {
    return when {
        n <= 2 -> 1
        else -> fib(n-1)+fib(n-2)
    }
}