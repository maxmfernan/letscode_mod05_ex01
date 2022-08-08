package br.com.letscode.aula01.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class ClientModel {
    @Id
    @GeneratedValue
    private long id;

    @Version
    private Long version;

    @NotNull
    @Size(
            min = 5,
            max = 100,
            message = "O nome precisa ter entre ${min} e ${max} caracteres"
    )
    private String name;

    @NotNull
    @Min(18)
    private int age;

    @NotNull
    @Pattern(regexp = "^[A-Z]{2}\\d{9}$")
    private String vat;

    @NotNull
    @Email
    private String email;
}
