package com.cameu.server.menu.controller;

import com.cameu.server.common.vo.ResponseVo;
import com.cameu.server.menu.domain.vo.MenuDto;
import com.cameu.server.menu.service.MenuService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
@AllArgsConstructor
public class MenuController {

    private MenuService menuService;
    private final Logger logger = LoggerFactory.getLogger(MenuController.class);

    @GetMapping("/{category}")
    public ResponseEntity<ResponseVo> showMenuAll(
            @PathVariable("category") String category) {

        return null;
    }

    @GetMapping("/{category}/{id}")
    public ResponseEntity<ResponseVo> showItemDetail(MenuDto dto) {
        logger.info(dto.toString());
        return menuService.searchData(dto);
    }

    @GetMapping(value="/{category}/{id}/image",
                produces= MediaType.IMAGE_JPEG_VALUE)
    public byte[] showItemImage(MenuDto dto) throws Exception {
        return menuService.searchImage(dto);
    }
}
