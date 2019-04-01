package com.humberto.coco.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Daniel Humberto Ramírez Juárez
 * Date: 22/03/19 12:55
 */
@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario,Integer> {
}
