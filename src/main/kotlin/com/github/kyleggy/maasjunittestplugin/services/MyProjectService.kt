package com.github.kyleggy.maasjunittestplugin.services

import com.github.kyleggy.maasjunittestplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
