package br.com.dextra;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaServiceTest {

    @Test
    public void testSayHello() {
        PessoaService service = new PessoaService();
        assertEquals(service.sayHello("francisco").getEntity(), "Buenas noches noite meu fiiii...... francisco!!!");
    }
}