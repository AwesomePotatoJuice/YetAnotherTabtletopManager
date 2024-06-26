package ru.surin.yatm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "player")

public class Player extends BasicEntity{
    @Column(name = "player_name", nullable = false)
    private String playerName;

    @OneToMany (mappedBy = "player")
    private List<Character> characterList;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "player_campaign",joinColumns = @JoinColumn(name = "player_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "campaign_id", referencedColumnName = "id"))
    private List <Campaign> campaignList;

    public Player() {
        super();
    }

    public Player(String playerName, List<Character> characterList, List<Campaign> campaign) {
        super();
        this.playerName = playerName;
        this.characterList = characterList;
        this.campaignList = campaignList;
    }
}
