package org.sha2001.common.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="userinfo", schema = "common")
@Getter
@Setter
public class User extends IdentifiedObject implements Serializable {

    String username;
    String password;
    Boolean active;
    Date lastLogin;
    Date activeFrom;
    Date activeTo;

}
