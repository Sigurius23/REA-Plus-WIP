package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes.dex */
public class Size {
    private final int height;
    private final int width;

    public Size(int i13, int i14) {
        this.width = i13;
        this.height = i14;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i13 = this.height;
        int i14 = this.width;
        return i13 ^ ((i14 >>> 16) | (i14 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
