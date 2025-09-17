def call(Stringname,String dayofWeek = [:]) {
    sh "echo Hello ${name}. Today is not  ${dayofWeek}."
}
