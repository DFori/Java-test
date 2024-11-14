class MathTest {
    @Test
    public void testMathSum() {
        // Arrange
        int a = 5;
        int b = 10;
        int expected = 15;

        // Act
        int result = Math.addExact(a, b);

        // Assert
        assertEquals(expected, result);
    }
}