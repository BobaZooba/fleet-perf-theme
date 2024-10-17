plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    id = "me.bobazooba.perf"

    metadata {
        readableName = "Perf Theme"
        description = "Red, Pink, Warm, No contrast, No visual noise. Like XCode, but better"
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
