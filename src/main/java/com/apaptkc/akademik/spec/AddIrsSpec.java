package com.apaptkc.akademik.spec;

import com.apaptkc.akademik.model.MahasiswaEntity;

import java.sql.Timestamp;

public class AddIrsSpec {
    private MahasiswaEntity mahasiswaByIdUserMhs;
    private String kodeMK;
    private int idKelas;

    public AddIrsSpec(MahasiswaEntity mahasiswaByIdUserMhs, String kodeMK, int idKelas) {
        this.mahasiswaByIdUserMhs = mahasiswaByIdUserMhs;
        this.kodeMK = kodeMK;
        this.idKelas = idKelas;
    }

    public MahasiswaEntity getMahasiswaByIdUserMhs() {
        return mahasiswaByIdUserMhs;
    }

    public void setMahasiswaByIdUserMhs(MahasiswaEntity mahasiswaByIdUserMhs) {
        this.mahasiswaByIdUserMhs = mahasiswaByIdUserMhs;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }
}
