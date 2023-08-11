import com.demo.test.ZhuJieStudent;
import com.demo.test.ZhuJieTeacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("zhuJieCfg.xml");
        // 从IOC容器中获取通过注解自动装配的teacher对象
        ZhuJieTeacher teacher = (ZhuJieTeacher) app.getBean("zhuJieTeacher");
        teacher.setId(1);
        teacher.setName("注解自动装配的老师");
        ZhuJieStudent student = teacher.getStudent();
        student.setId(7l);
        student.setUserName("赵六");
        student.setAge(38);
        student.setGender("男");
        teacher.saiHi();
        teacher.getStudent().saiHi();
    }
}
