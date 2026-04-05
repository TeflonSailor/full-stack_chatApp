pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK11'
    }

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/TeflonSailor/full-stack_chatApp.git'
            }
        }

        stage('Install frontend') {
            steps {
                sh '''
                cd frontend
                npm install
                npm start &
                sleep 20
                '''
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh 'mvn clean test'
            }
        }

    }

    post {

        always {
            junit 'target/surefire-reports/*.xml'
        }

    }

}
