var app = angular.module("setPoints", []);

//app.controller("points", function($http, $scope) {
//	var controller = this;
//
//	controller.updatePoints = [];
//	$scope.updatePoints = function() {
//	};
//
//	$http.post("/rating", Userpoints);
//
//});
app.controller("score", function($http, $scope) {
	var controller = this;

	controller.users = [];
	$scope.getScore = function() {
		$http.get("/getScore").then(function(value) {
			controller.users = value.data;
			
		}, function(reason) {
			window.alert("Error");
		},function($scope){
			$scope.users;
		})
	};

});
