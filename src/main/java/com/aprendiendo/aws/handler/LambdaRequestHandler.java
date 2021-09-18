package com.aprendiendo.aws.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aprendiendo.aws.handler.dto.Shoe;

import java.util.List;

public class LambdaRequestHandler implements RequestHandler<Object, List<Shoe>> {
    public List<Shoe> handleRequest(Object input, Context context) {
        Database db = new Database();

        return db.getShoes();
    }
}