package cn.hj.implDAO;

import cn.hj.DAO.MemberDAO;
import cn.hj.VO.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class implMemberDAO implements MemberDAO {
    private Connection conn = null;
    private PreparedStatement pst = null;
    @Override
    public void findMember(Member member)  throws Exception{
        String sql = "select * from where mid = ? and password = ?";
        this.pst = this.conn.prepareStatement(sql);
        this.pst.setString(1,member.getMid());
        this.pst.setString(2,member.getPassword());
        ResultSet rs = this.pst.executeQuery();
        while (rs.next()){
                member.setMid(member.getMid());
                member.setPassword(member.getPassword());
        }
    }

    @Override
    public void doCreate(Member member)  throws Exception{

    }

    @Override
    public void doDelete(Member member)  throws Exception{

    }

    @Override
    public void doUpdate(Member member)  throws Exception{

    }
}
