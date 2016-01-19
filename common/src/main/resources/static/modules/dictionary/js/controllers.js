angular.module('dictionary.module', []).controller('common.dictionary.controllers', function ($scope, $http) {
    $http.get('api/dictionary/').success(function(data) {
        $scope.items = data;
    });
});