package com.salsabil.microservices.order.stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class InventoryClientStub {

    public static void stubInventoryCall(String skuCode, Integer quantity) {
        stubFor(get(urlEqualTo("/api/inventory?skuCode=" + skuCode + "&quantity=" + quantity))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Conten-Type", "application/json")
                .withBody("true")));
    }

}