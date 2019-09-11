<jsp:include page="header.jsp"/>
 <h3 class="center-align"> Get Employee</h3>
	
  <div class="container" style="border:2px;padding:5%">
    <form class="col s12" action="get" method="get">
      <div class="row">
          <input placeholder="Enter Employee ID" name="empId" type="number">
          <label>Employee ID</label>
        </div>
     
      <input class="waves-effect waves-light btn" type="submit"></input>
    </form>
  </div>
<jsp:include page="footer.jsp"/>