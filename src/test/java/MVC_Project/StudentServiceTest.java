package MVC_Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class StudentServiceTest {
    @InjectMocks
    private StudentService ss;

    @Mock
    private Connection connection;

    @Mock
    private ResultSet resultSet;

    @Mock
    private PreparedStatement preparedStatement;

    @Mock
    private ConnectionClass con;

    StudentData sd = new StudentData("1", "Tanvi", (int) 3.0);

    @BeforeEach
    public void Setup() throws SQLException, ClassNotFoundException {
        MockitoAnnotations.openMocks(this);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(con.connect()).thenReturn(connection);
        sd = new StudentData("1","Tanvi", (int) 3.0);
    }

    @Test
    void add() throws SQLException, ClassNotFoundException {
        when(connection.prepareStatement("INSERT INTO studentrecord VALUES ( ?, ?, ? )")).thenReturn(preparedStatement);
        ss.add(sd);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    void delete() throws SQLException {
        when(connection.prepareStatement("Delete from studentrecord where snumber = ?")).thenReturn(preparedStatement);
        ss.delete("1");
        verify(preparedStatement).executeUpdate();
    }

    @Test
    void edit() throws SQLException, ClassNotFoundException {
        sd=new StudentData("1","Tanvi", (int) 3.0);
        assertEquals("Tanvi", sd.getSname());
    }
}