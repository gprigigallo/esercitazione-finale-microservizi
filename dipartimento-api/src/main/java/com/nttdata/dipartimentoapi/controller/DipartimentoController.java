package com.nttdata.dipartimentoapi.controller;

import com.nttdata.dipartimento.server.models.ModelEsame;
import com.nttdata.dipartimento.server.models.ModelEsamiAll;
import com.nttdata.dipartimento.server.models.ResponseBase;
import com.nttdata.dipartimento.server.models.ResponseEsami;

import com.nttdata.dipartimentoapi.costanti.Costanti;
import com.nttdata.swagger.dipartimento.server.api.EsamiCrudApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class DipartimentoController implements EsamiCrudApi {
    @Override
    public ResponseEntity<ResponseBase> addEsame(ModelEsame body) {
        ResponseBase base = new ResponseBase();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Costanti.ESAMI_FILE_PATH))) {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(body.getId());
            stringBuilder.append(",");
            stringBuilder.append(body.getNome());
            stringBuilder.append(",");
            stringBuilder.append(body.getCfu());
            bw.write(stringBuilder.toString());
            bw.newLine();

        } catch (IOException e) {
            base.setErrors(e.getMessage());
            base.setSuccess(Boolean.FALSE);
            return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        base.setSuccess(true);
        base.setResultCode(200);
        return new ResponseEntity<>(base, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseBase> aggiornaEsame(ModelEsame body) {
        ResponseBase base = new ResponseBase();
        StringBuilder stringBuilder = new StringBuilder();
        Boolean controllo = false;
        try {
            List<String> esami = Files.readAllLines(Paths.get(Costanti.ESAMI_FILE_PATH));

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(Costanti.ESAMI_FILE_PATH))) {

                for (String esame : esami) {
                    if (!esame.startsWith(String.valueOf(body.getId()))) {
                        bw.write(esame);
                        bw.newLine();
                    } else {
                        controllo=true;
                        eliminaEsame(body.getId());
                        stringBuilder.append(body.getId());
                        stringBuilder.append(",");
                        stringBuilder.append(body.getNome());
                        stringBuilder.append(",");
                        stringBuilder.append(body.getCfu());
                        bw.write(stringBuilder.toString());
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            if (controllo){
                base.setErrors("Esame non trovato!");
                base.setSuccess(Boolean.FALSE);
                return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
            }else {
                base.setErrors(e.getMessage());
                base.setSuccess(Boolean.FALSE);
                return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
        return new ResponseEntity<>(base, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseBase> eliminaEsame(Integer id) {
        ResponseBase base = new ResponseBase();
        try {
            List<String> esami = Files.readAllLines(Paths.get(Costanti.ESAMI_FILE_PATH));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(Costanti.ESAMI_FILE_PATH))) {
                for (String esame : esami) {
                    if (!esame.startsWith(String.valueOf(id) + ",")) {
                        bw.write(esame);
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            base.setErrors(e.getMessage());
            base.setSuccess(Boolean.FALSE);
            return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(base, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseEsami> getEsami() {
        ResponseEsami base = new ResponseEsami();
        ModelEsamiAll esamiAll = new ModelEsamiAll();
        try (BufferedReader br = new BufferedReader(new FileReader(Costanti.ESAMI_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {

            }
        } catch (IOException e) {
            base.setErrors(e.getMessage());
            base.setSuccess(Boolean.FALSE);
            return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        base.setResultCode(200);
        base.returnValue(esamiAll);
        return new ResponseEntity<>(base, HttpStatus.OK);
    }
}
