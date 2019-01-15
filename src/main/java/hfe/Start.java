package hfe;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Start {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HfeConfig.class);
        Start start = (Start) context.getBean("start");
        start.run();
    }

    public void run() {
        System.out.println("run");
    }
}
