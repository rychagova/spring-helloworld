import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean0 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean0.getMessage());

        Cat bean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean1.getName());
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getName());

        System.out.println(bean == bean0);
        System.out.println(bean1 ==bean2);
    }
}