import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testFak5() {
        Assert.assertEquals(120, fak(5))
    }
    @Test fun testFak0() {
        Assert.assertEquals(1, fak(0))
    }
    @Test fun testFak10() {
        Assert.assertEquals(3628800, fak(10))
    }
    @Test fun testFak14() {
        Assert.assertEquals(87178291200, fak(14))
    }
}