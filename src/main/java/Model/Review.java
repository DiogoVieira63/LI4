package Model;

import java.sql.Date;
import java.time.LocalDate;

public class Review {
    private String user;
    private String centro;
    private double preservacao;
    private double experiencia;
    private double facilidadeAcesso;
    private double estetica;
    private Date dia;


    public Review(String user, String centro, double preservacao, double experiencia, double facilidadeAcesso, double estetica, Date dia) {
        this.user = user;
        this.centro = centro;
        this.preservacao = preservacao;
        this.experiencia = experiencia;
        this.facilidadeAcesso = facilidadeAcesso;
        this.estetica = estetica;
        this.dia = dia;
    }
}