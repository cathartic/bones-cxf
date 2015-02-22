package com.catharticarts.bones.repository;

import com.catharticarts.bones.model.Skeleton;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkeletonRepository extends MongoRepository<Skeleton, String> {

    public Skeleton findByName(String name);
}
