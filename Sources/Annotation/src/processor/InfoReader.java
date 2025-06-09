package processor;

import annotations.Info;
import examples.InfoClass;

public class InfoReader {
    public static void read() {
        Info info = InfoClass.class.getAnnotation(Info.class);
        System.out.println("Author: " + info.author());
        System.out.println("Date: " + info.date());
    }
}
