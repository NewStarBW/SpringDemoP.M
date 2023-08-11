import com.demo.test.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        Student stu = new Student(1L, "张三", 18, "男");
        System.out.println("学生个人信息:" + stu);

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过IOC容器的id(名称)来获取bean实例
        Student stu2 = (Student) app.getBean("student");
        System.out.println("第二个学生的个人信息:" + stu2);

        Student stu3 = (Student) app.getBean("student2");
        System.out.println("第三个学生的个人信息:" + stu3);

        // 通过IOC容器的type + id(名称) 来获取bean实例
        Student stu4 = app.getBean("student", Student.class);
        System.out.println("第四个学生的个人信息:" + stu4);

        Student stu5 = (Student) app.getBean("stu");
        System.out.println("第五个学生的个人信息:" + stu5);

    }
}
