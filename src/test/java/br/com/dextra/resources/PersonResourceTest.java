package br.com.dextra.resources;

import br.com.dextra.entity.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonResourceTest {

    @Test
    public void testSayHello() {
        PersonResource service = new PersonResource();
        final Person chico = (Person) service.sayHello("Francisco", "Portillo").getEntity();
        assertEquals("Francisco", chico.getFirstName());
        assertEquals("Portillo", chico.getLastName());
    }
}