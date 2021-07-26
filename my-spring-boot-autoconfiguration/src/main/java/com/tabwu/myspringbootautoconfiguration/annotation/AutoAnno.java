package com.tabwu.myspringbootautoconfiguration.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AutoAnno implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.tabwu.myspringbootautoconfiguration.configuration.AutoConfiguration"};
    }
}
