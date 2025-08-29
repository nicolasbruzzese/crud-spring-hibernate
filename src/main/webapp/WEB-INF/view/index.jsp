<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Bienvenido - Gestión de Clientes</title>
    <!-- Bootstrap 5 -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body class="bg-light d-flex flex-column min-vh-100">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
        <div class="container">
            <a class="navbar-brand fw-bold" href="${pageContext.request.contextPath}/">Gestión de Clientes</a>
        </div>
    </nav>

    <!-- Contenido central -->
    <main class="container flex-fill d-flex justify-content-center align-items-center">
        <div class="text-center p-5 shadow-sm rounded bg-white central-container">
            <h1 class="mb-4">¡Bienvenido al Sistema de Gestión de Clientes!</h1>
            <p class="mb-4">Desde aquí podés listar, agregar o editar tus clientes de forma rápida y sencilla.</p>

            <div class="d-flex justify-content-center gap-3">
                <a href="${pageContext.request.contextPath}/cliente/listarClientes" class="btn btn-primary btn-lg">Listar los clientes</a>
                <a href="${pageContext.request.contextPath}/cliente/nuevoCliente" class="btn btn-success btn-lg">Agregar un nuevo cliente</a>
            </div>
        </div>
    </main>

    <!-- Footer -->
    <footer class="bg-primary text-white text-center py-3 mt-auto">
        <p class="mb-0">&copy; 2025 - CRUD Clientes con Spring + Hibernate</p>
    </footer>

    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
</body>
</html>