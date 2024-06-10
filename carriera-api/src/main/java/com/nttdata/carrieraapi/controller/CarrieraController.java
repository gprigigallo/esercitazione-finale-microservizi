package com.nttdata.carrieraapi.controller;


import com.nttdata.carriera.server.models.Carriera;
import com.nttdata.carriera.server.models.Esame;
import com.nttdata.swagger.carriera.server.api.DefaultApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrieraController implements DefaultApi {
    @Override
    public ResponseEntity<Void> sostenimentoEsamePost(Esame body) {
        return DefaultApi.super.sostenimentoEsamePost(body);
        

    }

    @Override
    public ResponseEntity<Carriera> carrieraGet() {
        return DefaultApi.super.carrieraGet();

        ResponseCarriera base = new ResponseCarriera();

        ModelCarriera carriera = new ModelCarriera();
        try (BufferedReader br = new BufferedReader(new FileReader(Costanti.CARRIERA_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                ModelPiatto piatto = new ModelPiatto();
                piatto.setNome(line.split(",")[0]);
                piatto.setCosto(Double.valueOf(line.split(",")[1]));
                carriera.addListaPiattiItem(piatto);
            }
        } catch (IOException e) {
            base.setErrors(e.getMessage());
            base.setSuccess(Boolean.FALSE);
            return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        base.setResultCode(200);
        base.setReturnValue(carriera);
        return new ResponseEntity<>(base, HttpStatus.OK);
    }

    }
}