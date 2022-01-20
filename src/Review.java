package src;

public class Review {
    private double preser;
    private double exp;
    private double fa;
    private double est;


    public Review(double preser, double exp, double fa, double est){
        this.preser = preser;
        this.exp = exp;
        this.fa = fa;
        this.est = est;
    }

    public double media(){
        return (this.preser + this.exp + this.fa + this.est)/4;
    }

}