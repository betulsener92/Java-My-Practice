package practice2;

import java.util.HashSet;

public class Methodlar {
    HashSet<Double> hash = new HashSet<>();

    public HashSet<Double> setOlustur(){
        hash.add(3.23);
        hash.add(3.10);
        hash.add(5.12);
        hash.add(10.12);
        hash.add(23.12);
        return hash;
    }
    public double toplaminiAl(HashSet<Double> hashSet){
        double sum = 0;
        for (Double w:hash){
            sum = sum + w;
        }
        return sum;
    }
}
