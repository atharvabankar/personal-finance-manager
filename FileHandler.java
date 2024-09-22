import java.io.*;
import java.util.HashMap;

public class FileHandler {

    public static void saveData(User user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(user.getUsername() + ".dat"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User loadData(String username) {
        User user = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(username + ".dat"))) {
            user = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
