//package com.wormwood.config;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by Donnie on 2017/4/28.
// */
////@Configuration
////@AutoConfigureAfter(MybatisConfig.class)
//public class MyBatisMapperScannerConfig {
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("com.wormwood.mappers");
//        mapperScannerConfigurer.setAnnotationClass(Mapper.class);
//        return mapperScannerConfigurer;
//    }
//}
