<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<br><br><br>


<div>
  <h3 class="center-align">Employee Details Added Successfully</h3>
  </div>
  <c:if test="${not empty emp}">
<div class="container">
<table class="striped">
<thead>
          <tr>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Date of Birth</th>
              <th>Basic Salary</th>
              <th>Generated ID</th>
          </tr>
        </thead>
  
    <tr>
      <td><c:out value="${emp.empId}" /></td>
      <td><c:out value="${emp.empName}" /></td>
      <td><c:out value="${emp.dob}" /></td>
      <td><c:out value="${emp.salary}" /></td>
      <td><c:out value="${emp.generatedId}" /></td>
    </tr>

</table>
</div>

  </c:if>





<jsp:include page="footer.jsp"/>