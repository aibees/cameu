package com.cameu.server.common.utils;

import com.cameu.server.common.vo.ResponseVo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UtilService {

    public ResponseEntity<ResponseVo> sendReturn(Object result) {
        return sendReturn(result, null);
    }

    public ResponseEntity<ResponseVo> sendReturn(Object result, HttpHeaders header) {
        if(!(header == null))
            header.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(
                new ResponseVo.Builder()
                        .status(HttpStatus.OK)
                        .result(result)
                        .build(),
                header,
                HttpStatus.OK
        );
    }
}
