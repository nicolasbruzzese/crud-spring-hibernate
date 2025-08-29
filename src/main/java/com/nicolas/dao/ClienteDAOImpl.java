package com.nicolas.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nicolas.entidades.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // Método auxiliar para obtener la sesión actual
    private Session obtenerSesion() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional
    public List<Cliente> obtenerClientes() {
        // Devolver todos los clientes
        Query<Cliente> query = obtenerSesion().createQuery("from Cliente", Cliente.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void insertarCliente(Cliente cliente) {
        // Insertar nuevo cliente
        obtenerSesion().save(cliente);
    }

    @Override
    @Transactional
    public Cliente obtenerCliente(int id) {
        // Obtener cliente por id
        return obtenerSesion().get(Cliente.class, id);
    }

    @Override
    @Transactional
    public void actualizarCliente(Cliente cliente) {
        // Actualizar cliente existente
        obtenerSesion().update(cliente);
    }

    @Override
    @Transactional
    public void eliminarCliente(int id) {
        // Eliminar cliente por id
        Query<?> query = obtenerSesion().createQuery("delete from Cliente where id = :clienteId");
        query.setParameter("clienteId", id);
        query.executeUpdate();
    }
}
