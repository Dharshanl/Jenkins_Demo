package com.restassured;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.Files;
import java.util.List;

import org.apache.log4j.Logger;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class);
    
    public static void main(String[] args) {
       logger.info("Test log message");

       Path path = Paths.get("C:/Users/dhars/Downloads/Gags/test.txt");

       List<String> line =  Arrays.asList("hellow", "this is a test", "line writting");

       try{
        Files.write(path, line);
        logger.info("The line got written successfully");
       }
       catch(IOException e){
        logger.error(e);
       }
    }
}