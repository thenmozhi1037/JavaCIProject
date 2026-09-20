pipeline {
    agent any

    tools {
        jdk 'JAVA21'
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('SonarQube') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat 'mvn verify sonar:sonar -Dsonar.projectKey=JavaCIProject'
                }
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }
}
