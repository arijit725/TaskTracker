package org.arijit.task.traker.resources;

import org.arijit.task.traker.dto.TaskDto;
import org.arijit.task.traker.store.IStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/task")
@Produces(MediaType.APPLICATION_JSON)
public class TaskResources {

    private static final Logger logger = LoggerFactory.getLogger(TaskResources.class);

    private final IStore store;
    public TaskResources(IStore store){
        this.store = store;
    }
    @GET
    @Path("/{id}")
    public Response getTask(@PathParam("id") String id){
        TaskDto taskDto = new TaskDto("202103231",System.currentTimeMillis(),"sample task1","this is my task");
        logger.info("Retruning TaskDto : "+taskDto);
        return Response.ok(taskDto).build();
    }

    @POST
    public Response createTask(@FormParam("date")long date, @FormParam("subject") String subject, @FormParam("details") String details){
        logger.info("Received Create Task Request: ");
        return Response.created(null).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteTask(@PathParam("id") String id){
        return Response.noContent().build();
    }


//    @PUT
//    @Path("/{id}")
//    public Response updateTask(@PathParam("id") String id, @FormParam("subject") String subject, @FormParam("details") String details){
//        return Response.ok(new TaskDto(id,System.currentTimeMillis(), subject,details)).build();
//    }

    @PUT
    @Path("/{id}")
    public Response updateTask(@PathParam("id") String id, TaskDto taskDto){
        return Response.ok(new TaskDto(id,System.currentTimeMillis(), taskDto.getSubject(),taskDto.getDetails())).build();
    }
}
