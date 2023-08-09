package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {


        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudJPA","root", "");
            Statement myStatement = myConnection.createStatement();
            String SqlInstruction = "INSERT INTO alumnos (nombre, apellido) VALUES ('Ramiro','Ramirez') ";
            myStatement.executeUpdate(SqlInstruction);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}