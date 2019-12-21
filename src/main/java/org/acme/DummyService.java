/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme;

import javax.enterprise.context.ApplicationScoped;
import ro.brage.dodo.jpa.EntityService;

/**
 *
 * @author dorin
 */
@ApplicationScoped
public class DummyService extends EntityService<DummyModel> {

    @Override
    public String entity() {
        return DummyModel.class.getSimpleName();
    }

}
