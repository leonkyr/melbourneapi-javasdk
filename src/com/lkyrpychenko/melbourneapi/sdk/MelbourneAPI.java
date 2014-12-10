package com.lkyrpychenko.melbourneapi.sdk;

public class MelbourneAPI implements IMelbourneAPI {

    private MelbourneAPI()
    {}

    public static IMelbourneAPI getInstance()
    {
        return new MelbourneAPI();
    }

    @Override
    public payResponse pay(payRequest request) {
        return new payResponse();
    }
}
