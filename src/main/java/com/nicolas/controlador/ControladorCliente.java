package com.nicolas.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nicolas.dao.ClienteDAO;
import com.nicolas.entidades.Cliente;

@Controller
public class ControladorCliente {

    @Autowired
    private ClienteDAO clienteDAO;
    
    // Configura el DataBinder para limpiar automáticamente Strings de formularios
    @InitBinder
    public void configurarLimpiezaStringsFormulario(WebDataBinder dataBinder) {

        // Editor que elimina espacios al inicio y final; convierte a null si la cadena queda vacía
        StringTrimmerEditor editorRecorteYNull = new StringTrimmerEditor(true);

        // Aplica este editor a todos los campos de tipo String
        dataBinder.registerCustomEditor(String.class, editorRecorteYNull);
    }

    // Mostrar la lista de todos los clientes
    @GetMapping("/cliente/listarClientes")
    public String mostrarListaClientes(Model modelo) {
        List<Cliente> clientes = clienteDAO.obtenerClientes();
        modelo.addAttribute("clientes", clientes);
        return "listarClientes";
    }

    // Mostrar el formulario para crear un nuevo cliente
    @GetMapping("/cliente/nuevoCliente")
    public String mostrarFormularioNuevoCliente(Model modelo) {
        modelo.addAttribute("cliente", new Cliente());
        return "nuevoCliente";
    }

    // Procesar el envío del formulario para insertar un nuevo cliente
    @PostMapping("/cliente/insertarCliente")
    public String procesarNuevoCliente(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult validacion) {
        if (validacion.hasErrors()) {
            return "nuevoCliente"; // volver al formulario si hay errores
        } else {
            clienteDAO.insertarCliente(cliente);
            return "redirect:/cliente/listarClientes";
        }
    }

    // Mostrar el formulario para editar un cliente existente
    @GetMapping("/cliente/editarCliente")
    public String mostrarFormularioEditarCliente(@RequestParam("clienteId") int id, Model modelo) {
        Cliente cliente = clienteDAO.obtenerCliente(id);
        modelo.addAttribute("cliente", cliente);
        return "editarCliente";
    }

    // Procesar el envío del formulario para actualizar un cliente
    @PostMapping("/cliente/actualizarCliente")
    public String procesarActualizarCliente(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult validacion) {
        if (validacion.hasErrors()) {
            return "editarCliente"; // volver al formulario si hay errores
        } else {
            clienteDAO.actualizarCliente(cliente);
            return "redirect:/cliente/listarClientes";
        }
    }

    // Eliminar un cliente por su id
    @GetMapping("/cliente/eliminarCliente")
    public String eliminarClientePorId(@RequestParam("clienteId") int id) {
        clienteDAO.eliminarCliente(id);
        return "redirect:/cliente/listarClientes";
    }
}