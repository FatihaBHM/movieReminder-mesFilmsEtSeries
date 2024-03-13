package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.enums.RoleEnum;
import org.lafabrique_epita.domain.valueObjects.CreationVO;
import org.lafabrique_epita.domain.valueObjects.IdentityVO;

import java.util.List;
/**
 * C'est la classe mère de tous les utilisateurs y compris Admin
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)   :
 * ça veut dire que la classe User et toutes ses filles seront enregistrées dans la même table
 * @DiscriminatorColumn(name = "type_user", discriminatorType = DiscriminatorType.STRING) :
 * type_user serait le nom de la colonne qui serait créée dans la tables users et 'est la colonne qui va faire distinguer
 * entre les différents objets
 * @DiscriminatorValue("user") :
 * user serait la valeur da la colonne type_user en cas de persistance d'un objet de provenance de la classe User
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_user", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Email de l'utilisateur
     */
    @NotEmpty
    @Column(name="email")
    @Email
    protected String email;

    @NotEmpty
    @Column(name="password")
    private String password;

    @Embedded
    private IdentityVO identity;

    /**
     * Pour activer ou désactiver un compte
     */
    @NotEmpty
    @Column(name="activated")
    private boolean activated;

    @Transient
    private String confirmPassword;

    @Transient
    private String oldPassword;

    @Column(name = "roleEnum", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private RoleEnum role;


    @OneToMany(mappedBy = "user" )
    private List<SerieEvaluation> seriesEvaluations;

    @OneToMany(mappedBy = "user" )
    private List<SeasonEvaluation> seasonEvaluations;

    @OneToMany(mappedBy = "user" )
    private List<EpisodeEvaluation> episodeEvaluations;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "media_favorites",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "media_id"))
    private List<Media> mediaFavorites ;

    @Embedded
    private CreationVO CreationDetails;

}
