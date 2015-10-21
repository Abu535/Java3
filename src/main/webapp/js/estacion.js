/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular.module('estacion',[])
        .controller("ctrlEstacion", function($scope,$http){
  console.log("Bienvenido a angular");  
  $scope.mensajito='este es un mensajito simple';    
  //vamos a invocar a uin servicio JSON que cree con mucho cariño
  $http.get('http://campitos.elasticbeanstalk.com/estacion/temperatura').success(function(datos){
      $scope.temperatura=datos[20].temperatura;
      $scope.esta=datos;
  }) 
});
