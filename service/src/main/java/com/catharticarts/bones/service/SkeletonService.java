package com.catharticarts.bones.service;

import com.catharticarts.bones.model.Skeleton;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Path("/skeleton")
public interface SkeletonService {

    @GET
    @Path("/{id}")
    Skeleton getSkeleton(@PathParam("id") String id);

    @POST
    Skeleton addSkeleton(@PathParam("id") String id, Skeleton skeleton);

    @PUT
    @Path("/{id}")
    Skeleton updateSkeleton(@PathParam("id") String id, Skeleton skeleton);

    @DELETE
    @Path("/{id}")
    void deleteSkeleton(@PathParam("id") String id);

    @GET
    List<Skeleton> getSkeletons();

}
