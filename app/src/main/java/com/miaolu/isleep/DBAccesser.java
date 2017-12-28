package com.miaolu.isleep;

import android.content.Context;


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Yuka on 2017/12/27 0027.
 */

public class DBAccesser {

    private Context context=null;

    private String db_add=null;
    private String db_port=null;
    private String db_user_id=null;
    private String db_psw=null;
    private String db_name=null;

    private Connection connection=null;

    public DBAccesser(Context con){
        context=con;
        db_add=con.getString(R.string.db_add);
        db_port=con.getString(R.string.db_port);
        db_user_id=con.getString(R.string.db_user_id);
        db_psw=con.getString(R.string.db_psw);
        db_name=con.getString(R.string.db_name);

    }

    public boolean connect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String connect_url="jdbc:mysql://"+db_add+":"+db_port+"/"+db_name+"?useUnicode=true&characterEncoding=utf8";
        connection = (Connection) DriverManager.getConnection(connect_url,db_user_id,db_psw);
        return checkConnection();
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean checkConnection() throws SQLException {return !(connection.isClosed());}

    public boolean insert(String table_name, String value_list) throws SQLException {
        if(!checkConnection())return false;
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO "+table_name+ " values ("+value_list+");";
        statement.execute(sql);
        return true;
    }

    public ResultSet select(String table_name,String column_name_list,String where) throws SQLException {
        if(!checkConnection())return null;
        Statement statement = connection.createStatement();
        String sql = "SELECT "+column_name_list+" FROM "+table_name+" WHERE "+where+";";
        return statement.executeQuery(sql);
    }

    public ResultSet select(String table_name,String column_name_list) throws SQLException {
        if(!checkConnection())return null;
        Statement statement = connection.createStatement();
        String sql = "SELECT "+column_name_list+" FROM "+table_name+";";
        return statement.executeQuery(sql);
    }

    public boolean update(String table_name,String value_change_list,String where) throws SQLException {
        if(!checkConnection())return false;
        Statement statement = connection.createStatement();
        String sql = "UPDATE "+table_name+ " SET " + value_change_list +" WHERE " + where +";";
        statement.execute(sql);
        return true;
    }

    public boolean update(String table_name,String value_change_list) throws SQLException {
        if(!checkConnection())return false;
        Statement statement = connection.createStatement();
        String sql = "UPDATE "+table_name+ " SET " + value_change_list+";";
        statement.execute(sql);
        return true;
    }

    public boolean delete(String table_name, String where) throws SQLException {
        if(!checkConnection())return false;
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM "+table_name+ " WHERE " + where +" ;";
        statement.execute(sql);
        return true;
    }

    public boolean clear(String table_name) throws SQLException {
        if(!checkConnection())return false;
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM "+table_name+ ";";
        statement.execute(sql);
        return true;
    }

}
