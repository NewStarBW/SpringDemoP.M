import com.demo.test.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // id="student"的bean对象是多态的作用域，因此每次从IOC容器取bean对象，都会创建新的bean实例
        Student stu1 = (Student) app.getBean("student");
        Student stu2 = (Student) app.getBean("student");
        // 因此判断两个学生实例返回的是false
        System.out.println("是否单例模式:" + stu1.equals(stu2));

        // id="student2"的bean对象是默认的作用域(单例模式)，因此每次从IOC容器中获取bean对象，都是返回的同一个bean实例
        Student stu3 = (Student) app.getBean("student2");
        Student stu4 = (Student) app.getBean("student2");
        // 因此这里判断两个学生实例返回的是true
        System.out.println("是否单例模式:" + stu3.equals(stu4));
    }
}
