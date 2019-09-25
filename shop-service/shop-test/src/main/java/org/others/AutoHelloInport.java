package org.others;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AutoHelloInport implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("执行了！！！");
        return new String[]{"org.others.AutoHello"};
    }
}
