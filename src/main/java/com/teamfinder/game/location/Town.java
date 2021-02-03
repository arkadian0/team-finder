package com.teamfinder.game.location;

import javax.persistence.*;

@Entity
@Table(name = "TOWN")
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "COORDINATE_X", nullable = false)
    private double coordinateX;

    @Column(name = "COORDINATE_Y", nullable = false)
    private double coordinateY;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COUNTRY_ID",nullable = false)
    private Country country;
}
