package ma.emsi.metier;

import ma.emsi.dao.entities.Etudiant;
import ma.emsi.dao.entities.EtudiantDAO;
import ma.emsi.dao.entities.IEtudiantDAO;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class EtudiantManager {
    public IEtudiantDAO iEtudiantDAO;

    public EtudiantManager(IEtudiantDAO iEtudiantDAO) {
        this.iEtudiantDAO = iEtudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant){
        int count = 0;
        if(!iEtudiantDAO.getAllEtudiant().isEmpty()){
            for (Etudiant etud : iEtudiantDAO.getAllEtudiant()){
                if(etud.getEmail() == etudiant.getEmail()){
                    count++;
                }
            }
            if(count > 0){
                System.out.println("email que vous avez entrer et deja utiliser par un etudiant ");
            }else{
                iEtudiantDAO.addEtudiant(etudiant);
            }
        }else{
            iEtudiantDAO.addEtudiant(etudiant);
        }
        return etudiant;
    }

    public Etudiant updateEtudiant(Etudiant etudiant){
        return iEtudiantDAO.updateEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants(){
        return iEtudiantDAO.getAllEtudiant();
    }
}
