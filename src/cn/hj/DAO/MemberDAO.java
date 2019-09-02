package cn.hj.DAO;

import cn.hj.VO.Member;

public interface MemberDAO {
    /**
     * member的查询操作
     * @param member
     */
    public void findMember(Member member ) throws Exception;

    /**
     * member的注册操作
     * @param member
     */
    public void doCreate(Member member) throws Exception;
    /**
     * member的删除操作
     * @param member
     */
    public void doDelete(Member member) throws Exception;
    /**
     * member的更新操作
     * @param member
     */
    public void doUpdate(Member member) throws Exception;
}
