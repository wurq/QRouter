package com.arch.annocompiler;

import com.arch.node.RouterNode;
import com.arch.util.Logger;
import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import static com.arch.util.Constants.ANNOTATION_TYPE_ROUTE_NODE;


@AutoService(Processor.class)
//@SupportedOptions(KEY_HOST_NAME)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes(ANNOTATION_TYPE_ROUTE_NODE)
public class annoCompiler extends AbstractProcessor {

    private Logger logger;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);

        logger = new Logger(processingEnv.getMessager());

        logger.info(">>> init... <<<");
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        logger.info(">>> Found routes, start entering... <<<");

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
