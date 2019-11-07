package wangjie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author wangjie
 * @date 2019-11-07 20:23
 * @since 1.0.0
 *
 * description:程序入口
 */
@SpringBootApplication
@MapperScan("wangjie.dao")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
