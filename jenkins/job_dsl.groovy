folder('Whanos base images') {
    displayName('Whanos base images')
    description('Whanos base images')

    job('Build all base images') {

    }

    job('whanos-c') {

    }

    job('whanos-java') {

    }

    job('whanos-javascript') {

    }

    job('whanos-python') {

    }

    job('whanos-befunge') {

    }
}

folder('Projects') {
    displayName('Projects')
    description('Projects')
}

job('link-project') {
    parameters {

    }
    steps {
        dsl {
            text('''
            job() {
                
            }
            '''.stripIndent())
        }
    }
}