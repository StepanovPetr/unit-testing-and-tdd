package com.acme.banking.dbo.Factories;

import com.acme.banking.dbo.domain.Client;
import java.util.UUID;

public class ClientBuilder {

    public static final UUID ID_STUB = UUID.fromString("8fe9595d-de6e-4d07-bc56-dacdad16f5c2");

    private UUID _id = ID_STUB;
    private String _name = "dummy";

    public static ClientBuilder Create()
    {
        return new ClientBuilder();
    }

    public ClientBuilder SetId(UUID id) {
        _id = id;
        return this;
    }

    public ClientBuilder SetName(String name) {
        _name = name;
        return this;
    }

    public Client Build() {
        return new Client(_id, _name);
    }
}
