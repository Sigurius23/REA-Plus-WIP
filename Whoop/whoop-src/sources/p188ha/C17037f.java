package p188ha;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: ha.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17037f extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65519b;

    /* JADX INFO: renamed from: c */
    public final String f65520c;

    /* JADX INFO: renamed from: d */
    public final String f65521d;

    /* JADX INFO: renamed from: e */
    public final byte[] f65522e;

    public C17037f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f65519b = str;
        this.f65520c = str2;
        this.f65521d = str3;
        this.f65522e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17037f.class == obj.getClass()) {
            C17037f c17037f = (C17037f) obj;
            if (Objects.equals(this.f65519b, c17037f.f65519b) && Objects.equals(this.f65520c, c17037f.f65520c) && Objects.equals(this.f65521d, c17037f.f65521d) && Arrays.equals(this.f65522e, c17037f.f65522e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f65519b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65520c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f65521d;
        return Arrays.hashCode(this.f65522e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": mimeType=" + this.f65519b + ", filename=" + this.f65520c + ", description=" + this.f65521d;
    }
}
