pipeline {

  agent { label 'kubepod' }

  stages {

    stage('Checkout Source') {
      steps {
       git credentialsId: 'Github', url: 'https://github.com/Prashant050687/springboot-kubernetes'
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
