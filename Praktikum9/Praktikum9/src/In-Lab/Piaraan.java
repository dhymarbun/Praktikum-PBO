import java.util.ArrayList;

public class Piaraan{
    private ArrayList<Anabul> Lanabul;
    private Integer nbelm;

    public Piaraan(){
        this.Lanabul = new ArrayList<>();
        this.nbelm = 0;
    }

    public Integer getNbelm(){
        return nbelm;
    }

    public void enqueueAnabul (Anabul e){
        Lanabul.add(e);
        nbelm++;
    }

    public boolean isEmpty(){
        return Lanabul.isEmpty();
    }

    public boolean isMember(Anabul a){
        return Lanabul.contains(a);
    }

    public Anabul getAnabul(){
        if (isEmpty()) { 
            throw new IllegalStateException("Antrian kosong"); 
        } 
        return Lanabul.get(0);
    }

    public void showAnabul(){
        for (Anabul e : Lanabul){
            System.out.println("Antrian Anabul: " + e.getNama());
        }
    }

    public Anabul dequeueAnabul() { 
        if (isEmpty()) { 
            throw new IllegalStateException("Antrian kosong"); 
        } 
        nbelm--;
        return Lanabul.remove(0); 
    }

    public int countKucing(){
        int count = 0;
        for (Anabul e : Lanabul){
            if (e instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    public double bobotKucing(){
        double total = 0;
        for (Anabul e : Lanabul){
            if (e instanceof Kucing){
                total += ((Kucing) e).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul(){
        for (Anabul e : Lanabul){
            System.out.println(e.getNama() + " - " + e.getClass().getName());
        }
    }
}