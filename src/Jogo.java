import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Jogo {
  private String nomeTimeA;
  private String nomeTimeB;
  private LocalDateTime data;
  private double valorVitóriaA;
  private double valorVitóriaB;
  private double valorEmpate;
  private int apostasA;
  private int apostasB;
  private double totalApostado;

  public Jogo(  String nomeTimeA, String nomeTimeB, LocalDateTime data, double valorVitóriaA, double valorVitóriaB,
      double valorEmpate, int apostasA, int apostasB, double totalApostado) {
    this.nomeTimeA = nomeTimeA;
    this.nomeTimeB = nomeTimeB;
    this.data = data;
    this.valorVitóriaA = valorVitóriaA;
    this.valorVitóriaB = valorVitóriaB;
    this.valorEmpate = valorEmpate;
    this.apostasA = apostasA;
    this.apostasB = apostasB;
    this.totalApostado = totalApostado;
  }

  public String getNomeTimeA() {
    return nomeTimeA;
  }

  public void setNomeTimeA(String nomeTimeA) {
    this.nomeTimeA = nomeTimeA;
  }

  public String getNomeTimeB() {
    return nomeTimeB;
  }

  public void setNomeTimeB(String nomeTimeB) {
    this.nomeTimeB = nomeTimeB;
  }

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public double getValorVitóriaA() {
    return valorVitóriaA;
  }

  public void setValorVitóriaA(double valorVitóriaA) {
    this.valorVitóriaA = valorVitóriaA;
  }

  public double getValorVitóriaB() {
    return valorVitóriaB;
  }

  public void setValorVitóriaB(double valorVitóriaB) {
    this.valorVitóriaB = valorVitóriaB;
  }

  public double getValorEmpate() {
    return valorEmpate;
  }

  public void setValorEmpate(double valorEmpate) {
    this.valorEmpate = valorEmpate;
  }

  public int getApostasA() {
    return apostasA;
  }

  public void setApostasA(int apostasA) {
    this.apostasA = apostasA;
  }

  public int getApostasB() {
    return apostasB;
  }

  public void setApostasB(int apostasB) {
    this.apostasB = apostasB;
  }

  public double getTotalApostado() {
    return totalApostado;
  }

  public void setTotalApostado(double totalApostado) {
    this.totalApostado = totalApostado;
  }

}