package com.freyre.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="persona")
@NoArgsConstructor //Lombok
@Getter
@Setter
@Audited
public class Persona extends Base {

        @Column(name="nombre")
        private String nombre;
        @Column(name="apellido")
        private String apellido;
        @Column(name="dni")
        private int dni;

}
