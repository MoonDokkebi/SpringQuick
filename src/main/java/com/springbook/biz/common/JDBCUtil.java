package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
    public static Connection getConnection(){
        try {
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void close(PreparedStatement statement, Connection connection){
        if (statement != null){
            try{
                if (! statement.isClosed()) statement.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                statement = null;
            }
        }
        if (connection != null){
            try {
                if (!connection.isClosed()) connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                connection =null;
            }
        }
    }

    public static void close(ResultSet rs, PreparedStatement stmp, Connection conn){
        if(rs != null){
            try {
                if(!rs.isClosed()) rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                rs = null;
            }
        }
        if(stmp != null){
            try {
                if(!stmp.isClosed()) stmp.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                stmp = null;
            }
        }
        if(conn != null){
            try {
                if(!conn.isClosed()) conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                conn = null;
            }
        }

    }
}
