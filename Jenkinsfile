pipeline {

  agent { label 'kubepod' }

  stages {

    stage('Checkout Source') {
      steps {
        git url:'https://github.com/Prashant050687/springboot-kubernetes.git', branch:'master'
      }
    }

    stage('Deploy App') {
      steps {
        script {
          kubernetesDeploy(configs: "kubernetes_jenkins.yaml", kubeconfigId: "mykubeconfig")
        }
      }
    }

  }

}
