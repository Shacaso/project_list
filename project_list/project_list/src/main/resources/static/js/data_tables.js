// Call the data_tables jQuery plugin
$(document).ready(function() {
  Set_user();
  $('#data_tables').DataTable();
});

async function Set_user(){

    const request = await fetch('api/users', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const users = await request.json();

  let list_users = '';
  for(let user of users){
  let delete_button = '<a href="#" onclick="delete_user('+user.id+')" class="btn btn-danger btn-circle .btn-sm"><i class="fas fa-trash"></i></a>';
  let users_td = '<tr><td>'+user.first_name+' '+user.last_name+'</td><td>'+user.mail+'</td><td>'+user.password+'</td><td>'+delete_button+'<a href="#" class="btn btn-info btn-circle .btn-sm"><i class="fas fa-info-circle"></i></a><a href="#" class="btn btn-warning btn-circle .btn-sm"><i class="fas fa-exclamation-triangle"></i></a><a href="#" class="btn btn-success btn-circle .btn-sm"><i class="fas fa-check"></i></a></td></tr>';

  list_users += users_td;
  }
    document.querySelector('#data_tables tbody').outerHTML = list_users;
}

async function delete_user(id){

    if(!confirm("Sure?")){return;}

    const request = await fetch('api/users/'+id, {
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

  location.reload();
}