var dictionaryApp = angular.module('dictionayApp', []);
dictionaryApp.controller('dictionaryCtrl', function ($scope, $http) {
    $http.get('api/dictionary/items').success(function(data) {
        $scope.items = data;
    });
});