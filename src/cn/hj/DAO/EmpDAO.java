package cn.hj.DAO;

import cn.hj.VO.Emp;

public interface EmpDAO {
    /**
     * emp的查询操作
     * @param emp
     */
    public void findMember(Emp emp) throws Exception;

    /**
     * emp的注册操作
     * @param emp
     */
    public void doCreate(Emp emp) throws Exception;
    /**
     * emp的删除操作
     * @param emp
     */
    public void doDelete(Emp emp)  throws Exception;
    /**
     * emp的更新操作
     * @param emp
     */
    public void doUpdate(Emp emp) throws Exception;
}
