FROM jenkins/jenkins:latest
WORKDIR /app
COPY . /app
RUN /usr/local/bin/install-plugins.sh cloudbees-folder configuration-as-code credentials github job-dsl script-security structs role-strategy ws-cleanup
COPY ./whanos_jenkins.yml /var/jenkins_home/casc_configs/
COPY --chown=jenkins:jenkins ./job_dsl.groovy /usr/share/jenkins/ref/init.groovy.d/job_dsl.groovy