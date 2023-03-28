package rh.src.br.com.alura.rh.service.reajuste;

import rh.src.br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

     void validar (Funcionario funcionario, BigDecimal aumento);
}
