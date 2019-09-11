<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<h3 class="center-align">All Employees</h3><br><br><br>
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
  <c:forEach items="${getall}" var="empl">
    <tr>
      <td><c:out value="${empl.empId}" /></td>
      <td><c:out value="${empl.empName}" /></td>
      <td><c:out value="${empl.dob}" /></td>
      <td><c:out value="${empl.salary}" /></td>
       <td><c:out value="${empl.generatedId}" /></td>
    </tr>
  </c:forEach>
</table>
</div>
<jsp:include page="footer.jsp"/>