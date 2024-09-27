package Data;

public class Triangle {

    public float baseSize;
    public float perpendicularHeightSize;
    public float aSideSize;
    public float cSideSize;

    public float getPerimeter () {
        return this.baseSize + this.aSideSize + this.cSideSize;
    }

}
