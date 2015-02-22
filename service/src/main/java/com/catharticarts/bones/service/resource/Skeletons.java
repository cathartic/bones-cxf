package com.catharticarts.bones.service.resource;

import com.catharticarts.bones.model.Skeleton;
import com.catharticarts.bones.repository.SkeletonRepository;
import com.catharticarts.bones.service.SkeletonService;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("skeletonService")
public class Skeletons implements SkeletonService {
    @Autowired
    private SkeletonRepository repository;

    @Override
    public Skeleton getSkeleton(String id) {
        return repository.findOne(id);
    }

    @Override
    public Skeleton addSkeleton(String id, Skeleton skeleton) {
        return repository.insert(skeleton);
    }

    @Override
    public Skeleton updateSkeleton(String id, Skeleton skeleton) {
        return repository.save(skeleton);
    }

    @Override
    public void deleteSkeleton(String id) {
        repository.delete(id);
    }

    @Override
    public List<Skeleton> getSkeletons() {
        return repository.findAll();
    }
}
