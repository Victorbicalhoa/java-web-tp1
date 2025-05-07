package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    private ScientificCalculator calculator;

    // SETUP: Inicializa o objeto antes de cada teste
    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    // -------------------------
    // Testes de Operações Básicas
    // -------------------------

    // EXECUTION: Testa o método add
    @Test
    void testAddition() {
        double resultado = calculator.add(2, 3);

        // ASSERTION: Verifica se o resultado está correto
        assertEquals(5, resultado, 0.0001, "A soma deveria ser 5");
    }

    // EXECUTION: Testa o método subtract
    @Test
    void testSubtraction() { // Corrigida chamada do método
        double resultado = calculator.subtract(7, 3);

        // ASSERTION: Verifica se o resultado está correto
        assertEquals(4, resultado, 0.0001, "A subtração deveria resultar em 4");
    }

    // -------------------------
    // Testes de Funções Matemáticas complexas
    // -------------------------

    // EXECUTION: Testa o cálculo da raiz quadrada de um número positivo
    @Test
    void testSquareRootPositive() {
        double resultado = calculator.squareRoot(16);

        // ASSERTION: Verifica se o resultado está correto
        assertEquals(4.0, resultado, 0.0001, "A raiz quadrada de 16 deveria ser 4.0");
    }

    // EXECUTION: Testa o cálculo do logaritmo de um número positivo
    @Test
    void testLogPositive() {
        double resultado = calculator.log(10);

        // ASSERTION: Verifica se o resultado está correto
        assertEquals(2.30258, resultado, 0.0001, "O logaritmo de 10 deveria ser aproximadamente 2.30258");
    }

    // -------------------------
    // Testes de Funções Trigonométricas
    // -------------------------

    // EXECUTION: Testa o cálculo do seno para um valor positivo comum
    @Test
    void testSinPositive() {
        double resultado = calculator.sin(30);

        // ASSERTION: Verifica se o resultado está correto
        assertEquals(0.5, resultado, 0.0001, "O seno de 30 graus deveria ser aproximadamente 0.5");
    }

    // -------------------------
    // Testes de Exceções
    // -------------------------

    // EXECUTION: Testa se squareRoot lança uma exceção para número negativo
    @Test
    void testSquareRootException() { // Renomeado de testSquareRootNegative
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4),
                "Deveria lançar IllegalArgumentException para números negativos");
    }

    // EXECUTION: Testa se divide lança uma exceção ao dividir por zero
    @Test
    void testDivisionException() { // Renomeado de testDivideByZero
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0),
                "Deveria lançar IllegalArgumentException ao dividir por zero");
    }

    // TEARDOWN: Libera recursos ou realiza limpeza, se necessário
    @AfterEach
    void tearDown() {
        calculator = null;
    }
}
