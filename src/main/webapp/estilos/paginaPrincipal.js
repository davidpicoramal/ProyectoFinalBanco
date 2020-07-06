/* ------------------------------------ Click on login and Sign Up to  changue and view the effect
---------------------------------------
*/

/* global request */

function cambiar_login() {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";  
document.querySelector('.cont_form_login').style.display = "block";
document.querySelector('.cont_form_sign_up').style.opacity = "0";               

setTimeout(function(){  document.querySelector('.cont_form_login').style.opacity = "1"; },400);  
  
setTimeout(function(){    
document.querySelector('.cont_form_sign_up').style.display = "none";
},200);  
  }

function cambiar_sign_up(at) {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
  document.querySelector('.cont_form_sign_up').style.display = "block";
document.querySelector('.cont_form_login').style.opacity = "0";
  
setTimeout(function(){  document.querySelector('.cont_form_sign_up').style.opacity = "1";
},100);  

setTimeout(function(){   document.querySelector('.cont_form_login').style.display = "none";
},400);  


}    



function ocultar_login_sign_up() {

document.querySelector('.cont_forms').className = "cont_forms";  
document.querySelector('.cont_form_sign_up').style.opacity = "0";               
document.querySelector('.cont_form_login').style.opacity = "0"; 

setTimeout(function(){
document.querySelector('.cont_form_sign_up').style.display = "none";
document.querySelector('.cont_form_login').style.display = "none";
},500);  
  
  }


function validacionInicioSesion() {

    //validar DNI / NIE
    valor = document.getElementById("dniLI").value;
    if( valor == null || valor.length != 9 || /^\s+$/.test(valor) ) {
    alert('Debe introducir un DNI / NIE válido'+'\n'+'Formato DNI: 12345678X'+'\n'+'Formato NIE: X1234567Y');
    return false;
}
    //validar Contraseña
    valor = document.getElementById("passwordLI").value;
    if( valor == null || valor.length < 3 || /^\s+$/.test(valor) ) {
    alert('Debe introducir una contraseña válida (mínimo 3 carácteres)');
    return false;
  }
  
}

  function validacionRegistro() {

    //validar DNI / NIE
    valor = document.getElementById("dniSU").value;
    if( valor == null || valor.length == 0 || /^\s+$/.test(valor) ) {
    alert('Debe introducir un DNI / NIE válido'+'\n'+'Formato DNI: 12345678X'+'\n'+'Formato NIE: X1234567Y');
    return false;
  }
       var email = formul.email;
     if (email.value === "" ){
         alert("Debe proporcionar un email");
         email.focus();
         email.select();
         return false;
     }

}

