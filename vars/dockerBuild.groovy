def call(image) {

  sh "docker build -t ${image} . "

}
