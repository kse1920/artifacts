package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'Build1'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, BuildType({
    id("Build1")
    name = "Build (1)"

    vcs {
        root(AbsoluteId("TEstVCS"))
    }

    steps {
        script {
            scriptContent = """echo "hello""""
        }
        script {
            scriptContent = """echo "blbablba""""
        }
        script {
            scriptContent = """echo "bye""""
        }
    }

    triggers {
        vcs {
        }
    }
}))

