<jsp:include page="header.jsp"/>
  <h3 class="center-align"> Add Employee</h3>
	
  <div class="container" style="border:2px;padding:5%">
    <form class="col s12" action="add" method="post">
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter your name" name="empName" type="text">
          <label>Name</label>
        </div>
       </div>
     
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="DD/MMM/YYYY" name="dob" type="date">
          <label>DOB</label>
        </div>
      </div>
      
        <div class="input-field col s12">
          <input placeholder="Enter Basic Salary" name="salary" type="text" class="validate">
          <label>Salary</label>
        </div>
      <input class="waves-effect waves-light btn" value="submit" type="submit"></input>
    </form>
  </div>
  <script>
  document.addEventListener('DOMContentLoaded', function() {
  	var options = {
           format: 'yyyy-mmm-dd',
            yearRange: 100
        };
    var elems = document.querySelectorAll('.datepicker');
    var instances = M.Datepicker.init(elems, options);
  });
  </script>

<jsp:include page="footer.jsp"/>