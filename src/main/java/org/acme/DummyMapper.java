/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme;

import org.mapstruct.Mapper;
import ro.brage.dodo.http.rs.mappers.AdvancedMapper;

/**
 *
 * @author dorin
 */
@Mapper(componentModel = "cdi")
public abstract class DummyMapper implements AdvancedMapper<DummyModel, DummyDto> {

}
