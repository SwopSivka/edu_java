package hm7;

import java.io.FileNotFoundException;

public class UserSaveFile implements AutoCloseable {
    private final String path;

    public UserSaveFile(String path) {
        this.path = path;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Заглушка: освободили ресурсы экземпляра класса UserSaveFile");
    }

    public void WriteFile(Integer value) throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
