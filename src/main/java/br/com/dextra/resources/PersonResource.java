package br.com.dextra.resources;

import br.com.dextra.entity.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/person")
public class PersonResource {

    @GET
    @Path("/{firstName}/{lastName}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello(@PathParam("firstName") String first, @PathParam("lastName") String last) {
        return Response.ok(new Person(first, last)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sayNiceToMeetYou(Person person) {
        return Response.created(URI.create(String.format("/%s/%s", person.getFirstName(), person.getLastName()))).build();
    }

}
