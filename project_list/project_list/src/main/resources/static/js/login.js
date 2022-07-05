$(document).ready(function() {
//    pass
});

async function Login_user(){
    let data = {};
    data.mail = document.getElementById('InputEmail').value;
    data.password = document.getElementById('InputPassword').value;

    const request = await fetch('api/login', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
    body: JSON.stringify(data)
  });
  const response = await request.text();
  if(response == "OK"){
    window.location.href = "tables.html";
  } else {
    alert("There was a problem, try again !")
  }
  }