package com.company.wuwu.malltiny.service;

import com.company.wuwu.malltiny.mbg.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {
    int createBrand(PmsBrand pmsBrand);

    int updateBrand(Long id, PmsBrand pmsBrand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(Integer pageNum, Integer pageSize);

    PmsBrand getBrand(Long id);

    List<PmsBrand> listAllBrand();


}
