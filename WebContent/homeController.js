app.controller('homeCtrl', function($scope, $http,userPersistenceService){
	$scope.user = userPersistenceService.getCookieData();
	$scope.updateAccount = function(){
    	$http({
    	 method: 'PUT',
    	 url: 'rest/users',
    	 headers: {
    	   'Content-Type':  'application/json'
    	 },
    	 data:  angular.toJson($scope.user)
    	}).then( _success, _error );
    };
    
    function _success(response) {  
         
    };  

    function _error(response) {  
        console.log(response.statusText);  
    };  
    _updateForm();
    function _updateForm(){
    	$http({  
            method : 'GET',  
            url : 'rest/users/'+ $scope.user.emailid 
        }).then(function successCallback(response) {  
            $scope.user = response.data;  
        }, function errorCallback(response) {  
            console.log(response.statusText);  
        });  
    };
});