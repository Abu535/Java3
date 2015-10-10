/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module('aplication',[])
        .controller('ctrlPrincipal', function($scope,$http){
  console.log("Bienvenido a angular");  
  $scope.mensajito='este es un mensajito simple';       
});
