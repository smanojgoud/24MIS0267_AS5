pipeline {
    agent any

    tools {
        maven 'M3' 
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Repository checked out successfully.'
            }
        }

        stage('Clean & Compile') {
            steps {
                // Added -f folder/pom.xml to point Maven to the right folder location
                bat 'mvn -f internet-billing-system/pom.xml clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                // Added -f folder/pom.xml to point Maven to the right folder location
                bat 'mvn -f internet-billing-system/pom.xml test'
            }
        }

        stage('Package Application') {
            steps {
                // Added -f folder/pom.xml to point Maven to the right folder location
                bat 'mvn -f internet-billing-system/pom.xml package'
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
