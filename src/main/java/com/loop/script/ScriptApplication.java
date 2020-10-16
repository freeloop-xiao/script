package com.loop.script;

import com.loop.script.common.execute.IExecute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author free loop
 * @version 1.0
 * @since 2019-06-27 11:42
 */
@SpringBootApplication
public class ScriptApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ScriptApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
        IExecute execute = applicationContext.getBean(IExecute.class);
        execute.execute();
    }

}
