import com.mapper.EmpMapper;
import com.pojo.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-21 15:28:28
 */
public class DaoTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        EmpMapper empMapper = context.getBean("empMapper", EmpMapper.class);
        Emp emp = empMapper.selectByPrimaryKey(1);
        System.out.println(emp);
    }

}
















