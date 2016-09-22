app.config(function($routeProvider){

	$routeProvider
        .when('/profile', {
        		templateUrl :'UserProfile.html',
                controller:'homeCtrl'
            })
});

