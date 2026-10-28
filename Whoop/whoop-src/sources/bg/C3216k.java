package bg;

import androidx.room.AbstractC1772c1;
import i93.C18284j;
import java.util.Arrays;
import l83.C23470p;
import m83.AbstractC25265s;
import p003a1.C0103b;
import p003a1.C0111j;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: bg.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C3216k extends AbstractC1772c1 {

    /* JADX INFO: renamed from: e */
    public static final C3216k f12576e = new C3216k(null, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});

    /* JADX INFO: renamed from: f */
    public static final C3216k f12577f = new C3216k(null, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: g */
    public static final byte[] f12578g = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};

    /* JADX INFO: renamed from: a */
    public final byte[] f12579a;

    /* JADX INFO: renamed from: b */
    public final String f12580b;

    /* JADX INFO: renamed from: c */
    public final C23470p f12581c;

    /* JADX INFO: renamed from: d */
    public final C23470p f12582d;

    public C3216k(String str, byte[] bArr) {
        this.f12579a = bArr;
        this.f12580b = str;
        if (bArr.length == 16) {
            this.f12581c = AbstractC30060g.m92088H(new C3215j(this, 0));
            this.f12582d = AbstractC30060g.m92088H(new C0111j(this, 9));
        } else {
            throw new IllegalArgumentException(("Invalid IPv6 repr: " + bArr + "; expected 16 bytes").toString());
        }
    }

    @Override // androidx.room.AbstractC1772c1
    /* JADX INFO: renamed from: C */
    public final boolean mo5409C() {
        return equals(f12576e);
    }

    /* JADX INFO: renamed from: U */
    public final void m9256U(StringBuilder sb4, C18284j c18284j) {
        AbstractC25265s.m74109M0(c18284j, sb4, ":", null, null, new C0103b(this, 20), 60);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3216k.class == obj.getClass() && Arrays.equals(this.f12579a, ((C3216k) obj).f12579a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12579a);
    }

    public final String toString() {
        return (String) this.f12582d.getValue();
    }

    @Override // androidx.room.AbstractC1772c1
    /* JADX INFO: renamed from: y */
    public final byte[] mo5412y() {
        return this.f12579a;
    }

    public C3216k(short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s22, String str) {
        this(str, new byte[]{(byte) (((s13 & 65535) >>> 8) & 255), (byte) (s13 & 255), (byte) (((s14 & 65535) >>> 8) & 255), (byte) (s14 & 255), (byte) (((s15 & 65535) >>> 8) & 255), (byte) (s15 & 255), (byte) (((s16 & 65535) >>> 8) & 255), (byte) (s16 & 255), (byte) (((s17 & 65535) >>> 8) & 255), (byte) (s17 & 255), (byte) (((s18 & 65535) >>> 8) & 255), (byte) (s18 & 255), (byte) (((s19 & 65535) >>> 8) & 255), (byte) (s19 & 255), (byte) (((s22 & 65535) >>> 8) & 255), (byte) (s22 & 255)});
    }
}
