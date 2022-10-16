package FunctionalPrograms;


public class DistanceJavaPro {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double dist =Math.sqrt(x*x + y*y);
        System.out.println("Distance Between "+x+" and "+y+"   "+"from (0,0) is ="+dist);
    }
}
