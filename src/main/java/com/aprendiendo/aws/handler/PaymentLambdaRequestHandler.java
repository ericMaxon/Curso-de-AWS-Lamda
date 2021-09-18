package com.aprendiendo.aws.handler;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aprendiendo.aws.exceptions.LambdaExceptions;
import com.aprendiendo.aws.models.request.BodyRequest;
import com.aprendiendo.aws.models.response.BodyResponse;
import com.aprendiendo.aws.Request;
import com.aprendiendo.aws.Status;
import com.fasterxml.jackson.jr.ob.JSON;


public class PaymentLambdaRequestHandler implements RequestHandler<Request<BodyRequest>, BodyResponse> {

    public BodyResponse handleRequest(Request<BodyRequest> request, Context context) {
        Database db = new Database();
        String errorMsg = "";
        var body = request.getBody();

        var shoeId = body.getShoeId();
        var shoeFound = db.getShoeById(shoeId);
        if (shoeFound != null) {
            System.out.println("Zapatilla encontrada" + shoeFound.toString());
            return new BodyResponse(body.getUuid(), new Status(200, "Transaccion Completada"));
        }

        BodyResponse br = new BodyResponse(body.getUuid(), new Status(400, "Transaccion no se pudo completar"));
        try{
            errorMsg = JSON.std.asString(br);
        }catch (IOException io){
            io.printStackTrace();
        }
        throw new LambdaExceptions(errorMsg);
    }
}