/*
 * @author szh
 */
package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Xydshujulog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface XydshujulogDao extends JpaRepository<Xydshujulog,String> {
    
}
