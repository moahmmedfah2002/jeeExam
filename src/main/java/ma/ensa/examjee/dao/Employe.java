package ma.ensa.examjee.dao;

public interface Employe {
     void addEmploye(Employe employe) throws Exception;
     void deleteEmploye(int id) throws Exception;
     void updateEmploye(Employe employe) throws Exception;
     Employe getEmploye(int id) throws Exception;
}
