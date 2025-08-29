<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
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
                        <a class="nav-link" href="${pageContext.request.contextPath}/cliente/nuevoCliente">Nuevo Cliente</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Contenido dinámico -->
    <main class="container my-5 flex-fill">

        <h2 class="text-center mb-4">Listado de Clientes</h2>

        <div class="table-responsive shadow-sm rounded bg-white p-3">
            <table class="table table-hover align-middle">
                <thead class="table-primary">
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Email</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="clienteTemp" items="${clientes}">
                        <c:url var="linkActualizar" value="/cliente/editarCliente">
                            <c:param name="clienteId" value="${clienteTemp.id}"/>
                        </c:url>

                        <c:url var="linkEliminar" value="/cliente/eliminarCliente">
                            <c:param name="clienteId" value="${clienteTemp.id}"/>
                        </c:url>

                        <tr>
                            <td>${clienteTemp.nombre}</td>
                            <td>${clienteTemp.apellido}</td>
                            <td>${clienteTemp.email}</td>
                            <td class="text-center">
                                <a href="${linkActualizar}" class="btn btn-sm btn-warning me-2">Modificar</a>
                                <a href="${linkEliminar}" class="btn btn-sm btn-danger">Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    </main>

    <!-- Footer -->
    <footer class="bg-primary text-white text-center py-3">
        <p class="mb-0">&copy; 2025 - CRUD Clientes con Spring + Hibernate</p>
    </footer>

    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/clientes.js"></script>
</body>
</html>