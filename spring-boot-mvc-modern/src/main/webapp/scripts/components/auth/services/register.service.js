'use strict';

angular.module('mycmsApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


