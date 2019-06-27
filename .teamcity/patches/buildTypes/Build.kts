package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ideaInspections
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    check(description == "") {
        "Unexpected description: '$description'"
    }
    description = "test"

    expectSteps {
        maven {
            goals = "clean test"
            pomLocation = "artifact/pom.xml"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
        script {
            scriptContent = """echo "test""""
        }
        ideaInspections {
            pathToProject = "artifact/pom.xml"
            jvmArgs = "-Xmx512m -XX:ReservedCodeCacheSize=240m"
            targetJdkHome = "%env.JDK_18%"
        }
    }
    steps {
        check(stepsOrder == arrayListOf("RUNNER_1", "RUNNER_2", "RUNNER_3")) {
            "Unexpected build steps order: $stepsOrder"
        }
        stepsOrder = arrayListOf<String>()
    }
}