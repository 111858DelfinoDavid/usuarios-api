package ar.edu.utn.frc.tup.lc.iii.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Usuario {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
