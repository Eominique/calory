apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.coreBase))
    "implementation"(Coroutines.coroutines)
}