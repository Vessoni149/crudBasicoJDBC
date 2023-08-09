package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
        try{
            //Paso1, crear conexion:
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjpa","root", "");
            //Paso 2 crear objeto statement usando el metodo createStatement sobre el objeto de tipo Conection creado anteriormente:
            Statement miStatement = miConexion.createStatement();
            //Paso 3: ejecutar instruccion sql:
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM alumnos");
            //El resultset es una tabla virtual q se almacena en memoria donde se almacenan los resultados que queremos ver.
            //resulset genera una tabla virtual, el metodo first() permite señalar el primer registro y next() movernos a los siguientes y devuelve T o F segun haya o no siguientes registros
            //Paso 4, recorrer o leer el resultset:
            while (miResultSet.next()){     //Mientras haya un siguiente registro:
                System.out.println(miResultSet.getString("id"));    //getString devuelve el valor de la columna designada en la actual fila como un String.
                System.out.println(miResultSet.getString("nombre"));
                //Ademas de getString tenemos metodos para los distintos tipos de datos, getShort, getDouble, getDate.
            }
        }catch (Exception e){
            System.out.println("No conecta!");
            e.printStackTrace();
        }
    }

}