package pages;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Dsl;


public class Alunos extends Dsl {
    public void adicionarNovosAlunosNaLista(){
        aguardarPorTexto("Lista de alunos");
        esperar(200);
        MobileElement adicionarBotao = getDriver().findElement(By.id("br.com.alura.agenda:id/activity_lista_alunos_" +
                "fab_novo_aluno"));
        adicionarBotao.click();
        aguardarPorTexto("Novo aluno");
        getCampoNome().sendKeys("Andre teste");
        getCampoNumeroTelefone().sendKeys("11 12345678");
        getCampoEmail().sendKeys("andre@xds.com.br");
        clicarPorTexto("SALVAR");
        aguardarPorTexto("Lista de alunos");
        Assert.assertEquals("Andre teste", obterTexto(By.xpath("//*[@class='android.widget.TextView' and " +
                "@index='0' and @resource-id='android:id/text1']")));
        esperar(300);

        adicionarBotao.click();
        aguardarPorTexto("Novo aluno");
        getCampoNome().sendKeys("Moraes SM");
        getCampoNumeroTelefone().sendKeys("11 98765432");getDriver().findElement(By.id("br.com.alura." +
                "agenda:id/activity_formulario_aluno_email"));
        getCampoEmail().sendKeys("moraes@teste.com.br");
        clicarPorTexto("SALVAR");
        aguardarPorTexto("Lista de alunos");
        Assert.assertEquals("Moraes SM",obterTexto(By.xpath("//*[@class='android.widget.TextView' and " +
                "@index='1']")));
        esperar(300);

        adicionarBotao.click();
        aguardarPorTexto("Novo aluno");
        getCampoNome().sendKeys("Sanada Swift");
        getCampoNumeroTelefone().sendKeys("11 34567890");
        getCampoEmail().sendKeys("sanada@teste.com.br");
        clicarPorTexto("SALVAR");
        aguardarPorTexto("Lista de alunos");
        Assert.assertEquals("Sanada Swift", obterTexto(By.xpath("//*[@class='android.widget.TextView' and " +
                "@index='2']")));
        esperar(300);

        adicionarBotao.click();
        aguardarPorTexto("Novo aluno");
        getCampoNome().sendKeys("Alef Node.js");
        getCampoNumeroTelefone().sendKeys("11 90987654");
        getCampoEmail().sendKeys("alef@teste.com.br");
        clicarPorTexto("SALVAR");
        aguardarPorTexto("Lista de alunos");
        Assert.assertEquals("Alef Node.js", obterTexto(By.xpath("//*[@class='android.widget.TextView' and " +
                "@index='3']")));
        esperar(300);

        adicionarBotao.click();
        aguardarPorTexto("Novo aluno");
        getCampoNome().sendKeys("Vinicius Back");
        getCampoNumeroTelefone().sendKeys("11 97654123");
        getCampoEmail().sendKeys("vinicius@teste.com.br");
        clicarPorTexto("SALVAR");
        aguardarPorTexto("Lista de alunos");
        Assert.assertEquals("Vinicius Back", obterTexto(By.xpath("//*[@class='android.widget.TextView' and " +
                "@index='4']")));
        esperar(300);



        getDriver().navigate().back();

        esperar(300);

        getDriver().navigate().back();


    }

    private MobileElement getCampoNome() {
        return getDriver().findElement(By.id("br.com.alura.agenda:id/activity_formulario_aluno_nome"));
    }
    private MobileElement getCampoNumeroTelefone(){
        return getDriver().findElement(By.id("br.com.alura.agenda:id/activity_formulario_aluno_telefone"));
    }
    private MobileElement getCampoEmail(){
        return getDriver().findElement(By.id("br.com.alura.agenda:id/activity_formulario_aluno_email"));
    }

}
