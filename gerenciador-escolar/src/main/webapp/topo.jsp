<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">SisLTPW</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Aluno<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="aluno_form.jsp">Novo Aluno</a></li>
          <li><a href="aluno_lista.jsp">Lista de Alunos</a></li>
    
        </ul>
      </li>
   <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Professor<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="professor_form.jsp">Novo Professor</a></li>
          <li><a href="professor_lista.jsp">Lista de Professores</a></li>
        </ul>
    </li> 

    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Turma<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="turma_form.jsp">Nova Turma</a></li>
          <li><a href="turma_lista.jsp">Lista de Turmas</a></li>
        </ul>
    </li> 

    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Tabelas Auxiliares<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Departamento</a></li>
          <li><a href="curso.jsp">Curso</a></li>
          <li><a href="disciplina.jsp">Disciplina</a></li>
          <li><a href="#">G�nero</a></li>
        </ul>
    </li> 

      
      
    </ul>
  </div>
</nav>

            <!-- Modal -->
       <div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
         <div class="modal-dialog" role="document">
           <div class="modal-content">
             <div class="modal-header">
               <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
               <h4 class="modal-title" id="modalLabel">Excluir Item</h4>
             </div>
             <div class="modal-body">
               Deseja realmente excluir este item?
             </div>
             <div class="modal-footer">
               <button type="button" class="btn btn-primary">Sim</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
             </div>
           </div>
         </div>
       </div> <!-- /.modal -->


<br><br><br>