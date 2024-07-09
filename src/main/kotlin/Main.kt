fun generatePrimes(n: Int): List<Int> {
    if (n < 1) return emptyList()

    val primes = mutableListOf<Int>()
    var candidate = 2

    while (primes.size < n) {
        var isPrime = true
        for (prime in primes) {
            if (candidate % prime == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(candidate)
        }
        candidate++
    }

    return primes
}

fun main() {
    val numberOfPrimes = 10
    val primes = generatePrimes(numberOfPrimes)
    println("First $numberOfPrimes prime numbers: $primes")
}
