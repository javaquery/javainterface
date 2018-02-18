/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.database;

/**
 * Denotes this is database entity.
 *
 * @author javaQuery
 * @since 2018-02-18
 * @Github: https://github.com/javaquery/javainterface
 */
public interface DatabaseEntity {
    public Long getId();
    public void setId(Long id);
    
    /* if you are using {@link java.util.UUID} */
//    public UUID getId();
//    public void setId(UUID id);
}
