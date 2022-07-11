$(document).ready(function() {
    //    pass
    });
    
    async function Add_project(){
        let datos = {};
    
        datos.idea = document.getElementById('InputIdea').value;
        datos.state = document.getElementById('InputStatus').value;
        datos.repository = document.getElementById('InputRepository').value;
        datos.bibliografy = document.getElementById('InputBibliografy').value;
    
        const request = await fetch('api/tables_projects', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
        body: JSON.stringify(datos)
      });
      }