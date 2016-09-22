app.factory("userPersistenceService", ["$cookies", function($cookies) {
     var userName = {};

     return {
             	setCookieData: function(username) {
                  userName = username;
                  $cookies.putObject("userName", username);
                },
                getCookieData: function() {
                   userName = $cookies.getObject("userName");
                   return userName;
                },
                clearCookieData: function() {
                   userName = {};
                   $cookies.remove("userName");
                }
            }
   }
]);