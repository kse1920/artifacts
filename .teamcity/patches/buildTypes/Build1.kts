package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'Build1'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, BuildType({
    templates(AbsoluteId("TestTemplate"))
    id("Build1")
    name = "Build (1)"

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
}))

