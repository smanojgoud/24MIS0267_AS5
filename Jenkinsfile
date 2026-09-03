pipeline {
    agent any

       tools {
        maven 'M3'     // Changed from 'Maven 3.x' to 'M3'
        jdk 'Java 17'  // Keep this since your Java fix successfully cleared the JDK error!
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
