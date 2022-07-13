$(document).ready(function() {
    //    pass
    });
    
    async function Edit_project(id){
        // let datos = {};
    
        // datos.idea = document.getElementById('InputIdea').value;
        // datos.state = document.getElementById('InputStatus').value;
        // datos.repository = document.getElementById('InputRepository').value;
        // datos.bibliografy = document.getElementById('InputBibliografy').value;
    
        const request = await fetch('api/tables_projects/' + id, {
            method: 'PUT',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
        body: JSON.stringify(datos)
      });
      }