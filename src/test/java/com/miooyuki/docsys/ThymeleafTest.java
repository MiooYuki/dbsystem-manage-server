package com.miooyuki.docsys;

import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.UUID;

public class ThymeleafTest {

    @Test
    public void test() {
        String str = "58ae4090e45574b8e43e94616d4a23cd";
        System.out.println(UUID.randomUUID());
    }

    @Test
    public void useStringTemplate() {

        // 创建模板引擎
        TemplateEngine engine = new TemplateEngine();
        // 创建模板
        String template = "<input type='text' th:value='${name}'>";
        // 创建上下文对象
        Context context = new Context();
        // 设置值
        context.setVariable("name", "阿松大");
        // 处理模板
        System.out.println(engine.process(template, context));

    }

    @Test
    public void useTemplateFile() {

        TemplateEngine engine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        Context context = new Context();
        context.setVariable("name", "案说法");
        engine.setTemplateResolver(resolver);
        System.out.println(engine.process("index", context));

    }

}
