package org.acme;

import javax.ws.rs.Path;
import ro.brage.dodo.http.rs.RestApiService;

@Path("/dummy")
public class DummyRestEndpoint extends RestApiService<DummyModel, DummyDto, DummyService, DummyMapper> {

}
