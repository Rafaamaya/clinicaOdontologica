package com.example.clinica.dao;

import java.util.List;

public interface IDao<T> {


    public T guardar(T t);
    public T buscar(int id);
    public void eliminar(int id);
    public List<T> buscarTodos();
    public T actualizar(T t);
}
