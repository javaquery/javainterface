/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.database;

import java.util.Date;

/**
 * Denotes that database entity is modifiable.
 *
 * @author javaQuery
 * @date 12th January, 2017
 * @Github: https://github.com/javaquery/javainterface
 */
public interface ModifiableEntity {

    public Date getModified();
    public void setModified(Date date);
}
