package tm;

import java.util.Arrays;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: tm.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C33928f {

    /* JADX INFO: renamed from: c */
    public static final C33928f f142169c = new C33928f(new int[]{2}, 8);

    /* JADX INFO: renamed from: d */
    public static final C33928f f142170d = new C33928f(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: e */
    public static final int[] f142171e = {5, 6, 18, 17, 14, 7, 8};

    /* JADX INFO: renamed from: a */
    public final int[] f142172a;

    /* JADX INFO: renamed from: b */
    public final int f142173b;

    public C33928f(int[] iArr, int i13) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f142172a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f142172a = new int[0];
        }
        this.f142173b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33928f)) {
            return false;
        }
        C33928f c33928f = (C33928f) obj;
        return Arrays.equals(this.f142172a, c33928f.f142172a) && this.f142173b == c33928f.f142173b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f142172a) * 31) + this.f142173b;
    }

    public final String toString() {
        String string = Arrays.toString(this.f142172a);
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(67, string));
        sb4.append("AudioCapabilities[maxChannelCount=");
        sb4.append(this.f142173b);
        sb4.append(", supportedEncodings=");
        sb4.append(string);
        sb4.append("]");
        return sb4.toString();
    }
}
