package mainpackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**  SpringBootApplication. */
@SpringBootApplication
@ComponentScan(basePackages = "controllerpackage")
public class ApplicationMain {
/**  @param args */
public static void main(final String[] args) {
SpringApplication.run(ApplicationMain.class, args);
}
}
