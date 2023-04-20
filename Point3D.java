public class Point3D  extends  Point2D {
    public float z;

    public Point3D() {
    }

    public Point3D(float z, float x, float y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  float[] getXYZ(){
        return getXYZ();
    }
    public void setXYZ(float y, float x, float z) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}'+ "  " + super.toString();
    }
}
