package br.com.dextra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/people")
public class PessoaService {

    @GET
    @Path("/{nome}")
    public Response sayHello(@PathParam("nome") String nome) {
        return Response.ok().entity(String.format("Buenas noches noite meu fiiii...... %s!!!", nome)).build();
    }

}
