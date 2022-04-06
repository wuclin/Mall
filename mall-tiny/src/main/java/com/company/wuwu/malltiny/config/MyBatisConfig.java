package com.company.wuwu.malltiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.company.wuwu.malltiny.mbg.mapper")
public class MyBatisConfig {
}
