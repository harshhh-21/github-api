def call(Map config = [:]) {
    sh "echo Hello Harsh ${config.name}. Today is not  ${config.dayOfWeek}."
}
