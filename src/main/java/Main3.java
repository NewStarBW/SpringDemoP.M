import com.demo.test.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("cfg.xml");
        // 从IOC容器中取手动装配的teacher对象
        Teacher teacher = (Teacher) app.getBean("teacher");
        teacher.saiHi();
        teacher.getStudent().saiHi();

        // 从IOC容器中取通过autowire='byType'自动装配的teacher对象
        Teacher teacher2 = (Teacher) app.getBean("teacher2");
        teacher2.saiHi();
        teacher2.getStudent().saiHi();

        // 从IOC容器中通过autowire='byName'自动装配的teacher对象
        Teacher teacher3 = (Teacher) app.getBean("teacher3");
        teacher3.saiHi();
        teacher3.getStudent().saiHi();
    }
}
