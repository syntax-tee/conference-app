package com.taiye.conferenceapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class PersistenceConfiguration {
////
////	@Bean
////	public DataSource dataSource(){
////		DataSourceBuilder builder = DataSourceBuilder.create();
////		builder.url("jdbc:postgresql://localhost:5432/confrence_app");
////		System.out.println("My custom datasource bean");
////		return builder.build();
////	}
}
