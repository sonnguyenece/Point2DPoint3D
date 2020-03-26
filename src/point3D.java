public class point3D extends point2D {
    private float z = 0.0f;

    public point3D() {

    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ(float x, float y, float z) {
        float[] getXYZ = {getX(), getY(), getZ()};
        return getXYZ;
    }

    @Override
    public String toString() {
        return "point3D("
                + super.getX()+" "+
                + super.getY()+" "+
                + z
                + ')';
    }
}
