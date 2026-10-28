package p012ab;

import java.util.Arrays;
import java.util.Collections;
import jh3.AbstractC21702c;
import p309lo.C24561s;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p619xl.C38445a;
import p641y8.AbstractC39319n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C0694o implements InterfaceC0685j {

    /* JADX INFO: renamed from: l */
    public static final float[] f2511l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final C38445a f2512a;

    /* JADX INFO: renamed from: b */
    public final C38059n f2513b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f2514c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final C0691m f2515d;

    /* JADX INFO: renamed from: e */
    public final C0704y f2516e;

    /* JADX INFO: renamed from: f */
    public C0693n f2517f;

    /* JADX INFO: renamed from: g */
    public long f2518g;

    /* JADX INFO: renamed from: h */
    public String f2519h;

    /* JADX INFO: renamed from: i */
    public InterfaceC33639k0 f2520i;

    /* JADX INFO: renamed from: j */
    public boolean f2521j;

    /* JADX INFO: renamed from: k */
    public long f2522k;

    public C0694o(C38445a c38445a) {
        this.f2512a = c38445a;
        C0691m c0691m = new C0691m();
        c0691m.f2501e = new byte[128];
        this.f2515d = c0691m;
        this.f2522k = -9223372036854775807L;
        this.f2516e = new C0704y(178, 0);
        this.f2513b = new C38059n();
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        AbstractC39319n.m125275b(this.f2514c);
        C0691m c0691m = this.f2515d;
        c0691m.f2497a = false;
        c0691m.f2499c = 0;
        c0691m.f2498b = 0;
        C0693n c0693n = this.f2517f;
        if (c0693n != null) {
            c0693n.f2503b = false;
            c0693n.f2504c = false;
            c0693n.f2505d = false;
            c0693n.f2506e = -1;
        }
        C0704y c0704y = this.f2516e;
        if (c0704y != null) {
            c0704y.m1759d();
        }
        this.f2518g = 0L;
        this.f2522k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0239  */
    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) {
        int i13;
        int i14;
        boolean z4;
        int i15;
        int i16;
        float f13;
        C38059n c38059n2 = c38059n;
        AbstractC35849g.m113808j(this.f2517f);
        AbstractC35849g.m113808j(this.f2520i);
        int i17 = c38059n2.f163018b;
        int i18 = c38059n2.f163019c;
        byte[] bArr = c38059n2.f163017a;
        this.f2518g += (long) c38059n2.m121848a();
        int i19 = 0;
        this.f2520i.mo36176d(c38059n2, c38059n2.m121848a(), 0);
        while (true) {
            int iM125276c = AbstractC39319n.m125276c(bArr, i17, i18, this.f2514c);
            C0691m c0691m = this.f2515d;
            C0704y c0704y = this.f2516e;
            if (iM125276c == i18) {
                if (!this.f2521j) {
                    c0691m.m1746a(bArr, i17, i18);
                }
                this.f2517f.m1747a(bArr, i17, i18);
                if (c0704y != null) {
                    c0704y.m1756a(bArr, i17, i18);
                    return;
                }
                return;
            }
            int i24 = iM125276c + 3;
            byte b = c38059n2.f163017a[i24];
            int i25 = b & 255;
            int i26 = iM125276c - i17;
            if (this.f2521j) {
                i13 = i18;
                i14 = i24;
            } else {
                if (i26 > 0) {
                    c0691m.m1746a(bArr, i17, iM125276c);
                }
                int i27 = i26 < 0 ? -i26 : i19;
                int i28 = c0691m.f2498b;
                if (i28 != 0) {
                    i13 = i18;
                    if (i28 == 1) {
                        i14 = i24;
                        i16 = 0;
                        if (i25 != 181) {
                            AbstractC38046a.m121826u("H263Reader", "Unexpected start code value");
                            c0691m.f2497a = false;
                            c0691m.f2499c = 0;
                            c0691m.f2498b = 0;
                        } else {
                            c0691m.f2498b = 2;
                        }
                    } else if (i28 != 2) {
                        i14 = i24;
                        if (i28 != 3) {
                            if (i28 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i25 == 179 || i25 == 181) {
                                c0691m.f2499c -= i27;
                                c0691m.f2497a = false;
                                InterfaceC33639k0 interfaceC33639k0 = this.f2520i;
                                int i29 = c0691m.f2500d;
                                String str = this.f2519h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(c0691m.f2501e, c0691m.f2499c);
                                C24561s c24561s = new C24561s(bArrCopyOf, bArrCopyOf.length, 5, (byte) 0);
                                c24561s.m71644u(i29);
                                c24561s.m71644u(4);
                                c24561s.m71642s();
                                c24561s.m71643t(8);
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(4);
                                    c24561s.m71643t(3);
                                }
                                int iM71632i = c24561s.m71632i(4);
                                if (iM71632i == 15) {
                                    int iM71632i2 = c24561s.m71632i(8);
                                    int iM71632i3 = c24561s.m71632i(8);
                                    if (iM71632i3 == 0) {
                                        AbstractC38046a.m121826u("H263Reader", "Invalid aspect ratio");
                                        f13 = 1.0f;
                                    } else {
                                        f13 = iM71632i2 / iM71632i3;
                                    }
                                } else if (iM71632i < 7) {
                                    f13 = f2511l[iM71632i];
                                } else {
                                    AbstractC38046a.m121826u("H263Reader", "Invalid aspect ratio");
                                    f13 = 1.0f;
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(2);
                                    c24561s.m71643t(1);
                                    if (c24561s.m71631h()) {
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                        c24561s.m71643t(3);
                                        c24561s.m71643t(11);
                                        c24561s.m71642s();
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                    }
                                }
                                if (c24561s.m71632i(2) != 0) {
                                    AbstractC38046a.m121826u("H263Reader", "Unhandled video object layer shape");
                                }
                                c24561s.m71642s();
                                int iM71632i4 = c24561s.m71632i(16);
                                c24561s.m71642s();
                                if (c24561s.m71631h()) {
                                    if (iM71632i4 == 0) {
                                        AbstractC38046a.m121826u("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i34 = 0;
                                        for (int i35 = iM71632i4 - 1; i35 > 0; i35 >>= 1) {
                                            i34++;
                                        }
                                        c24561s.m71643t(i34);
                                    }
                                }
                                c24561s.m71642s();
                                int iM71632i5 = c24561s.m71632i(13);
                                c24561s.m71642s();
                                int iM71632i6 = c24561s.m71632i(13);
                                c24561s.m71642s();
                                c24561s.m71642s();
                                C34608o c34608o = new C34608o();
                                c34608o.f145729a = str;
                                c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                                c34608o.f145741m = AbstractC34587d0.m109382o("video/mp4v-es");
                                c34608o.f145748t = iM71632i5;
                                c34608o.f145749u = iM71632i6;
                                c34608o.f145752x = f13;
                                c34608o.f145744p = Collections.singletonList(bArrCopyOf);
                                AbstractC21702c.m61152w(c34608o, interfaceC33639k0);
                                this.f2521j = true;
                            } else {
                                i16 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            AbstractC38046a.m121826u("H263Reader", "Unexpected start code value");
                            i16 = 0;
                            c0691m.f2497a = false;
                            c0691m.f2499c = 0;
                            c0691m.f2498b = 0;
                        } else {
                            i16 = 0;
                            c0691m.f2500d = c0691m.f2499c;
                            c0691m.f2498b = 4;
                        }
                    } else {
                        i14 = i24;
                        i16 = 0;
                        if (i25 > 31) {
                            AbstractC38046a.m121826u("H263Reader", "Unexpected start code value");
                            c0691m.f2497a = false;
                            c0691m.f2499c = 0;
                            c0691m.f2498b = 0;
                        } else {
                            c0691m.f2498b = 3;
                        }
                    }
                } else {
                    i13 = i18;
                    i14 = i24;
                    i16 = 0;
                    if (i25 == 176) {
                        c0691m.f2498b = 1;
                        c0691m.f2497a = true;
                    }
                }
                c0691m.m1746a(C0691m.f2496f, i16, 3);
            }
            this.f2517f.m1747a(bArr, i17, iM125276c);
            if (c0704y == null) {
                c38059n2 = c38059n;
                z4 = true;
            } else {
                if (i26 > 0) {
                    c0704y.m1756a(bArr, i17, iM125276c);
                    i15 = 0;
                } else {
                    i15 = -i26;
                }
                if (c0704y.m1757b(i15)) {
                    int iM125287n = AbstractC39319n.m125287n(c0704y.f2667f, (byte[]) c0704y.f2666e);
                    int i36 = AbstractC38065t.f163031a;
                    byte[] bArr2 = (byte[]) c0704y.f2666e;
                    C38059n c38059n3 = this.f2513b;
                    c38059n3.m121844D(iM125287n, bArr2);
                    this.f2512a.m123177l(this.f2522k, c38059n3);
                }
                if (i25 == 178) {
                    c38059n2 = c38059n;
                    z4 = true;
                    if (c38059n2.f163017a[iM125276c + 2] == 1) {
                        c0704y.m1760e(i25);
                    }
                } else {
                    c38059n2 = c38059n;
                    z4 = true;
                }
            }
            int i37 = i13 - iM125276c;
            this.f2517f.m1748b(i37, this.f2518g - ((long) i37), this.f2521j);
            C0693n c0693n = this.f2517f;
            long j7 = this.f2522k;
            c0693n.f2506e = i25;
            c0693n.f2505d = false;
            c0693n.f2503b = (i25 == 182 || i25 == 179) ? z4 : false;
            c0693n.f2504c = i25 == 182 ? z4 : false;
            i19 = 0;
            c0693n.f2507f = 0;
            c0693n.f2509h = j7;
            i18 = i13;
            i17 = i14;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2522k = j7;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
        AbstractC35849g.m113808j(this.f2517f);
        if (z4) {
            this.f2517f.m1748b(0, this.f2518g, this.f2521j);
            C0693n c0693n = this.f2517f;
            c0693n.f2503b = false;
            c0693n.f2504c = false;
            c0693n.f2505d = false;
            c0693n.f2506e = -1;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2519h = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 2);
        this.f2520i = interfaceC33639k0Mo3101o;
        this.f2517f = new C0693n(interfaceC33639k0Mo3101o, 0);
        this.f2512a.m123178m(interfaceC33648q, c0690l0);
    }
}
