angular.module('user.module', []).controller('common.user.controllers', function ($scope, $http) {
    $http.get('api/dictionary/').success(function(data) {
        $scope.items = data;
    });
});