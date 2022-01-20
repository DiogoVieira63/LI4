package src;

public class Review {
    private double preser, exp, fa, est;

    public double media(){
        return (this.preser + this.exp + this.fa + this.est)/4;
    }

}