public class Test {
    public static void main(String[] args) {
        point2D p2D = new point2D(5,6);
        p2D.setXY(7,8);
        System.out.println(p2D);
        point3D point3D = new point3D();
        point3D.setX(5);
//        point3D.setY(6);
        point3D.setZ(7);
        System.out.println(point3D);
        point2D point2_5D = new point3D();
        point2_5D.setY(6);
        System.out.println(point2_5D);

    }
}
