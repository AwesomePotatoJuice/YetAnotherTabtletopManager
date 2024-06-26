package ru.surin.yatm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "deity")
public class Deity extends BasicEntity{
    @Column(name="deity_name", nullable = false)
    private String deityName;

    @OneToMany(mappedBy = "deity", fetch = FetchType.LAZY)
    private List<Character> characterList;

    public Deity() {
        super();
    }

    public Deity(String deityName, List<Character>characterList) {
        super();
        this.deityName = deityName;
        this.characterList = characterList;
    }
}
