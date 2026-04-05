pipeline {

    agent { label 'mern-slave' }

    environment {

        MONGODB_URI = "mongodb://127.0.0.1:27017/chatapp"
        PORT = "5000"
        JWT_SECRET = "secret123"

    }

    stages {

        stage('Install Backend Dependencies') {

            steps {

                dir('backend') {

                    bat 'npm install'

                }

            }

        }

        stage('Install Frontend Dependencies') {

            steps {

                dir('frontend') {

                    bat 'npm install'

                }

            }

        }

        stage('Build Frontend') {

            steps {

                dir('frontend') {

                    bat 'npm run build'

                }

            }

        }

    }

}
