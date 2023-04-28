<!DOCTYPE html><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>All Students</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
<div class="container my-2">
    <div class="card">
        <div class="card-body">
            <div class="container my-5">
                <p class="my-5">
                    <a href="/Spring_Boot_CRUD_With_JSP/add-student" class="btn btn-primary">
                        <i class="fas fa-user-plus ml-2">Add Student </i>
                    </a>
                </p>
                <div class="col-md-10">
                    <c:if test="${students.size()==0}">
                        <h2>No record found !!</h2>
                    </c:if>
                    <c:if test="${students.size() gt 0 }">
                        <div>
                            <table class="table table-striped table-responsive-md">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Fees</th>
                                    <th>Dept</th>

                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="student" items="${students}">
                                    <tr>
                                        <td>${student.id}</td>
                                        <td>${student.name}</td>
                                        <td>${student.fee}</td>
                                        <td>${student.dept}</td>
                                        <td>
                                            <a href="/Spring_Boot_CRUD_With_JSP/student-update/${student.id}" class="btn btn-primary">
                                                <i class="fas fa-user-edit ml-2"></i></a>
                                        </td>
                                        <td>
                                            <a href="/Spring_Boot_CRUD_With_JSP/student-delete/${student.id}" class="btn btn-primary">
                                                <i class="fas fa-user-times ml-2"></i>
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>