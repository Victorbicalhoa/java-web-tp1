Classe a ser testada - ScientificCalculator.java
public class ScientificCalculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double a) {
        if (a < 0) throw new IllegalArgumentException("Negative number");
        return Math.sqrt(a);
    }

    public double log(double a) {
        if (a <= 0) throw new IllegalArgumentException("Log of non-positive number");
        return Math.log(a);
    }

    public double sin(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public double cos(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }
}
1 Configurando o ambiente de testes

Crie um projeto Java em sua IDE IntelliJ IDEA e adicione corretamente a dependência do JUnit 5. Faça a configuração necessária para que seja possível executar testes unitários com sucesso. Tire um print do ambiente configurado.

2 Escrevendo o primeiro teste

Implemente um teste chamado testAddition para verificar se o método add retorna corretamente o valor da soma de dois números. No final da implementação, execute o teste e responda:

 O que aparece no painel de execução?

Mostre o código do teste.
Tire um print do resultado.
Escreva o que significam os ícones e mensagens exibidas.
3 Aplicando as 4 fases de um teste

Crie um teste para o método subtract, utilizando as quatro fases de um teste unitário: setup, execution, assertion, e teardown (se aplicável). Comente no código onde cada fase está localizada.

4 Test Fixture com BeforeEach

Implemente um @BeforeEach para instanciar o objeto ScientificCalculator antes de cada teste. Mostre que o mesmo objeto pode ser reaproveitado entre diferentes métodos de teste.

5 Testando um cenário de sucesso (Happy Path)

Implemente um teste chamado testSquareRootPositive para verificar se o cálculo da raiz quadrada de um número positivo está correto.

6 Testando um cenário patológico (Corner Case)

Implemente um teste chamado testSquareRootNegative que verifica se o método squareRoot lança uma exceção apropriada ao receber um número negativo. Use assertThrows.

7 Cenário de exceção (divisão por zero)

Implemente um teste chamado testDivideByZero, verificando se o método divide lança IllegalArgumentException ao tentar dividir por zero.

8 Combinando múltiplas entradas (log e seno)

Implemente testes para os métodos log e sin, garantindo a precisão dos resultados esperados para valores positivos comuns.

9 Priorizando testes com base na cobertura e comportamento

Faça uma análise textual explicando:

Quais métodos da calculadora merecem mais atenção nos testes?
Como a cobertura de código pode ajudar a identificar lacunas?
10 Nomeando testes de forma adequada

Revise os nomes de todos os testes criados. Renomeie aqueles que não seguem boas práticas de clareza e expressividade. Explique sua escolha em dois exemplos.

11 Organizando os testes por comportamento

Organize seus testes em uma classe chamada ScientificCalculatorTest. Agrupe testes semelhantes (ex: testes de erro, testes de funções trigonométricas) usando comentários ou métodos auxiliares.
