def call(Map config = [:]) {
    sh "echo Hello Harsh ${config.name}. Today's  ${config.dayOfWeek}."
}
