package ar.edu.utn.frc.tup.lc.iii.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUsuarioDto {
    private String name;
    private String lastName;
    private String email;
    private String password;
}
