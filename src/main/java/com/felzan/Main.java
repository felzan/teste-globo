package com.felzan;

import java.util.Random;

/*
    No nosso serviço de pagamentos recebemos um valor a cobrar do cliente
    e durante o processamento decidemos qual gateway de pagamento será utilizado (retornado pela funcao getGateway())

    Seu desafio é propor um código que em tempo de execução chame a função de captura do gateway escolhido.

    Dica: comece simples, resolvendo o problema e depois tente isolar os componentes.
*/
public class Main {
    
    private static final String GATEWAY_A = "GatewayA";
    private static final String GATEWAY_B = "GatewayB";

    public static void main(String[] args) {
        // Código para chamar o gateway
        System.out.println("Continua o resto do processamento.");
    }

    // Função que retorna o gateway
    private static String getGateway() {
        Random random = new Random();
        return random.nextBoolean() ? GATEWAY_A : GATEWAY_B;
    }
}