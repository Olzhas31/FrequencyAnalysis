import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Derekter {

    String shifrMatin;

    int qatarSaniBasty = 4;
    int baganSaniBasty = 20;

    int qatarSaniJumys = 36;
    int baganSaniJumys = 30;

    Object[] arrBaganAtyJumys = new String[baganSaniJumys];
    Object[] arrBaganAtyBasty = new String[baganSaniBasty];

    Object[][] arrSimvoldar = new String[qatarSaniBasty][baganSaniBasty];
    Object[][] arrBigrammalar = new String[qatarSaniBasty][baganSaniBasty];
    Object[][] arrTrigrammalar = new String[qatarSaniBasty][baganSaniBasty];
    Object[][] arrJumys = new String[qatarSaniJumys][baganSaniJumys];

    public Derekter(String str){
        this.shifrMatin = str;
        initTable();
        simvoldardiOrnalstiru();
        bigrammalardiOrnalastiru();
        trigrammalardiOrnalastiru();
        matindiOrnalastiru();
    }

    private void initTable() {
        for (int i = 0; i < qatarSaniBasty; i++) {
            for (int j = 0; j < baganSaniBasty; j++) {
                arrSimvoldar[i][j] = "";
                arrBigrammalar[i][j]= "";
                arrTrigrammalar[i][j]= "";
                arrBaganAtyBasty[j] = "" + (j+1);
            }
        }

        for (int i = 0; i < qatarSaniJumys; i++) {
            for (int j = 0; j < baganSaniJumys; j++) {
                arrJumys[i][j] = " ";
                arrBaganAtyJumys[j] = " " + (j+1);
            }
        }
    }

    private void simvoldardiOrnalstiru() {
        SimvolSanau obj = new SimvolSanau(shifrMatin);
        Iterator<SimvolSanau.Simvoldar> itr = obj.simvoldar.iterator();
        for (int i = 0; i < qatarSaniBasty; i=i+2) {
            for (int j = 0; j < baganSaniBasty; j++) {
                if (itr.hasNext()){
                    SimvolSanau.Simvoldar si = itr.next();
                    arrSimvoldar[i][j] = si.getAty();
                    arrSimvoldar[i+1][j] = String.valueOf(si.getSany());
                }
            }
        }
    }

    static class SimvolSanau{
        private Comparator<Simvoldar> comparator = new PersonAgComparator().thenComparing(new PersonNmComparator());
        private TreeSet<Simvoldar> simvoldar = new TreeSet(comparator);
        private String shifrMatin;

        SimvolSanau(String str){
            this.shifrMatin = str;
            simvolAly();
        }

        private void simvolAly() {
            for (int i = 0; i < shifrMatin.length(); i++){
                simvoldar.add(new SimvolSanau.Simvoldar(String.valueOf(shifrMatin.charAt(i)),sanau(shifrMatin.charAt(i))));
            }
            /*for(MyData p : people){
                System.out.println(p.getName() + " " + p.getAge());
            }*/
        }

        private int sanau(char ch) {
            int sum=0;
            for (int i = 0; i < shifrMatin.length(); i++){
                if (shifrMatin.charAt(i)==ch)
                    sum++;
            }
            return sum;
        }

        // өшіруге болмайтын класс
        static class PersonNmComparator implements Comparator<Simvoldar> {
            public int compare(Simvoldar a, Simvoldar b){
                return a.getAty().compareTo(b.getAty());
            }
        }

        // өшіруге болмайтын класс
        static class PersonAgComparator implements Comparator<Simvoldar> {
            public int compare(Simvoldar a, Simvoldar b){
                if(a.getSany()< b.getSany())
                    return 1;
                else if(a.getSany()> b.getSany())
                    return -1;
                else
                    return 0;
            }
        }

        class Simvoldar {
            private String aty;
            private int sany;
            public Simvoldar(String aty, int sany){
                this.aty=aty;
                this.sany=sany;
            }
            String getAty(){return aty;}
            int getSany(){return sany;}
        }

    }

    private void bigrammalardiOrnalastiru(){
        BigrammaSanau obj = new BigrammaSanau(shifrMatin);
        Iterator<BigrammaSanau.Bigrammalar> itr = obj.bigrammalar.iterator();

        for (int i = 0; i < qatarSaniBasty; i=i+2) {
            for (int j = 0; j < baganSaniBasty; j++) {
                if (itr.hasNext()){
                    BigrammaSanau.Bigrammalar bi = itr.next();
                    arrBigrammalar[i][j] = bi.getAty();
                    arrBigrammalar[i+1][j] = String.valueOf(bi.getSany());
                }
            }
        }
    }

    static class BigrammaSanau{
        private Comparator<Bigrammalar> comparator = new BigrammaSanyComparator().thenComparing(new BigrammaAtyComparator());
        private TreeSet<Bigrammalar> bigrammalar = new TreeSet(comparator);
        private String shifrMatin;

        public BigrammaSanau(String str){
            shifrMatin = str;
            bigrammaAly();
        }

        private void bigrammaAly() {
            for (int i = 0; i < shifrMatin.length()-1; i++) {
                String bi = String.valueOf(shifrMatin.charAt(i)) + shifrMatin.charAt(i + 1);
                //System.out.println(bi);
                bigrammalar.add(new Bigrammalar(bi, sanay(bi)));
            }
        }

        private int sanay(String str) {
            int sum = 0;
            for (int i = 0; i < shifrMatin.length()-1; i++){
                if (str.equalsIgnoreCase(String.valueOf(shifrMatin.charAt(i))+shifrMatin.charAt(i+1)))
                    sum++;
            }
            return sum;
        }

        // өшіруге болмайтын класс
        class BigrammaSanyComparator implements Comparator<Bigrammalar> {
            public int compare(Bigrammalar a, Bigrammalar b){
                if(a.getSany()< b.getSany())
                    return 1;
                else if(a.getSany()> b.getSany())
                    return -1;
                else
                    return 0;
            }
        }

        // өшіруге болмайтын класс
        class BigrammaAtyComparator implements Comparator<Bigrammalar> {
            public int compare(Bigrammalar a, Bigrammalar b){
                return a.getAty().compareTo(b.getAty());
            }
        }

        class Bigrammalar{
            private String aty;
            private int sany;

            public Bigrammalar(String a, int s){
                this.aty = a;
                this.sany = s;
            }
            String getAty(){return aty;}
            int getSany(){return sany;}
        }
    }

    private void trigrammalardiOrnalastiru(){
        TrigrammaSanau obj = new TrigrammaSanau(shifrMatin);
        Iterator<TrigrammaSanau.Trigrammalar> itr = obj.trigrammalar.iterator();
        for(TrigrammaSanau.Trigrammalar x : obj.trigrammalar){
            //System.out.println(x.getAty() + " " + x.getSany());
        }
        for (int i = 0; i < qatarSaniBasty; i=i+2) {
            for (int j = 0; j < baganSaniBasty; j++) {
                if (itr.hasNext()){
                    TrigrammaSanau.Trigrammalar tri = itr.next();
                    arrTrigrammalar[i][j] = tri.getAty();
                    arrTrigrammalar[i+1][j] = String.valueOf(tri.getSany());
                }
            }
        }
    }

    static class TrigrammaSanau{
        private Comparator<Trigrammalar> comparator = new TrigrammaSanyComparator().thenComparing(new TrigrammaAtyComparator());
        private TreeSet<Trigrammalar> trigrammalar = new TreeSet(comparator);
        private String shifrMatin;

        public TrigrammaSanau(String str){
            this.shifrMatin = str;
            trigrammaAly();
        }

        private void trigrammaAly() {
            for (int i = 0; i < shifrMatin.length()-2; i++) {
                String tri = String.valueOf(shifrMatin.charAt(i)) + shifrMatin.charAt(i + 1)+shifrMatin.charAt(i + 2);
                //System.out.println(bi);
                trigrammalar.add(new Trigrammalar(tri, sanay(tri)));
            }
        }

        private int sanay(String str) {
            int sum = 0;
            for (int i = 0; i < shifrMatin.length()-2; i++){
                if (str.equalsIgnoreCase(String.valueOf(shifrMatin.charAt(i))+shifrMatin.charAt(i+1)+shifrMatin.charAt(i+2)))
                    sum++;
            }
            return sum;
        }

        // өшіруге болмайтын класс
        class TrigrammaSanyComparator implements Comparator<Trigrammalar> {
            public int compare(Trigrammalar a, Trigrammalar b){
                if(a.getSany()< b.getSany())
                    return 1;
                else if(a.getSany()> b.getSany())
                    return -1;
                else
                    return 0;
            }
        }

        // өшіруге болмайтын класс
        class TrigrammaAtyComparator implements Comparator<Trigrammalar> {
            public int compare(Trigrammalar a, Trigrammalar b){
                return a.getAty().compareTo(b.getAty());
            }
        }

        class Trigrammalar{
            private String aty;
            private int sany;

            public Trigrammalar(String a, int s){
                this.aty = a;
                this.sany = s;
            }
            String getAty(){return aty;}
            int getSany(){return sany;}
        }
    }

    private void matindiOrnalastiru() {
        for(int i = 0, j = 0, x = 0; x < shifrMatin.length(); x++, j++){
            if(j== baganSaniJumys){
                j = 0;
                i+=2;
            }
            arrJumys[i][j] = String.valueOf(shifrMatin.charAt(x));
        }
    }

}

