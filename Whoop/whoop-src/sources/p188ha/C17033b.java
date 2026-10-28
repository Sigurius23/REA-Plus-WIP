package p188ha;

import java.util.Arrays;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: ha.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C17033b extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final byte[] f65504b;

    public C17033b(String str, byte[] bArr) {
        super(str);
        this.f65504b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17033b.class == obj.getClass()) {
            C17033b c17033b = (C17033b) obj;
            if (this.f65528a.equals(c17033b.f65528a) && Arrays.equals(this.f65504b, c17033b.f65504b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f65504b) + AbstractC11266d.m30450d(527, 31, this.f65528a);
    }
}
