package org.lafabrique_epita.domain.valueObjects;

import jakarta.persistence.*;
import org.lafabrique_epita.domain.entities.Country;

import java.time.LocalDate;

@Embeddable
public class IdentityVO {
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "description",length = 500, columnDefinition = "TEXT")
    private String description;

    @Column(name="phone_number")
    protected String phoneNumber;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns(@JoinColumn(name="country_id",referencedColumnName="id"))
    protected Country country;

}

