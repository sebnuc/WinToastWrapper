plugins {
    `cpp-library`
}

library {
    source.from(file("WinToastWrapper"))
}

tasks.withType<CppCompile>().configureEach {
    compilerArgs.add("/std:c++17")
    compilerArgs.add("/EHsc")

    //compilerArgs.add("/JMC") // debug
    compilerArgs.add("/permissive-")
    //compilerArgs.add("/ifcOutput \"x64\\Debug\\\"")
    //compilerArgs.add("/ifcOutput \"x64\\Release\\\"")
    compilerArgs.add("/GS")
    compilerArgs.add("/GL") // release
    compilerArgs.add("/W3")
    compilerArgs.add("/Gy")
    compilerArgs.add("/Zc:wchar_t")
    //compilerArgs.add("/ZI") // debug
    compilerArgs.add("/Zi") // release
    compilerArgs.add("/Gm-")
    // compilerArgs.add("/Od") // debug
    compilerArgs.add("/O2") // release
    compilerArgs.add("/sdl")
    compilerArgs.add("/Zc:inline")
    compilerArgs.add("/fp:precise")
    //compilerArgs.add("/D \"_DEBUG\"") // debug
    compilerArgs.add("/D \"NDEBUG\"") // release
    compilerArgs.add("/D \"_CONSOLE\"")
    compilerArgs.add("/D \"_WINDLL\"")
    compilerArgs.add("/D \"_UNICODE\"")
    compilerArgs.add("/D \"UNICODE\"")
    compilerArgs.add("/errorReport:prompt")
    compilerArgs.add("/WX-")
    compilerArgs.add("/Zc:forScope")
    //compilerArgs.add("/RTC1") // debug
    compilerArgs.add("/Gd")
    compilerArgs.add("/Oi")
    //compilerArgs.add("/MDd") // debug
    compilerArgs.add("/MD") // release
    compilerArgs.add("/FC")
//    compilerArgs.add("/Fa\"x64\\Debug\\\"")
    compilerArgs.add("/nologo")
//    compilerArgs.add("/Fo\"x64\\Debug\\\"")
//    compilerArgs.add("/Fp\"x64\\Debug\\WinToastWrapper.pch\"")
    compilerArgs.add("/diagnostics:column")
//    compilerArgs.add("/Fd\"x64\\Debug\\vc143.pdb\"")

    includes {
        listOf(
            // Order is important here!
            "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.22621.0\\winrt",
            "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.22621.0\\cppwinrt",
        )
    }
}
