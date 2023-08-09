package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudJPA","root", "");
            Statement myStatement = myConnection.createStatement();
            String SqlInstruction = "update Alumnos set nombre = 'Gonzalo', apellido = 'Gonzalez' where id = 1;";
            myStatement.executeUpdate(SqlInstruction);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
