package com.squareup.wire;

import l83.EnumC23463i;
import ne3.C26612f;
import ne3.C26616h;
import ne3.C26623k0;
import ne3.C26624l;
import no.nordicsemi.android.dfu.DfuBaseService;
import p021av.C2088b;
import p031b9.AbstractC2875y;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: com.squareup.wire.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C5591v {

    /* JADX INFO: renamed from: g */
    public static final byte[] f22118g = new byte[0];

    /* JADX INFO: renamed from: a */
    public C26616h f22119a = new C26616h();

    /* JADX INFO: renamed from: b */
    public C26616h f22120b = new C26616h();

    /* JADX INFO: renamed from: c */
    public final C26612f f22121c = new C26612f();

    /* JADX INFO: renamed from: d */
    public byte[] f22122d = f22118g;

    /* JADX INFO: renamed from: e */
    public int f22123e;

    /* JADX INFO: renamed from: f */
    public final Object f22124f;

    public C5591v() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.f22124f = AbstractC30060g.m92087G(enumC23463i, C5590u.f22117w);
        AbstractC30060g.m92087G(enumC23463i, new C2088b(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final void m16822a() {
        byte[] bArr = this.f22122d;
        byte[] bArr2 = f22118g;
        if (bArr == bArr2) {
            return;
        }
        this.f22121c.close();
        this.f22120b.skip(this.f22123e);
        this.f22120b.mo79189N0(this.f22119a);
        C26616h c26616h = this.f22119a;
        this.f22119a = this.f22120b;
        this.f22120b = c26616h;
        this.f22122d = bArr2;
        this.f22123e = 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m16823b() {
        return (this.f22122d.length - this.f22123e) + ((int) this.f22119a.f105866x);
    }

    /* JADX INFO: renamed from: c */
    public final void m16824c(int i13) {
        if (this.f22123e >= i13) {
            return;
        }
        m16822a();
        C26616h c26616h = this.f22120b;
        C26612f c26612f = this.f22121c;
        c26616h.m79199a0(c26612f);
        if (i13 <= 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "minByteCount <= 0: ").toString());
        }
        if (i13 > 8192) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "minByteCount > Segment.SIZE: ").toString());
        }
        C26616h c26616h2 = c26612f.f105853w;
        if (c26616h2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!c26612f.f105854x) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j7 = c26616h2.f105866x;
        C26623k0 c26623k0M79216k1 = c26616h2.m79216k1(i13);
        int i14 = 8192 - c26623k0M79216k1.f105876c;
        c26623k0M79216k1.f105876c = DfuBaseService.ERROR_REMOTE_MASK;
        c26616h2.f105866x = ((long) i14) + j7;
        c26612f.f105855y = c26623k0M79216k1;
        c26612f.f105856z = j7;
        byte[] bArr = c26623k0M79216k1.f105874a;
        c26612f.f105850E = bArr;
        c26612f.f105851F = 8192 - i14;
        c26612f.f105852G = DfuBaseService.ERROR_REMOTE_MASK;
        if (j7 == 0) {
            AbstractC22676k.m65747g(bArr);
            if (8192 == bArr.length) {
                byte[] bArr2 = c26612f.f105850E;
                AbstractC22676k.m65747g(bArr2);
                this.f22122d = bArr2;
                this.f22123e = c26612f.f105852G;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: d */
    public final void m16825d(C26624l value) {
        AbstractC22676k.m65750j(value, "value");
        int iMo79253d = value.mo79253d();
        while (iMo79253d != 0) {
            m16824c(1);
            int iMin = Math.min(this.f22123e, iMo79253d);
            int i13 = this.f22123e - iMin;
            this.f22123e = i13;
            iMo79253d -= iMin;
            value.mo79251b(iMo79253d, i13, iMin, this.f22122d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16826e(int i13) {
        m16824c(4);
        int i14 = this.f22123e;
        int i15 = i14 - 4;
        this.f22123e = i15;
        byte[] bArr = this.f22122d;
        bArr[i15] = (byte) (i13 & 255);
        bArr[i14 - 3] = (byte) ((i13 >>> 8) & 255);
        bArr[i14 - 2] = (byte) ((i13 >>> 16) & 255);
        bArr[i14 - 1] = (byte) ((i13 >>> 24) & 255);
    }

    /* JADX INFO: renamed from: f */
    public final void m16827f(long j7) {
        m16824c(8);
        int i13 = this.f22123e;
        int i14 = i13 - 8;
        this.f22123e = i14;
        byte[] bArr = this.f22122d;
        bArr[i14] = (byte) (j7 & 255);
        bArr[i13 - 7] = (byte) ((j7 >>> 8) & 255);
        bArr[i13 - 6] = (byte) ((j7 >>> 16) & 255);
        bArr[i13 - 5] = (byte) ((j7 >>> 24) & 255);
        bArr[i13 - 4] = (byte) ((j7 >>> 32) & 255);
        bArr[i13 - 3] = (byte) ((j7 >>> 40) & 255);
        bArr[i13 - 2] = (byte) ((j7 >>> 48) & 255);
        bArr[i13 - 1] = (byte) ((j7 >>> 56) & 255);
    }

    /* JADX INFO: renamed from: g */
    public final void m16828g(int i13, EnumC5573d fieldEncoding) {
        AbstractC22676k.m65750j(fieldEncoding, "fieldEncoding");
        m16829h((i13 << 3) | fieldEncoding.f22090w);
    }

    /* JADX INFO: renamed from: h */
    public final void m16829h(int i13) {
        int i14;
        if ((i13 & (-128)) == 0) {
            i14 = 1;
        } else if ((i13 & (-16384)) == 0) {
            i14 = 2;
        } else if (((-2097152) & i13) == 0) {
            i14 = 3;
        } else {
            i14 = ((-268435456) & i13) == 0 ? 4 : 5;
        }
        m16824c(i14);
        int i15 = this.f22123e - i14;
        this.f22123e = i15;
        while ((i13 & (-128)) != 0) {
            this.f22122d[i15] = (byte) ((i13 & 127) | 128);
            i13 >>>= 7;
            i15++;
        }
        this.f22122d[i15] = (byte) i13;
    }

    /* JADX INFO: renamed from: i */
    public final void m16830i(long j7) {
        int iM113975n0 = AbstractC35902e.m113975n0(j7);
        m16824c(iM113975n0);
        int i13 = this.f22123e - iM113975n0;
        this.f22123e = i13;
        while (((-128) & j7) != 0) {
            this.f22122d[i13] = (byte) ((127 & j7) | 128);
            j7 >>>= 7;
            i13++;
        }
        this.f22122d[i13] = (byte) j7;
    }
}
