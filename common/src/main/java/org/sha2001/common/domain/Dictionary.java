package org.sha2001.common.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="dictionary", schema = "common")
@Setter
@Getter
public class Dictionary extends IdentifiedObject implements Serializable {

    @Column(unique = true)
    @NotNull
    String code;
    @NotNull
    String category;
    String value;

}
