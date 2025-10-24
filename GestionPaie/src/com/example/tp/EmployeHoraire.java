package com.example.tp;

public class EmployeHoraire extends Employe {
    private double tauxHoraire, heuresTravaillees;
    public EmployeHoraire(String nom, String prenom, double taux, double heures) {
        super(nom, prenom);
        this.tauxHoraire = taux;
        this.heuresTravaillees = heures;
    }
    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
