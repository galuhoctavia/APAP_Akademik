package com.apaptkc.akademik.dao;

import com.apaptkc.akademik.spec.APISekretariatSpec;


import com.apaptkc.akademik.spec.SekretariatSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SekretariatDAOImpl implements SekretariatDAO{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<SekretariatSpec> getAllKelasByKurikulumAndTerm(String kode_kurikulum, String kode_term){
        APISekretariatSpec apiResult = restTemplate.getForObject("http://www.mocky.io/v2/5a3102692e00004e13e3b296", APISekretariatSpec.class);
        List<SekretariatSpec> allKelasByKurikulumAndTerm = apiResult.getResult();

        return allKelasByKurikulumAndTerm;
    };


}


