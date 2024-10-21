package ma.emsi.dao.entities;

import javax.xml.transform.Templates;
import java.util.List;

public interface IEtudiantDAO {
    Etudiant addEtudiant(Etudiant etud);
    Etudiant updateEtudiant(Etudiant etud);
    List<Etudiant> getAllEtudiant();
}
