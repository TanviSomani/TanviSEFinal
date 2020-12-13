package MVC_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService implements StudentInterface{

    public Connection con3;

    public Connection getCon3() {

        return con3;
    }

    public void setCon3(Connection con3) {

        this.con3 = con3;
    }

    public StudentService(Connection con3) {
        this.con3 = con3;
    }

    @Override
    public ArrayList<StudentData> showData() throws SQLException {

        String query = "SELECT * FROM studentrecord";

        PreparedStatement preparedStatement = con3.prepareStatement(query);

        StudentData stdData;

        ResultSet rs = preparedStatement.executeQuery();

        ArrayList<StudentData> studentList = new ArrayList<>();

        while(rs.next()) {
            stdData = new StudentData(rs.getString("snumber"), rs.getString("sname"), (int) rs.getDouble("gpa"));
            studentList.add(stdData);
        }

        return studentList;
    }

    @Override
    public void add(StudentData studentData) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO studentrecord VALUES ( ?, ?, ? )";

        PreparedStatement preparedStatement = con3.prepareStatement(query);

        preparedStatement.setString(1, studentData.getSnumber());
        preparedStatement.setString(2, studentData.getSname());
        preparedStatement.setString(3, String.valueOf(studentData.getGpa()));

        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(String sno) throws SQLException {
        String query = "DELETE FROM studentrecord WHERE snumber=?";

        PreparedStatement preparedStatement = con3.prepareStatement(query);

        preparedStatement.setString(1, sno);
        preparedStatement.executeUpdate();
    }

    @Override
    public StudentData edit(StudentData studentData, String sno) throws SQLException, ClassNotFoundException {
        return null;
    }
}
