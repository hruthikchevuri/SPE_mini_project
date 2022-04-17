pipeline {
  environment {
    registry = "hruthikchevuri/miniproject"
    registryCredential = 'Dockerhubdetails'
    dockerImage = ''
  }
  agent any
  stages {
    stage('FETCH FROM GITHUB') {
      steps {
        git 'https://github.com/hruthikchevuri/SPE_mini_project'
      }
    }
    
    stage('MVN BUILD AND TEST') {
      steps {
        echo "building the project and installs the project files(JAR) to the local repository"
        sh "mvn clean install"
      }
    }
    stage('DOCKER IMG BUILD') {
      steps{
        script {
          echo "Building Docker image"
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('PUSH TO DOCKERHUB') {
      steps{
        script {
          echo "Deploying Docker Image to " + registry
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push('latest')
          }
        }
      }
    }
    stage('DELETE unused docker images') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
        sh "docker image prune"
      }
    }
    stage('ANSIBLE DEPLOY') {
      steps{
        ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible',  playbook: 'playbook.yml', sudoUser: null
      }
    }    
  }
}

