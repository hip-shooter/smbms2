import com.github.mybatis.dao.BillMapper;
import com.github.mybatis.dao.UserMapper;
import com.github.mybatis.pojo.Bill;
import com.github.mybatis.pojo.User;
import com.github.mybatis.util.PageBean;
import com.github.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args){

        try {

            SqlSession sqlSession= SqlSessionUtil.getSqlSession();
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
            //根据用户名 角色名 查询用户列表
           /* List<User> userList=userMapper.queryUserByUserNameAndUserRole("赵",2);
            for (User user:userList){
                System.out.println(user);
            }
            */
            /*
            User user =new User();
            user.setUserName("赵子龙");
            user.setId(14);
            int row =userMapper.updateUserByUserId(user);
            if(row>0){
                System.out.println("更新成功");
            }
            Integer[] arr ={1,2,5,6};
            List<User>userList=UserMapper.queryUserByArr();
            for(User user :userList){
                System.out.println(user);
            }
            sqlSession.commit();
*/


            List<Integer> list =new ArrayList<>();
            list.add(1);list.add(2);list.add(5);list.add(6);
            List<User> userList=userMapper.queryUserByArr(list);
            for (User user:userList){
                System.out.println(user);
            }
            //获取billMapper的对象
          /*  BillMapper billMapper=sqlSession.getMapper(BillMapper.class);
            //分页查询 查询所有商品账单 一页显示5条
            PageBean<Bill> pageBean=new PageBean<>();
            pageBean.setCurrentPage(1);
            pageBean.setPageSize(5);
            //先写一个查询总记录数
            int count = billMapper.findBillCount();
            pageBean.setTotalCount(count);
            List<Bill> billList =billMapper.queryPageBean(pageBean);*/


        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
