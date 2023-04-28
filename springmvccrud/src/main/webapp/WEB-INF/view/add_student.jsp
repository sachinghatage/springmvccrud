<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Add Student</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
<div class="container my-5">
    <h3>Add Student</h3>
    <div class="card">
        <div class="card-body">
            <div class="col-md-10">
                <form:form action="/Spring_Boot_CRUD_With_JSP/save-student"
                           method="post" modelAttribute="command">
                    <form:hidden path="id" />
                    <div class="row">
                        <div class="form-group col-md-8">
                            <label for="name" class="col-form-label">Name</label>
                            <form:input type="text" class="form-control" id="name"
                                        path="name" placeholder="Enter Name" />
                        </div>
                        <div class="form-group col-md-8">
                            <label for="id" class="col-form-label">Id</label>
                            <form:input type="text" class="form-control" id="id"
                                        path="id" placeholder="id" />
                        </div>
                        <div class="form-group col-md-8">
                            <label for="fee" class="col-form-label">Fee</label>
                            <form:input type="text" class="form-control" id="email"
                                        path="fee" placeholder="fee" />
                        </div>


                        <div class="form-group col-md-8">
                            <label for="dept" class="col-form-label">Dept</label>
                            <form:input type="text" class="form-control" id="email"
                                        path="dept" placeholder="dept" />
                        </div>

                        <div class="col-md-6">
                            <input type="submit" class="btn btn-primary" value=" Submit ">
                        </div>

                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>