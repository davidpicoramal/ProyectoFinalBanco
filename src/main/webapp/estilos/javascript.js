
 function validarFormu(formul){
     
     var nombre = formul.nombre;
     if (nombre.value === "" ){
         alert("Debe proporcionar un nombre de usuario");
         nombre.focus();
         nombre.select();
         return false;
     }
     
     var apellido1 = formul.apellido1;
     if (apellido1.value == "" ){
         alert("Debe proporcionar un apellido al menos");
         apellido1.focus();
         apellido1.select();
         return false;
     }
     
     
     var dni = formul.dni;
     if (dni.value === "" ){
         alert("Debe proporcionar un Dni");
         dni.focus();
         dni.select();
         return false;
     }
     
     var telefono = formul.telefono;
     if (telefono.value === "" ){
         alert("Debe proporcionar un nnumero de telefono");
         telefono.focus();
         telefono.select();
         return false;
     }
     
     
     var email = formul.email;
     if (email.value === "" ){
         alert("Debe proporcionar un email");
         email.focus();
         email.select();
         return false;
     }
     
     var calle = formul.calle;
     if (calle.value === "" ){
         alert("Debe proporcionar la calle ");
         calle.focus();
         calle.select();
         return false;
     }
     
     var numero = formul.numero;
     if (numero.value === "" ){
         alert("Debe proporcionar un nnumero de la calle");
         numero.focus();
         numero.select();
         return false;
     }
     
     var piso = formul.piso;
     if (piso.value === "" ){
         alert("Debe proporcionar un nnumero del piso");
         piso.focus();
         piso.select();
         return false;
     }
     
     var poblacion = formul.poblacion;
     if (poblacion.value === "" ){
         alert("Debe proporcionar la poblacion");
         poblacion.focus();
         poblacion.select();
         return false;
     }
     
     var fechanac = formul.fechanac;
     if (fechanac.value === "" ){
         alert("Debe proporcionar su fecha de nacimiento");
         fechanac.focus();
         fechanac.select();
         return false;
     }
     var cp = formul.cp;
     if (calle.value === "" ){
         alert("Debe proporcionar el codigo postal");
         cp.focus();
         cp.select();
         return false;
     }
     
     
     
     
     var password =formul.password;
     if(password.value == "" || password.value.length<3 ){
         alert ("Debe proporcionar un pasword al menos de  3 caracteres");
         password.focus();
         password.select();
         return false;
     }
     
          var password1 = formul.password1;
     if(password.value != password1.value ){
         alert ("la contraseña debe coicidir");
         password.focus();
         password.select();
         return false;
     }
     


     
     alert("Formulario valido enviando datos al servlet");
     return true;
 }

