pipeline{
     agent any
    tools{
       maven 'maven'
    }
    stages{
        stage ('Checkout'){
            steps{
            checkout scm
            }
        }
        stage ('Build') {
             steps{
             sh 'mvn clean package -DskipTests'
             }
        }
        stage ('Run tests') {
             steps {
             sh 'mvn test'
             }
        }

     }
    post{
        always{
            allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
            ])
        }
    }
}

