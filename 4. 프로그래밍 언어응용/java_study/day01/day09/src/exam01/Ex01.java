package exam01;

import java.lang.reflect.*;

public class Ex01 {
    public static void main(String[] args) {
        Class cls = Book.class;

        Field[] fields = cls.getFields();
        Constructor[] constructors = cls.getConstructors();
        Method[] methods = cls.getMethods();

        System.out.println("----- Filed ----");
        for(Field filed : fields) {
            System.out.println(filed);
        }

        System.out.println("------ Constructor -------");
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println(" ---- Method ----");
        for(Method method : methods) {
            System.out.println(method);
        }
    }
}
