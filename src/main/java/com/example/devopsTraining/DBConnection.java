package com.example.devopsTraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DBConnection {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource(
                "jdbc:postgresql://localhost:5432/devops_training_db",
                "postgres",
                "password"
        );

        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");

        return driverManagerDataSource;
    }
}
