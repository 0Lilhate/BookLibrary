package projectJDBC;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import projectJDBC.domain.Book;
import projectJDBC.service.GetDateService;

import java.sql.SQLException;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(Main.class);
        GetDateService getDateService = context.getBean(GetDateService.class);




        //Console.main(args);
    }


}
