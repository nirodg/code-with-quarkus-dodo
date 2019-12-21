package org.acme;

import ro.brage.dodo.http.rs.DtoModel;

/**
 *
 * @author dorin
 */
public class DummyDto extends DtoModel {

    public DummyDto() {
    }

    public DummyDto(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
