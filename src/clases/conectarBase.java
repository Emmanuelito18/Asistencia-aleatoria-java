/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuelito18
 */
public class conectarBase {
    String driver="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/asistencia?serverTimezone=UTC&autoReconnect=true&use SSL=false";//?serverTimezone=UTC es solo para MySQL 8.0.22
    String user="root";
    String password="";
    public Connection conectar=null;
    public Statement st=null;
    public ResultSet rs=null;
    public PreparedStatement ps=null;
    //variables para mostrar notificacion de fallo
    public boolean falloConexion=false;
    public String errorConexion=null;
    public int codigoError=0;
    public String estadoSQL=null;
    
    public conectarBase(){//constructor
        try{
            Class.forName(driver);
            conectar=DriverManager.getConnection(url,user,password);
        }
        catch(SQLException e){
            falloConexion=true;
            errorConexion=e.getMessage();
            codigoError=e.getErrorCode();
            estadoSQL=e.getSQLState();
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error: "+errorConexion+"\nEstado SQL: "+estadoSQL+"\nCódigo de error: "+codigoError);
            e.printStackTrace();
            System.exit(1);
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Falta la libreria de MySQL");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public static void main(String[] args){
        conectarBase c=new conectarBase();
    }
}