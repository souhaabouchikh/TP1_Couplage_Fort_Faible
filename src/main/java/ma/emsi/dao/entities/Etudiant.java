package ma.emsi.dao.entities;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Etudiant {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;


}
