package com.chtrembl.petstore.pet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.chtrembl.petstore.pet.entity.Category;
import com.chtrembl.petstore.pet.entity.Tag;

import org.springframework.boot.context.properties.bind.Name;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pet")
public class Pet {
    @Id
    private Long id;

    @ManyToOne
    private Category category;

    private String name;

    private String photoURL;

    @ManyToMany
    @JoinTable(name = "pet_tag",
            joinColumns = { @JoinColumn(name = "pet_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id")})
    private List<Tag> tags;

    private String status;
}
