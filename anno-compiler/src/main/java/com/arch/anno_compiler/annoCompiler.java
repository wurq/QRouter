package com.arch.anno_compiler;

import com.arch.node.RouterNode;
import com.arch.util.Logger;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

public class annoCompiler extends AbstractProcessor {

    private Logger logger;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);

        logger = new Logger(processingEnv.getMessager());
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (annotations.isEmpty() == false) {
            Set<? extends Element> routeNodes = roundEnv.getElementsAnnotatedWith(RouterNode.class);
            try {
                logger.info(">>> Found routes, start... <<<");
//                parseRouteNodes(routeNodes);
            } catch (Exception e) {
                logger.error(e);
            }
//            generateRouterImpl();
//            generateRouterTable();
            return true;
        }
        return false;
    }
}
