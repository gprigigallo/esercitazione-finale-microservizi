package com.nttdata.dipartimentoapi.controller;

import com.nttdata.dipartimento.server.models.ModelEsame;
import com.nttdata.dipartimento.server.models.ResponseBase;
import com.nttdata.dipartimento.server.models.ResponseEsami;

import com.nttdata.swagger.dipartimento.server.api.EsamiCrudApi;

import org.springframework.http.ResponseEntity;


public class DipartimentoController implements EsamiCrudApi {
    @Override
    public ResponseEntity<ResponseBase> addEsame(ModelEsame body) {
        return EsamiCrudApi.super.addEsame(body);
    }

    @Override
    public ResponseEntity<ResponseBase> aggiornaEsame(ModelEsame body) {
        return EsamiCrudApi.super.aggiornaEsame(body);
    }

    @Override
    public ResponseEntity<ResponseBase> eliminaEsame(Integer id) {
        return EsamiCrudApi.super.eliminaEsame(id);
    }

    @Override
    public ResponseEntity<ResponseEsami> getEsami() {

        return EsamiCrudApi.super.getEsami();
    }
}
