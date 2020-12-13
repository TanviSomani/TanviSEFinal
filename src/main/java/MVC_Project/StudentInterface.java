package MVC_Project;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentInterface {

    ArrayList<StudentData> showData() throws SQLException;
    void add(StudentData studentData) throws SQLException, ClassNotFoundException;
    void delete(String sno) throws SQLException, ClassNotFoundException;
    StudentData edit(StudentData studentData, String sno) throws SQLException, ClassNotFoundException;
}
