$(document).ready(function() {
//    pass
});

async function Add_user(){
    let datos = {};

    datos.first_name = document.getElementById('FirstName').value;
    datos.last_name = document.getElementById('LastName').value;
    datos.mail = document.getElementById('InputEmail').value;
    datos.password = document.getElementById('InputPassword').value;
    let repeat_password = document.getElementById('RepeatPassword').value;

    if(repeat_password != datos.password){
    alert("The password you typed is different, please enter it again");
    return;
    }

    const request = await fetch('api/table_user', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
    body: JSON.stringify(datos)
  });
  }