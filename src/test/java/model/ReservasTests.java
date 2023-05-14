package model;

import br.cesjf.hotellucena.model.Apartamento;
import br.cesjf.hotellucena.model.Categoria;
import br.cesjf.hotellucena.model.Reservas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class ReservasTests {

    @Test
    public void testCamaExtra() {
        // Criação dos objetos necessários para o teste
        Reservas reserva = new Reservas();
        Apartamento apartamento = new Apartamento();
        Categoria cat = new Categoria(5);
        apartamento.setCategoriacodigoCategoria(cat);
        apartamento.getCategoriacodigoCategoria().setCapacidade(4);
        apartamento.getCategoriacodigoCategoria().setValorDiaria(100.0f);
        reserva.setApartamentocodigoApartamento(apartamento);

        // Teste do método camaExtra
        Double camaExtra = reserva.camaExtra(reserva);

        // Verificação do resultado
        Assertions.assertEquals(100.0d, camaExtra);
    }

    @Test
    public void testPermanencia() {
        // Criação dos objetos necessários para o teste
        Reservas reserva = new Reservas();
        Date dataEntrada = new Date();
        Date dataSaida = new Date(dataEntrada.getTime() + 5 * 24 * 60 * 60 * 1000); // Adiciona 5 dias a data de entrada
        reserva.setDataEntrada(dataEntrada);
        reserva.setDataSaida(dataSaida);

        // Teste do método permanencia
        long duracao = reserva.permanencia(reserva);

        // Verificação do resultado
        Assertions.assertEquals(5, duracao);
    }

}
