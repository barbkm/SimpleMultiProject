pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn clean install'

 pipeline {
        agent any
        stages {
            stage('Compile stage') {
                steps {
                    maven(maven : 'Maven_3.5.2'){
                        bat "mvn clean compile"
                }

            }
        }
    stage ('Test Stage') {

            steps {

                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn test'
             stage('testing stage') {
                 steps {
                    maven(maven : 'Maven_3.5.2'){
                        bat "mvn test"
                }
            }
        }

              stage('deployment stage') {
                  steps {
                    maven(maven : 'Maven_3.5.2'){
                        bat "mvn deploy"
                }

            }
        }


        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }


}
