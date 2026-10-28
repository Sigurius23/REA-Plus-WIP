package p188ha;

import java.util.Arrays;
import java.util.Objects;
import p516u8.C34630z;

/* JADX INFO: renamed from: ha.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17032a extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65500b;

    /* JADX INFO: renamed from: c */
    public final String f65501c;

    /* JADX INFO: renamed from: d */
    public final int f65502d;

    /* JADX INFO: renamed from: e */
    public final byte[] f65503e;

    public C17032a(String str, String str2, int i13, byte[] bArr) {
        super("APIC");
        this.f65500b = str;
        this.f65501c = str2;
        this.f65502d = i13;
        this.f65503e = bArr;
    }

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: a */
    public final void mo40837a(C34630z c34630z) {
        c34630z.m109421a(this.f65502d, this.f65503e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17032a.class == obj.getClass()) {
            C17032a c17032a = (C17032a) obj;
            if (this.f65502d == c17032a.f65502d && Objects.equals(this.f65500b, c17032a.f65500b) && Objects.equals(this.f65501c, c17032a.f65501c) && Arrays.equals(this.f65503e, c17032a.f65503e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (527 + this.f65502d) * 31;
        String str = this.f65500b;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65501c;
        return Arrays.hashCode(this.f65503e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": mimeType=" + this.f65500b + ", description=" + this.f65501c;
    }
}
