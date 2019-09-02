package cn.hj.implDAO;

import cn.hj.DAO.EmpDAO;
import cn.hj.VO.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class implEmpDAO implements EmpDAO {
    private Connection conn = null;         //数据库连接对象
    private PreparedStatement pst = null;   //数据库操作对象
    public implEmpDAO(Connection conn){     //取得数据库对象
        this.conn = conn;
    }
    @Override
    public void findMember(Emp emp) throws Exception {
        String sql = "select * from where mid = ? and password = ?";

    }

    @Override
    public void doCreate(Emp emp) throws Exception {

    }

    @Override
    public void doDelete(Emp emp) throws Exception {

    }

    @Override
    public void doUpdate(Emp emp) throws Exception {

    }
}
