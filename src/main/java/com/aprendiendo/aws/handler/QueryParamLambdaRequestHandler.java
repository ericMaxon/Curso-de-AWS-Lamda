package com.aprendiendo.aws.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aprendiendo.aws.Request;
import com.aprendiendo.aws.handler.dto.Shoe;

public class QueryParamLambdaRequestHandler implements RequestHandler<Request<?>, Shoe> {

    public Shoe handleRequest(Request<?> request, Context context) {
        Database db = new Database();

        var shoeId = Integer.parseInt(request.getPath().get("shoeId"));
        var shoeFound = db.getShoeById(shoeId);

        System.out.println("Zapatilla encontrada" + shoeFound.toString());
        return shoeFound;
    }
}
