package rikkei;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------2D--------");
    Point2d point2d = new Point2d();
        System.out.println(point2d);
        System.out.println(Arrays.toString(point2d.getXY()));
        point2d.setXY(3,4);
        System.out.println("sau khi thay doi");
        System.out.println(Arrays.toString(point2d.getXY()));

        System.out.println("-----------------------------");
        Point2d point2d1 = new Point2d();
        System.out.println(point2d1);
        point2d1.setXY(1,2);
//        System.out.println(point2d1.getX());
        System.out.println(point2d1);

        System.out.println("----------------3D-------------------");
        Point3d point3d = new Point3d();
        System.out.println(point3d);
        System.out.println("sau khi set3d");
        point3d.setXYZ(3,3,3);
//        point3d.setXY(3,3);
        System.out.println("point3=========="+point3d);

    }
}
