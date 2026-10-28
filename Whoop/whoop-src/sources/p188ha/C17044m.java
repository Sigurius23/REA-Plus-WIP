package p188ha;

import java.util.Arrays;

/* JADX INFO: renamed from: ha.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C17044m extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final int f65533b;

    /* JADX INFO: renamed from: c */
    public final int f65534c;

    /* JADX INFO: renamed from: d */
    public final int f65535d;

    /* JADX INFO: renamed from: e */
    public final int[] f65536e;

    /* JADX INFO: renamed from: f */
    public final int[] f65537f;

    public C17044m(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        super("MLLT");
        this.f65533b = i13;
        this.f65534c = i14;
        this.f65535d = i15;
        this.f65536e = iArr;
        this.f65537f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17044m.class == obj.getClass()) {
            C17044m c17044m = (C17044m) obj;
            if (this.f65533b == c17044m.f65533b && this.f65534c == c17044m.f65534c && this.f65535d == c17044m.f65535d && Arrays.equals(this.f65536e, c17044m.f65536e) && Arrays.equals(this.f65537f, c17044m.f65537f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f65537f) + ((Arrays.hashCode(this.f65536e) + ((((((527 + this.f65533b) * 31) + this.f65534c) * 31) + this.f65535d) * 31)) * 31);
    }
}
