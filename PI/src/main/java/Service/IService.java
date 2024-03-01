package Service;

import entities.salle;

import java.util.List;

public interface IService <T>{
    void addPreS(T t);
    void delete(int ids);
    void update(salle sa, int id_Modif);
    List<T> readAll();
    T readByID(int id);
    void recherche(salle sa);


}
