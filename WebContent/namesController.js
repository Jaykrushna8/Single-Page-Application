var app = angular.module('myApp', ['ngCookies','ngRoute']);
app.controller('validateCtrl', function($scope, $http,$window, userPersistenceService) {
    $scope.users = [];
    $scope.emailid = "";
    $scope.password = "";
    $scope.userForm ={
    		emailid: "",
    		firstname: "",
    		lastname: "",
    		password: "",
    		contactno: -1,
    		favfood: ""
    };
    
     $scope.refreshUserData = function(){
    	$http({  
            method : 'GET',  
            url : 'http://localhost:8080/AngularJSRestApiApplication/rest/users'  
        }).then(function successCallback(response) {  
            $scope.users = response.data;  
        }, function errorCallback(response) {  
            console.log(response.statusText);  
        });  
    };
    $scope.createAccount = function(){
    	$http({
    	 method: 'POST',
    	 url: 'rest/users',
    	 headers: {
    	   'Content-Type':  'application/json'
    	 },
    	 data:  angular.toJson($scope.userForm)
    	}).then( _success, _error );
    };
    
    function _success(response) {  
        refreshUserData();  
        _clearFormData()  
    }  

    function _error(response) {  
        console.log(response.statusText);  
    }  
    
  //Clear the form  
    function _clearFormData() {  
        $scope.userForm.emailid = "";  
        $scope.userForm.firstname = "";  
        $scope.userForm.lastname = "";
        $scope.userForm.password = "";
        $scope.userForm.contactno = -1;
        $scope.userForm.favfood = "";
      
    };  
    
    $scope.login = function(){
    	$http({  
            method : 'GET',  
            url : 'rest/users/'+ $scope.emailid 
        }).then(function successCallback(response) {  
            $scope.users = response.data;  
            $scope.result = angular.equals($scope.password,$scope.users.password);
            console.log($scope.result);
            if($scope.result){
            	userPersistenceService.setCookieData($scope.users);
            	$window.location.href = 'http://localhost:8080/AngularJSRestApiApplication/homepage.html';
            }
            else{
            	alert('Password incorrect');
            }
        }, function errorCallback(response) {  
        	alert('Email id or Password incorrect');
            console.log(response.statusText);  
        });  
    };


});
 