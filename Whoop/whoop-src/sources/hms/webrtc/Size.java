package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class Size {
    public int height;
    public int width;

    public Size(int i13, int i14) {
        this.width = i13;
        this.height = i14;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
