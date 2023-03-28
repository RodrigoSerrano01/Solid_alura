package rh.src.br.com.alura.rh.service.reajuste;

import rh.src.br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

    public void validar (Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataULocalDate = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataULocalDate,dataAtual);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new br.com.alura.rh.ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
        }
    }
}
