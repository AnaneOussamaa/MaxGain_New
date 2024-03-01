package Service;

import entities.salle;
import utilis.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalleService implements IService <salle>{


    private Connection conn;
    //pour lancer une requete
    private Statement ste;
    private PreparedStatement Preste;
    public SalleService() {
        conn= DataSource.getInstance().getCnx();
    }
    @Override
    public void addPreS(salle sa) {
        String redrequete= "insert into salle (nom,adresse,image, description) values (?,?,?,?)";

        try{
            Preste=conn.prepareStatement(redrequete);
            Preste.setString(1,sa.getNom());
            Preste.setString(2, sa.getAdresse());
            Preste.setString(3, sa.getImage());
            Preste.setString(4, sa.getDescription());
            Preste.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void delete(int ids) {
        try {
            String sql = "DELETE FROM salle WHERE id = ?";
            Preste= conn.prepareStatement(sql);
            Preste.setInt(1, ids);
            int rowsDeleted = Preste.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("salle deleted successfully");
            } else {
                System.out.println("Failed to delete salle");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void update(salle sa, int id_Modif){

        String sql = "UPDATE salle SET nom=?, adresse=?, image=?, description=? WHERE id=?";
        try {
            PreparedStatement ste = conn.prepareStatement(sql);
            ste.setString(1, sa.getNom());
            ste.setString(2, sa.getAdresse());
            ste.setString(3, sa.getImage());
            ste.setString(4, sa.getDescription());
            ste.setInt(5, id_Modif); // Set the ID of the product to be modified

            int rowsUpdated = ste.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Produit modifié avec succès");
            } else {
                System.out.println("Aucun produit n'a été modifié");
            }
        } catch (SQLException e) {
            System.err.format("Erreur lors de la modification du produit : %s%n", e.getMessage());
        }

    }

    @Override
    public List<salle> readAll() {

        String requete="select * from salle";
        List<salle>list=new ArrayList<>();
        try {
            ste=conn.createStatement();
            ResultSet rs=ste.executeQuery(requete);
            while(rs.next()){
                list.add(new salle (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public salle readByID(int id) {
        return null;
    }

    @Override
    public void recherche(salle sa){
        String sql = "SELECT * FROM salle WHERE nom = ?";

        try {
            // Préparation de la requête
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, sa.getNom()); // Supposons que vous avez une méthode getNom() dans la classe Salle

            // Exécution de la requête
            ResultSet resultSet = statement.executeQuery();

            // Traitement des résultats
            while (resultSet.next()) {
                // Lecture des données de la salle
                int id = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                // Lire d'autres colonnes si nécessaire

                // Faire quelque chose avec les données récupérées
                System.out.println("ID: " + id + ", Nom: " + nom);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer l'exception selon vos besoins
        }
    }
}






















