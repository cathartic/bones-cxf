package com.catharticarts.bones.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Skeleton {

    @Id
    private String id;
    private String name;
    private List<Bone> bones;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Bone> getBones() { return bones; }

    public void setBones(List<Bone> bones) { this.bones = bones; }

}
