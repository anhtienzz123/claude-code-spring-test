pipeline{
    agent any
    stages{
        stage("Test print branch name"){
            steps{
                echo "the branch is: ${env.BRANCH_NAME}"
            }
        }
    }
}