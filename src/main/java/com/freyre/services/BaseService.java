package com.freyre.services;

import java.util.List;

public interface BaseService<E> {
    public List<E> findAll()throws Exception; //trae lista de todas las personas o entidades
    public  E findById(Long id) throws Exception;//traer una persona o una  entidad
    public  E save(E entity) throws Exception;//crear una nueva entidad
    public E update(Long id, E entity) throws Exception;//actualizar
    public boolean delete(Long id) throws Exception;//eliminar un registro de la db
}
