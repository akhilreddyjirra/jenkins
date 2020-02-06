import src.bcgov.ChangedFiles.*
import src.bcgov.GitHubHelper.*
import src.bcgov.date.*
import src.bcgov.abcd.*
println("TIMESTAMP")
stage('testing lib') {
    def TIMESTAMP = getTimeStamp();
    echo "${TIMESTAMP}"
}
