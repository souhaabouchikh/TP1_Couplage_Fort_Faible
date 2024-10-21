package ma.emsi.presentation;


import ma.emsi.dao.entities.Etudiant;
import ma.emsi.dao.entities.EtudiantDAO;
import ma.emsi.dao.entities.EtudiantDAODictionary;
import ma.emsi.dao.entities.IEtudiantDAO;
import ma.emsi.metier.EtudiantManager;

public class Main {
    public static void main(String[] args) {
        IEtudiantDAO etudiantDAODictionary = new EtudiantDAODictionary();
        Etudiant e1 = new Etudiant(1, "abouchikh", "souha", "souhaab@example.com");
        Etudiant e2 = new Etudiant(2, "mhamdi", "assia", "massia@example.com");
        Etudiant e3 = new Etudiant(3, "omari", "Youssef", "omariyoussef@example.com");
        Etudiant e4 = new Etudiant(4, "hamdi", "nadine", "nadinehamdi@example.com");
        Etudiant e5 = new Etudiant(5, "mouhadi", "assia", "mouhadiassia@example.com");
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAODictionary);
        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);
        etudiantManager.addEtudiant(e5);
        e5.setPrenom("alaoui");
        e5.setNom("mohammed");
        e5.setEmail("Amed@example.com");
        etudiantManager.updateEtudiant(e5);
        System.out.println(etudiantManager.getAllEtudiants());

    }
}