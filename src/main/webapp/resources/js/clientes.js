
// Confirmación de eliminación de clientes
document.addEventListener("DOMContentLoaded", function() {
    const botonesEliminar = document.querySelectorAll(".btn-danger");
    botonesEliminar.forEach(boton => {
        boton.addEventListener("click", function(event) {
            if (!confirm('¿Estás seguro que deseas eliminar este cliente?')) {
                event.preventDefault(); // Cancela la acción si se presiona "Cancelar"
            }
        });
    });
});
