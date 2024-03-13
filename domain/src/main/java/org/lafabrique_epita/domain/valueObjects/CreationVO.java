package org.lafabrique_epita.domain.valueObjects;

import jakarta.persistence.*;
import org.lafabrique_epita.domain.entities.User;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Embeddable
public class CreationVO {

    @Column(name="creation_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private LocalDateTime creationDate;

    /**
     * La date de modification de tout objet en base de données
     */
    @Column(name="modification_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private LocalDateTime modificationDate;


    /**
     * le user qui est était connecté lors de la création de tout objet
     */
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns(@JoinColumn(name="user_creator",referencedColumnName="ID",nullable = true))
    private User userCreator;

    /**
     * le user qui est était connecté lors de la modification de tout objet
     */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns(@JoinColumn(name="user_modifier",referencedColumnName="ID",nullable = true))
    private User userModifier;
}
