app.config(function($stateProvider,$urlRouterProvider){

    $stateProvider
        .state('index', {
                url:'/index',
                templateUrl:'index.html',
                controller:'requestDetailsController'
            }
        )
        .state('requests.addRequest',{
            url:'/addRequest',
            templateUrl:'scripts/issueRequest/templates/requestIssueForm.html'

        })
		.state('java',{
			url:'/java',
			templateUrl:'scripts/ComputerScience/templates/java.html'
		})
		.state('javascript',{
			url:'/javascript',
			templateUrl:'scripts/ComputerScience/templates/javascript.html'
		})
});

