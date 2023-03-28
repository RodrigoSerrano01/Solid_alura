package rh.src.br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import rh.src.br.com.alura.rh.model.Funcionario;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;


    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDofuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v->v.validar(funcionario,aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}
