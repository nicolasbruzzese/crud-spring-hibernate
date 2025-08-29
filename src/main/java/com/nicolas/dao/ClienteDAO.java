package com.nicolas.dao;

import java.util.List;

import com.nicolas.entidades.Cliente;

// Interfaz con operaciones CRUD para la entidad Cliente
public interface ClienteDAO {

    // Devuelve todos los clientes registrados
    List<Cliente> obtenerClientes();

    // Inserta un nuevo cliente en la base de datos
    void insertarCliente(Cliente cliente);

    // Obtiene un cliente por su id
    Cliente obtenerCliente(int id);

    // Actualiza los datos de un cliente existente
    void actualizarCliente(Cliente cliente);

    // Elimina un cliente según su id
    void eliminarCliente(int id);
}
