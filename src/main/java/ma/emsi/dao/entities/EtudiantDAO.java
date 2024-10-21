package ma.emsi.dao.entities;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiantDAO {
    static List<Etudiant> etudiants = new ArrayList();
    @Override
    public Etudiant addEtudiant(Etudiant etud){
        etudiants.add(etud);
        return etud;
    }
    @Override
    public Etudiant updateEtudiant(Etudiant etud) {
        for(Etudiant e : etudiants){
            if(e.getId() == etud.getId()){
                e.setEmail(etud.getEmail());
                e.setNom(etud.getNom());
                e.setPrenom(etud.getPrenom());
            }
        }
        return etud;
    }
    @Override
    public List<Etudiant> getAllEtudiant(){
         return etudiants;
    }
}
