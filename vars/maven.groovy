def call(String command) {
    sh("./mvn ${command}")
}

def paramList(List commands) {
    for (command in commands) {
        sh("./mvn ${command}")
    }
}