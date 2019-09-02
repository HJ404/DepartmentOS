package cn.hj.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/departmentOS";
    private String name = "root";
    private String password = "123456";
    private Connection conn = null;

    public DatabaseConnect() throws Exception{
        Class.forName(driver);                                  //加载驱动
        conn = DriverManager.getConnection(url,name,password);  //连接数据库
    }

    public Connection getConnection(Connection conn){
        return this.conn;                                       //取得数据库连接
    }

    public void getClose() {
        if(conn!=null){
            try {
                this.conn.close();                              //数据库关闭
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
