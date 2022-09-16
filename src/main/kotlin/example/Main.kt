package example

import io.mockk.every
import io.mockk.mockk

class MockTarget {
    fun func(): JavaEnum = JavaEnum.A
}

fun main() {
    val mock = mockk<MockTarget>()
    every { mock.func() } returns JavaEnum.A

    mock.func() // throws KotlinReflectionInternalError
}