// НЮЛЮШХЦЮСВАХЧЕЮФХЦТАФЮХУАОАИЗССАЗТЖЗСЦФЗЗТФЮЛМММСЮХЗВАЕСЯЪСМ.ЕЗСЬУАХТАЗ.УОАЙЮЕМТШАЕЯЙЗЗТЕЗХЯЦНЧНФЧУСЗ.ЪМШХЦФЮСПМФЮГАХАДЗССАХЦЬБЭЦА.ХЦФЮСЫЯТОЯЗЦХЯЦАЩЦААСЮФЮХУАОАИЗСЮТЩЗЦЫФШНОМПЮЦМЩЗХНМШЛАСЮШГУАЭЦАПЧЛЕЗХЬУФЗНФЮХСАХАЩЗЦЮБЦХЯЛЗОЗСЫЗОЧВЮМЛСА.СЫЗУЧХЦЫСМЛЮХСЗИЗССЫЗВАФСЫЗТЗФЪМСЫМСЗУФАШАЕМПЫЗОЗХЮГЭЦАУАЛТАОЯЗЦНЮИЕАПЧЦЧФМХЦЧХЕЗОЮЦЬЕОЯХЗДЯАЦЕЫШТНЮЛЮШХЦЮСЗПЮНХМПЮОЬСАМСЦЗФЗХСЫПМСЮХЫЙЗССЫПГЦЮНСЮУФМПЗФЕОЯОБДМЦЗОЗ.ЮНЦМТСАВААЦЕЫШЮЛЕЗХЬФЮЛПЗЙЗСАПСАИЗХЦТАВАФСЫШЦФАУОЫИСЫШЦФЮХХМПСАИЗХЦТАУЗЙЗФНЮИЕЮЯМЛНАЦАФЫШСЮУФАЦЯИЗСММПСАВМШТЗНАТШФЮСМЦХТАМЦЮ.СЫГ

