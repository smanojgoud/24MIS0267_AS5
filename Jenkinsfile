pipeline {
    agent any

    tools {
        maven 'M3' 
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Event Ticket System checked out successfully.'
            }
        }

        stage('Clean & Compile') {
            steps {
                bat 'mvn -f event-ticket-system/pom.xml clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                bat 'mvn -f event-ticket-system/pom.xml test'
            }
        }

        stage('Package Application') {
            steps {
                bat 'mvn -f event-ticket-system/pom.xml package'
            }
        }
    }

    post {
        success {
            echo 'Event Ticket System CI/CD Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline encountered processing errors.'
        }
    }
}
