// Call the dataTables jQuery plugin
$(document).ready(function() {
    Set_user();
  $('#data_tables').DataTable();
});

async function Set_user(){

    const request = await fetch('users', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const users = await request.json();

  let list_users = '';
  for(let user of users){
  let users_td = '<tr><td>'+user.first_name+' '+user.last_name+'</td><td>'+user.mail+'</td><td>'+user.password+'</td><td><a href="https://www.youtube.com/watch?v=7vHzVN0EiQc&t=1829s&ab_channel=LucasMoy">LucasMoy</a></td><td><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a><a href="#" class="btn btn-info btn-circle"><i class="fas fa-info-circle"></i></a><a href="#" class="btn btn-warning btn-circle"><i class="fas fa-exclamation-triangle"></i></a><a href="#" class="btn btn-success btn-circle"><i class="fas fa-check"></i></a></td></tr>';

  list_users += users_td;
  }
    document.querySelector('#data_tables tbody').outerHTML = list_users;
}