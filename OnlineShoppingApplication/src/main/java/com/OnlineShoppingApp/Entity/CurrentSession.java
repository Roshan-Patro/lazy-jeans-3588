package com.OnlineShoppingApp.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class CurrentSession {

    @Id
    private Integer Id;
    private String type;
    private String uuid;
    private LocalDateTime localDateTime;

}
