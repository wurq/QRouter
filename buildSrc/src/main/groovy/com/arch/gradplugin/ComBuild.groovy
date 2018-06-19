package com.arch.gradplugin;


import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by wurongqiu on 2018/6/12.
 */

public class ComBuild implements Plugin<Project> {
    void apply(Project project) {
        project.task('testTask') << {
            println "Hello gradle plugin"
        }
    }
}
