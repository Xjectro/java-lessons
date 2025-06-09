package processor;

import annotations.LogExecutionTime;

import java.lang.reflect.Method;

public class ExecutionLogger {
    public static void process(Object obj) throws Exception {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println(method.getName());
                method.invoke(obj);
                System.out.println(method.getName());
            }
        }
    }
}
