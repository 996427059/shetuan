package com.gxwuz.ly.shetuan.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "shetuan")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Shetuan {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer shetuanId;

    @Column
    private Integer typeId;

    @Column
    private String shetuanName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "stuNo")
    private Set<User> members;

    public Integer getShetuanId() {
        return shetuanId;
    }

    public void setShetuanId(Integer shetuanId) {
        this.shetuanId = shetuanId;
    }

    public String getShetuanName() {
        return shetuanName;
    }

    public void setShetuanName(String shetuanName) {
        this.shetuanName = shetuanName;
    }

    public Set<User> getMembers() {
        return members;
    }

    public void setMembers(Set<User> members) {
        this.members = members;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
