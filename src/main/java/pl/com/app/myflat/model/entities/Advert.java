package pl.com.app.myflat.model.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString(exclude = "user")
@EqualsAndHashCode
@Table(name = "adverts")
public class Advert extends EntityBase{

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Boolean active;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

}
