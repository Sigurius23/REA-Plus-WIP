package gm;

import dm.C12173c;
import java.util.Arrays;

/* JADX INFO: renamed from: gm.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C15985m {

    /* JADX INFO: renamed from: a */
    public final C12173c f60498a;

    /* JADX INFO: renamed from: b */
    public final byte[] f60499b;

    public C15985m(C12173c c12173c, byte[] bArr) {
        if (c12173c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f60498a = c12173c;
        this.f60499b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15985m)) {
            return false;
        }
        C15985m c15985m = (C15985m) obj;
        if (this.f60498a.equals(c15985m.f60498a)) {
            return Arrays.equals(this.f60499b, c15985m.f60499b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f60498a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f60499b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f60498a + ", bytes=[...]}";
    }
}
