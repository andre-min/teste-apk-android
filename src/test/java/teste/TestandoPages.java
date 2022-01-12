package teste;

import org.junit.Test;
import pages.Alunos;
import utils.Dsl;

public class TestandoPages extends Dsl {

    @Test
     public void adicionarAlunos(){
        Alunos alunos = new Alunos();
        alunos.adicionarNovosAlunosNaLista();

    }
}
