package p208i2;

/* JADX INFO: renamed from: i2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17901o {
    /* JADX INFO: renamed from: a */
    public static String m51482a(int i13) {
        if (i13 == 0) {
            return "Clear";
        }
        if (i13 == 1) {
            return "Src";
        }
        if (i13 == 2) {
            return "Dst";
        }
        if (i13 == 3) {
            return "SrcOver";
        }
        if (i13 == 4) {
            return "DstOver";
        }
        if (i13 == 5) {
            return "SrcIn";
        }
        if (i13 == 6) {
            return "DstIn";
        }
        if (i13 == 7) {
            return "SrcOut";
        }
        if (i13 == 8) {
            return "DstOut";
        }
        if (i13 == 9) {
            return "SrcAtop";
        }
        if (i13 == 10) {
            return "DstAtop";
        }
        if (i13 == 11) {
            return "Xor";
        }
        if (i13 == 12) {
            return "Plus";
        }
        if (i13 == 13) {
            return "Modulate";
        }
        if (i13 == 14) {
            return "Screen";
        }
        if (i13 == 15) {
            return "Overlay";
        }
        if (i13 == 16) {
            return "Darken";
        }
        if (i13 == 17) {
            return "Lighten";
        }
        if (i13 == 18) {
            return "ColorDodge";
        }
        if (i13 == 19) {
            return "ColorBurn";
        }
        if (i13 == 20) {
            return "HardLight";
        }
        if (i13 == 21) {
            return "Softlight";
        }
        if (i13 == 22) {
            return "Difference";
        }
        if (i13 == 23) {
            return "Exclusion";
        }
        if (i13 == 24) {
            return "Multiply";
        }
        if (i13 == 25) {
            return "Hue";
        }
        if (i13 == 26) {
            return "Saturation";
        }
        if (i13 == 27) {
            return "Color";
        }
        return i13 == 28 ? "Luminosity" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return obj instanceof C17901o;
    }

    public final int hashCode() {
        return Integer.hashCode(3);
    }

    public final String toString() {
        return m51482a(3);
    }
}
