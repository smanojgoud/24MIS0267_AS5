pipeline {
    agent any

    tools {
        maven 'Maven 3.x' // Ensure this matches your Jenkins Global Tool Configuration name
        jdk 'Java 17'     // Ensure this matches your Jenkins Java tool name
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Repository checked out successfully.'
            }
        }

        stage('Clean & Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline finished successfully!'
        }
        failure {
            echo 'Pipeline failed. Check build logs.'
        }
    }
}
