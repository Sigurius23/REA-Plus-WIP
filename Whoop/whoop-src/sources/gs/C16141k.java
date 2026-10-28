package gs;

import com.google.crypto.tink.internal.C5099k0;
import ih0.AbstractC18489d0;
import java.util.Objects;

/* JADX INFO: renamed from: gs.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16141k extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final int f61325a;

    /* JADX INFO: renamed from: b */
    public final int f61326b;

    /* JADX INFO: renamed from: c */
    public final int f61327c;

    /* JADX INFO: renamed from: d */
    public final int f61328d;

    /* JADX INFO: renamed from: e */
    public final C16139j f61329e;

    /* JADX INFO: renamed from: f */
    public final C16139j f61330f;

    public C16141k(int i13, int i14, int i15, int i16, C16139j c16139j, C16139j c16139j2) {
        this.f61325a = i13;
        this.f61326b = i14;
        this.f61327c = i15;
        this.f61328d = i16;
        this.f61329e = c16139j;
        this.f61330f = c16139j2;
    }

    /* JADX INFO: renamed from: b */
    public static C5099k0 m45691b() {
        C5099k0 c5099k0 = new C5099k0();
        c5099k0.f21438w = null;
        c5099k0.f21439x = null;
        c5099k0.f21440y = null;
        c5099k0.f21441z = null;
        c5099k0.f21436E = null;
        c5099k0.f21437F = C16139j.f61303j;
        return c5099k0;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61329e != C16139j.f61303j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16141k)) {
            return false;
        }
        C16141k c16141k = (C16141k) obj;
        return c16141k.f61325a == this.f61325a && c16141k.f61326b == this.f61326b && c16141k.f61327c == this.f61327c && c16141k.f61328d == this.f61328d && c16141k.f61329e == this.f61329e && c16141k.f61330f == this.f61330f;
    }

    public final int hashCode() {
        return Objects.hash(C16141k.class, Integer.valueOf(this.f61325a), Integer.valueOf(this.f61326b), Integer.valueOf(this.f61327c), Integer.valueOf(this.f61328d), this.f61329e, this.f61330f);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb4.append(this.f61329e);
        sb4.append(", hashType: ");
        sb4.append(this.f61330f);
        sb4.append(", ");
        sb4.append(this.f61327c);
        sb4.append("-byte IV, and ");
        sb4.append(this.f61328d);
        sb4.append("-byte tags, and ");
        sb4.append(this.f61325a);
        sb4.append("-byte AES key, and ");
        return AbstractC18489d0.m53371l(sb4, this.f61326b, "-byte HMAC key)");
    }
}
