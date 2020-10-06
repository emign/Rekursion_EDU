import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testFib4() {
         Assert.assertEquals(3, fib(4))
    }
    @Test fun testFib20() {
        Assert.assertEquals(6765, fib(20))
    }
    @Test fun testFib30() {
        Assert.assertEquals(832040, fib(30))
    }
    @Test fun testFib0() {
        Assert.assertEquals(1, fib(1))
    }
    @Test fun testFib2() {
        Assert.assertEquals(1, fib(2))
    }

}