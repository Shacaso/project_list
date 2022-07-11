$(document).ready(function() {
  Set_project();
  $('#data_table_project').DataTable();
});

async function Set_project(){
    const request = await fetch('api/tables_projects', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
const projects = await request.json();

  let list_projects = '';
  for(let project of projects){
    let delete_button = '<a href="#" onclick="delete_project('+project.id+')" class="btn btn-danger btn-circle .btn-sm"><i class="fas fa-trash"></i></a>';
    let project_td = '<tr><td>'+project.idea+'</td><td>'+project.state+'</td><td>'+project.repository+'</td><td>'+project.bibliografy+'</td><td>'+delete_button+'<a href="#" class="btn btn-info btn-circle .btn-sm"><i class="fas fa-info-circle"></i></a><a href="#" class="btn btn-warning btn-circle .btn-sm"><i class="fas fa-exclamation-triangle"></i></a><a href="#" class="btn btn-success btn-circle .btn-sm"><i class="fas fa-check"></i></a></td></tr>';
    list_projects += project_td;
  }
    document.querySelector('#data_table_project tbody').outerHTML = list_projects;
}

async function delete_project(id){
    if(!confirm("Sure?")){return;}

    const request = await fetch('api/tables_projects/'+id, {
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  location.reload();
}