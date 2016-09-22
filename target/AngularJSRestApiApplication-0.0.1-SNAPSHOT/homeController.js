app.controller('homeCtrl', function($scope, userPersistenceService){
	$scope.user = userPersistenceService.getCookieData();
});