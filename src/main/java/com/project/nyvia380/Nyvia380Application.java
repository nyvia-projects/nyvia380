package com.project.nyvia380;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.event.EventListener;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class Nyvia380Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Nyvia380Application.class);
    }

    @Override
    public void onStartup(ServletContext container){
        ServletRegistration.Dynamic registration = container.addServlet("example", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/example");
    }

    public static void main(String[] args) {
        SpringApplication.run(Nyvia380Application.class, args);
        /*
        System.setProperty("webdriver.chrome.driver", "src/main/resources/static/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");*/

//        LaunchBrowserTo("http://localhost:8080/");

    }




    @EventListener({ApplicationReadyEvent.class})
    public void applicationReadyEvent() {
        System.out.println("Server running... launching browser...");
        LaunchBrowserTo("http://localhost:8080/");
    }

    public static void LaunchBrowserTo(String url) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
