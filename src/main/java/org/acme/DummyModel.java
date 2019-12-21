/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme;

import ro.brage.dodo.jpa.Model;

/**
 *
 * @author dorin
 */
public class DummyModel extends Model {

    public DummyModel() {
    }

    private String name;

    public String getName() {
        return name;
    }
}
