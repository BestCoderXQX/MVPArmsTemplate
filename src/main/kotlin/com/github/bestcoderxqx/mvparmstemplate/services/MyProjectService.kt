package com.github.bestcoderxqx.mvparmstemplate.services

import com.intellij.openapi.project.Project
import com.github.bestcoderxqx.mvparmstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
