package be;

import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: be.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C3161n {

    /* JADX INFO: renamed from: a */
    public final byte[] f12364a;

    /* JADX INFO: renamed from: b */
    public final C34913b f12365b;

    public C3161n(byte[] bArr, C34913b c34913b) {
        this.f12364a = bArr;
        this.f12365b = c34913b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3161n.class != obj.getClass()) {
            return false;
        }
        C3161n c3161n = (C3161n) obj;
        return Arrays.equals(this.f12364a, c3161n.f12364a) && AbstractC22676k.m65745e(this.f12365b, c3161n.f12365b);
    }

    public final int hashCode() {
        return this.f12365b.f147018w.hashCode() + (Arrays.hashCode(this.f12364a) * 31);
    }

    public final String toString() {
        return "Token(value=" + Arrays.toString(this.f12364a) + ", expires=" + this.f12365b + ')';
    }
}
