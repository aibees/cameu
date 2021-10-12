package com.cameu.server.menu.service;

import com.cameu.server.common.utils.UtilService;
import com.cameu.server.common.vo.ResponseVo;
import com.cameu.server.menu.domain.vo.MenuDto;
import com.cameu.server.menu.domain.vo.MenuVo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
@AllArgsConstructor
public class MenuService {

    private UtilService utilService;
    private final Logger logger = LoggerFactory.getLogger(MenuService.class);

    public ResponseEntity<ResponseVo> searchData(MenuDto menuDto) {

        MenuVo menuVo = new MenuVo();
        menuVo.DtoToVo(menuDto);
        return utilService.sendReturn(menuVo);
    }

    public byte[] searchImage(MenuDto dto) throws IOException {

        InputStream in = getClass().getResourceAsStream("/cameu.jpg");
        return IOUtils.toByteArray(in);
    }
}
