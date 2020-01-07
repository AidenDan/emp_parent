import com.pojo.Emp;
import com.service.ServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2020-1-7 14:17:38
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(value = "classpath*:applicationContext-*.xml") //对象交给spring管理后，测试类中必须从spring中拿对象
public class TestClass {

    @Autowired
    ServiceInterface serviceInterface;

    @Test
    public void test01(){
        Emp emp = serviceInterface.findEmpByEid(1);
        System.out.println(emp);
    }

}
