package com.apaptkc.akademik.dao;

import com.apaptkc.akademik.spec.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class KurikulumDAOImpl implements KurikulumDAO{
    String url = "localhost:8080/api";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public KurikulumSpec getKurikulum(String kode_kurikulum) {
        APIKurikulumSpec apiResult = restTemplate.getForObject("http://www.mocky.io/v2/5a314fbc2e0000271fe3b476", APIKurikulumSpec.class);
        KurikulumSpec kurikulum = apiResult.getResult();
        return kurikulum;
    }

    @Override
    public SyaratLulusSpec getSyaratLulus(String kode_kurikulum){
        APISyaratLulusSpec apiResult = restTemplate.getForObject("http://www.mocky.io/v2/5a316be02e00009531e3b4e4", APISyaratLulusSpec.class);
        SyaratLulusSpec syaratLulus = apiResult.getResult();
        return syaratLulus;
    }

    @Override
    public List<KurikulumSpec> getAllKurikulum() {
        AllKurikulumSpec apiResult = restTemplate.getForObject("http://www.mocky.io/v2/5a32248b310000e40138b835", AllKurikulumSpec.class);
        List<KurikulumSpec> allKurikulum = apiResult.getResult();
        return allKurikulum;
    }
//    @Override
//    public MataKuliahSpec getMataKulliah(String kode_kurikulum, String kode_matkul) {
//
//        APIM apiResult = restTemplate.getForObject("http://www.mocky.io/v2/5a3013382d00000f2fa83d46", APIKurikulumSpec.class);
//        return null;
//    }
}
