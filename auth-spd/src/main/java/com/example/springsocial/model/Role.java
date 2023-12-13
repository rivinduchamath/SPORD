package com.example.springsocial.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
public class Role {

    // Used Model Mapper. So, Attributes Should be Equals in Entity and Dto both Sides.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roleName;

    @ElementCollection
    private List<String> permission;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(Long id) {
        this.id = id;
    }
    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
    public Role(Long id, String roleName, List<String> permission, List<User> user) {
        this.id = id;
        this.permission = permission;
        this.roleName = roleName;
        this.users = user;
    }
}
