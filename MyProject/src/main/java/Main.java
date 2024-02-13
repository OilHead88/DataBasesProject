
import controllers.MainController;
import models.Contact;
import models.User;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        var controller = new MainController();

        User user1 = new User();
        user1.setId(1);
        user1.setName("Petya");

        Contact cont = new Contact();
        cont.setPhone("+79991112253");
        cont.setContactName("Eric cont name");
        cont.setEmail("7991122233@ya.ru");

        var meta = new HashMap<String, Object>();
        meta.put("traceId", "89t9rr89g8ffg");
        meta.put("userId", 1);
        meta.put("time", new Date().getTime());


        controller.addContact(user1, cont, meta);
       controller.close();


    }
}