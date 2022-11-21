package com.holyong.elemodel.config;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName MybatisPlusGenerator
 * @Description TODO
 * @Author wangpeng
 * @Date 2022/3/29 17:25
 */
public class MybatisPlusGenerator {
    static  String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        FastAutoGenerator.create(
                new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/element_modeling","root","Root@root123"))
                // 全局配置
                .globalConfig((builder) -> builder
                        // 交互式作用名称
//                         .author(scanner.apply("请输入作者名称？"))
                         .author("holyong")
                        .fileOverride()
                        // 开启swagger模式
                        .enableSwagger()
                        // 输出位置
                        .outputDir("D:\\IdeaProjects\\elemodel\\src\\main\\java")
//                        .outputDir(projectPath + "/src/main/java")
                )
                // 包配置
                //scanner.apply("请输入包名？")
                .packageConfig((builder) -> builder.parent("com.holyong.elemodel")
                        .service("service")
                        .serviceImpl("service.Impl")
                        .mapper("mapper")
                        .xml("mapper.xml")
                        .entity("entity")
                )

                // 策略配置
                //getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all"))
                .strategyConfig((builder) -> builder.addInclude()
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()
                        .entityBuilder().enableLombok()
                        // 下划线转驼峰命名
                        .columnNaming(NamingStrategy.underline_to_camel)
                        .addTableFills(
                                new Column("update_time",FieldFill.INSERT_UPDATE))
                        .addTableFills(
                                new Column("create_time", FieldFill.INSERT)
                        ).build())

                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
//                .templateEngine(new BeetlTemplateEngine())
                .templateConfig((builder) -> getTemplateConfig())
                .execute();
    }



    public static TemplateConfig getTemplateConfig () {
        TemplateConfig templateConfig = new TemplateConfig.Builder()
//                .disable(TemplateType.ENTITY)
                .entity("/templates/entity.java.vm")
                .service("/templates/service.java.vm")
                .serviceImpl("/templates/serviceImpl.java.vm")
                .mapper("/templates/mapper.java.vm")
                .xml("/templates/mapper.xml.vm")
                .controller("/templates/controller.java.vm")
                .build();
        return templateConfig;
    }


    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
