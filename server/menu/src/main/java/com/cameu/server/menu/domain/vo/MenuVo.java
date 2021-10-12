package com.cameu.server.menu.domain.vo;

import lombok.Data;

import java.util.List;

@Data
public class MenuVo {
    public String category;
    public String id;
    public String name;
    public String price;
    public String description;
    public List<String> files;

    public void DtoToVo(MenuDto dto) {
        this.category = dto.category;
        this.id = dto.id;
    }
}
