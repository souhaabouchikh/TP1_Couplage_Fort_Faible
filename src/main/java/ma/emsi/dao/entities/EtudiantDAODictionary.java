package ma.emsi.dao.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EtudiantDAODictionary implements IEtudiantDAO {
    static  HashMap<Integer, Etudiant> stringEtudiantHashMap = new HashMap<Integer, Etudiant>();


    @Override
    public Etudiant addEtudiant(Etudiant etud) {
        return stringEtudiantHashMap.put(etud.getId(), etud);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etud) {
        for(Etudiant e : getAllEtudiant()){
            if(e.getId() == etud.getId()){
                e.setEmail(etud.getEmail());
                e.setNom(etud.getNom());
                e.setPrenom(etud.getPrenom());
            }
        }
        return etud;
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return new ArrayList<>(stringEtudiantHashMap.values());
    }
}
