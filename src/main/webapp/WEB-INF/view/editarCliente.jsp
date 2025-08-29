<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Cliente</title>
    <!-- Bootstrap 5 -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
        <div class="container">
            <a class="navbar-brand fw-bold" href="${pageContext.request.contextPath}/">Gestión de Clientes</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item ms-3">
                        <a class="nav-link" href="${pageContext.request.contextPath}/">Inicio</a>
                    </li>
                    <li class="nav-item ms-3">
                        <a class="nav-link" href="${pageContext.request.contextPath}/cliente/listarClientes">Listar Clientes</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Contenido principal -->
    <main class="container my-5 flex-fill">

        <h2 class="text-center mb-4">Editar Cliente</h2>

        <div class="card shadow-sm p-4 mx-auto central-small-container">
            <form:form action="actualizarCliente" modelAttribute="cliente" method="POST">
                <form:hidden path="id"/>

                <div class="mb-3">
                    <label class="form-label">Nombre</label>
                    <form:input path="nombre" cssClass="form-control"/>
                    <form:errors path="nombre" cssClass="error-message"/>
                </div>

                <div class="mb-3">
                    <label class="form-label">Apellido</label>
                    <form:input path="apellido" cssClass="form-control"/>
                    <form:errors path="apellido" cssClass="error-message"/>
                </div>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <form:input path="email" cssClass="form-control"/>
                    <form:errors path="email" cssClass="error-message"/>
                </div>

                <div class="d-flex justify-content-between">
                    <a href="${pageContext.request.contextPath}/cliente/listarClientes" class="btn btn-secondary">Cancelar</a>
                    <button type="submit" class="btn btn-warning">Guardar cambios</button>
                </div>

            </form:form>
        </div>

    </main>

    <!-- Footer -->
    <footer class="bg-primary text-white text-center py-3">
        <p class="mb-0">&copy; 2025 - CRUD Clientes con Spring + Hibernate</p>
    </footer>

    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
</body>
</html>