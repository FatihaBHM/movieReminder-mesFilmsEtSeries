package org.lafabrique_epita.domain.valueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EvaluationDetailsVO {
    @Column(name="rating")
    protected int rating;

    @Column(name="comment",length = 500, columnDefinition = "TEXT")
    protected String comment;
    @Column(name="activated")
    protected boolean activated;
    @Column(name="reported")
    protected boolean reported;
}
