var dictionaryApp = angular.module('dictionayApp', []);
dictionaryApp.controller('dictionaryCtrl', function ($scope, $http) {
    $http.get('api/dictionary/').success(function(data) {
        $scope.items = data;
    });
});