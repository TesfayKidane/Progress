package com.ceshop.daoimpl;

import java.util.List;

import com.ceshop.dao.*;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
    @Override
    public void save( T entity ){
     }

	@Override
	public void delete(Long id) {
    }

	@Override
	public T findOne( Long id ){
	    return null;
	}
	@Override
	public List<T> findAll(){
		      return null;
		   }
	
	@Override
	public T update( T entity ){
	      return null;
	   }

 	@Override
	public List<T> findAll(String s,Object  hint ){
 	    return null;
  	}
}
