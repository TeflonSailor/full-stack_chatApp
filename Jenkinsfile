pipeline {

    agent { label 'mern-slave' }

    stages {

        stage('Checkout Code') {

            steps {

                git branch: 'main',
                url: 'https://github.com/TeflonSailor/full-stack_chatApp.git'

            }

        }

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

        stage('Run Backend') {

            steps {

                dir('backend') {

                    bat 'npm start'

                }

            }

        }

    }

    post {

        success {

            echo 'Build completed successfully 🎉'

        }

        failure {

            echo 'Build failed ❌'

        }

    }

}
