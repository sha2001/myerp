/**
 * Created by sebastien.hastir on 18/12/15.
 */

var dictionaryApp = angular.module('dictionaryApp', []);

dictionaryApp.controller('dictionaryCtrl', function ($scope, $http) {
    $http.get('dictionary/items').success(function(data) {
        $scope.items = data;
    });
});