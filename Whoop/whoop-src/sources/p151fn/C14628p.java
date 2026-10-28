package p151fn;

import android.util.Log;
import ed3.C13117a;
import p012ab.C0690l0;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p309lo.C24566x;
import p588wm.InterfaceC37369k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: fn.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C14628p implements InterfaceC14638z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC14620h f53979a;

    /* JADX INFO: renamed from: b */
    public final C24561s f53980b = new C24561s(new byte[10], 10, 0, (byte) 0);

    /* JADX INFO: renamed from: c */
    public int f53981c = 0;

    /* JADX INFO: renamed from: d */
    public int f53982d;

    /* JADX INFO: renamed from: e */
    public C24566x f53983e;

    /* JADX INFO: renamed from: f */
    public boolean f53984f;

    /* JADX INFO: renamed from: g */
    public boolean f53985g;

    /* JADX INFO: renamed from: h */
    public boolean f53986h;

    /* JADX INFO: renamed from: i */
    public int f53987i;

    /* JADX INFO: renamed from: j */
    public int f53988j;

    /* JADX INFO: renamed from: k */
    public boolean f53989k;

    /* JADX INFO: renamed from: l */
    public long f53990l;

    public C14628p(InterfaceC14620h interfaceC14620h) {
        this.f53979a = interfaceC14620h;
    }

    @Override // p151fn.InterfaceC14638z
    /* JADX INFO: renamed from: a */
    public final void mo41824a() {
        this.f53981c = 0;
        this.f53982d = 0;
        this.f53986h = false;
        this.f53979a.mo41817a();
    }

    @Override // p151fn.InterfaceC14638z
    /* JADX INFO: renamed from: b */
    public final void mo41825b(int i13, C13117a c13117a) {
        int i14;
        int i15;
        int i16;
        AbstractC24543a.m71574j(this.f53983e);
        int i17 = i13 & 1;
        InterfaceC14620h interfaceC14620h = this.f53979a;
        int i18 = 2;
        int i19 = 0;
        if (i17 != 0) {
            int i24 = this.f53981c;
            if (i24 != 0 && i24 != 1) {
                if (i24 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i24 != 3) {
                        throw new IllegalStateException();
                    }
                    int i25 = this.f53988j;
                    if (i25 != -1) {
                        StringBuilder sb4 = new StringBuilder(59);
                        sb4.append("Unexpected start indicator: expected ");
                        sb4.append(i25);
                        sb4.append(" more bytes");
                        Log.w("PesReader", sb4.toString());
                    }
                    interfaceC14620h.mo1713h();
                }
            }
            this.f53981c = 1;
            this.f53982d = 0;
        }
        int i26 = i13;
        while (c13117a.m36692a() > 0) {
            int i27 = this.f53981c;
            if (i27 != 0) {
                C24561s c24561s = this.f53980b;
                if (i27 != 1) {
                    if (i27 == i18) {
                        if (m41826c(c13117a, c24561s.f95858b, Math.min(10, this.f53987i)) && m41826c(c13117a, null, this.f53987i)) {
                            c24561s.m71640q(i19);
                            this.f53990l = -9223372036854775807L;
                            if (this.f53984f) {
                                c24561s.m71643t(4);
                                long jM71632i = ((long) c24561s.m71632i(3)) << 30;
                                c24561s.m71643t(1);
                                long jM71632i2 = ((long) (c24561s.m71632i(15) << 15)) | jM71632i;
                                c24561s.m71643t(1);
                                long jM71632i3 = jM71632i2 | ((long) c24561s.m71632i(15));
                                c24561s.m71643t(1);
                                if (!this.f53986h && this.f53985g) {
                                    c24561s.m71643t(4);
                                    long jM71632i4 = ((long) c24561s.m71632i(3)) << 30;
                                    c24561s.m71643t(1);
                                    long jM71632i5 = jM71632i4 | ((long) (c24561s.m71632i(15) << 15));
                                    c24561s.m71643t(1);
                                    long jM71632i6 = jM71632i5 | ((long) c24561s.m71632i(15));
                                    c24561s.m71643t(1);
                                    this.f53983e.m71660b(jM71632i6);
                                    this.f53986h = true;
                                }
                                this.f53990l = this.f53983e.m71660b(jM71632i3);
                            }
                            i26 |= this.f53989k ? 4 : 0;
                            interfaceC14620h.mo41818d(i26, this.f53990l);
                            this.f53981c = 3;
                            this.f53982d = 0;
                            i19 = 0;
                            i18 = 2;
                        }
                    } else {
                        if (i27 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM36692a = c13117a.m36692a();
                        int i28 = this.f53988j;
                        int i29 = i28 == -1 ? i19 : iM36692a - i28;
                        if (i29 > 0) {
                            iM36692a -= i29;
                            c13117a.m36688J(c13117a.f45382b + iM36692a);
                        }
                        interfaceC14620h.mo1711f(c13117a);
                        int i34 = this.f53988j;
                        if (i34 != -1) {
                            int i35 = i34 - iM36692a;
                            this.f53988j = i35;
                            if (i35 == 0) {
                                interfaceC14620h.mo1713h();
                                this.f53981c = 1;
                                this.f53982d = i19;
                            }
                        }
                    }
                    i14 = i18;
                    i15 = i19;
                } else {
                    i15 = i19;
                    if (m41826c(c13117a, c24561s.f95858b, 9)) {
                        c24561s.m71640q(i15);
                        int iM71632i = c24561s.m71632i(24);
                        if (iM71632i != 1) {
                            AbstractC30007c.m91850t(41, iM71632i, "Unexpected start code prefix: ", "PesReader");
                            this.f53988j = -1;
                            i16 = 0;
                            i14 = 2;
                        } else {
                            c24561s.m71643t(8);
                            int iM71632i2 = c24561s.m71632i(16);
                            c24561s.m71643t(5);
                            this.f53989k = c24561s.m71631h();
                            i14 = 2;
                            c24561s.m71643t(2);
                            this.f53984f = c24561s.m71631h();
                            this.f53985g = c24561s.m71631h();
                            c24561s.m71643t(6);
                            int iM71632i3 = c24561s.m71632i(8);
                            this.f53987i = iM71632i3;
                            if (iM71632i2 == 0) {
                                this.f53988j = -1;
                            } else {
                                int i36 = (iM71632i2 - 3) - iM71632i3;
                                this.f53988j = i36;
                                if (i36 < 0) {
                                    AbstractC30007c.m91850t(47, i36, "Found negative packet payload size: ", "PesReader");
                                    this.f53988j = -1;
                                }
                            }
                            i16 = 2;
                        }
                        this.f53981c = i16;
                        i15 = 0;
                        this.f53982d = 0;
                    } else {
                        i14 = 2;
                    }
                }
            } else {
                i14 = i18;
                i15 = i19;
                c13117a.m36690L(c13117a.m36692a());
            }
            i19 = i15;
            i18 = i14;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41826c(C13117a c13117a, byte[] bArr, int i13) {
        int iMin = Math.min(c13117a.m36692a(), i13 - this.f53982d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c13117a.m36690L(iMin);
        } else {
            c13117a.m36697g(bArr, this.f53982d, iMin);
        }
        int i14 = this.f53982d + iMin;
        this.f53982d = i14;
        return i14 == i13;
    }

    @Override // p151fn.InterfaceC14638z
    /* JADX INFO: renamed from: i */
    public final void mo41827i(C24566x c24566x, InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        this.f53983e = c24566x;
        this.f53979a.mo1712g(interfaceC37369k, c0690l0);
    }
}
