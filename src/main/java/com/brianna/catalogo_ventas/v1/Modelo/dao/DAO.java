package com.brianna.catalogo_ventas.v1.Modelo.dao;

import java.util.List;

public interface DAO<T> {
    
    T selectByID(Long id);
    
    List<T> selectByAnyAtributte(String atributte);
    
    List<T> selectALL();
    
    void insert(T t);
    
    void updateByID(Long id);
        
    void deleteByID(Long id);
    
}
