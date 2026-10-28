package p012ab;

import a33.C0352d;
import ed3.C13117a;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Collections;
import p151fn.InterfaceC14620h;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p479s4.AbstractC32123d;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34592g;
import p516u8.C34608o;
import p516u8.C34610p;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38047b;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p641y8.C39313h;
import p641y8.C39315j;
import q63.AbstractC30007c;
import re.C31271g;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C0699t implements InterfaceC0685j, InterfaceC14620h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2587a;

    /* JADX INFO: renamed from: b */
    public String f2588b;

    /* JADX INFO: renamed from: c */
    public boolean f2589c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f2590d;

    /* JADX INFO: renamed from: e */
    public long f2591e;

    /* JADX INFO: renamed from: f */
    public long f2592f;

    /* JADX INFO: renamed from: g */
    public final Object f2593g;

    /* JADX INFO: renamed from: h */
    public Object f2594h;

    /* JADX INFO: renamed from: i */
    public Object f2595i;

    /* JADX INFO: renamed from: j */
    public final Object f2596j;

    /* JADX INFO: renamed from: k */
    public final Object f2597k;

    /* JADX INFO: renamed from: l */
    public final Object f2598l;

    /* JADX INFO: renamed from: m */
    public final Object f2599m;

    /* JADX INFO: renamed from: n */
    public final Object f2600n;

    /* JADX INFO: renamed from: o */
    public final Object f2601o;

    public C0699t(C0352d c0352d) {
        this.f2587a = 0;
        this.f2593g = c0352d;
        this.f2590d = new boolean[3];
        this.f2596j = new C0704y(32, 0);
        this.f2597k = new C0704y(33, 0);
        this.f2598l = new C0704y(34, 0);
        this.f2599m = new C0704y(39, 0);
        this.f2600n = new C0704y(40, 0);
        this.f2592f = -9223372036854775807L;
        this.f2601o = new C38059n();
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        switch (this.f2587a) {
            case 0:
                this.f2591e = 0L;
                this.f2592f = -9223372036854775807L;
                AbstractC39319n.m125275b(this.f2590d);
                ((C0704y) this.f2596j).m1759d();
                ((C0704y) this.f2597k).m1759d();
                ((C0704y) this.f2598l).m1759d();
                ((C0704y) this.f2599m).m1759d();
                ((C0704y) this.f2600n).m1759d();
                ((C31271g) ((C0352d) this.f2593g).f1239z).m96290b(0);
                C0698s c0698s = (C0698s) this.f2595i;
                if (c0698s != null) {
                    c0698s.f2578e = false;
                    c0698s.f2579f = false;
                    c0698s.f2580g = false;
                    c0698s.f2581h = false;
                    c0698s.f2582i = false;
                }
                break;
            default:
                this.f2591e = 0L;
                this.f2592f = -9223372036854775807L;
                AbstractC24543a.m71576l(this.f2590d);
                ((C0704y) this.f2596j).m1759d();
                ((C0704y) this.f2597k).m1759d();
                ((C0704y) this.f2598l).m1759d();
                ((C0704y) this.f2599m).m1759d();
                ((C0704y) this.f2600n).m1759d();
                C0698s c0698s2 = (C0698s) this.f2595i;
                if (c0698s2 != null) {
                    c0698s2.f2578e = false;
                    c0698s2.f2579f = false;
                    c0698s2.f2580g = false;
                    c0698s2.f2581h = false;
                    c0698s2.f2582i = false;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0159  */
    /* JADX INFO: renamed from: b */
    public void m1753b(int i13, int i14, long j7, long j13) {
        C0704y c0704y = (C0704y) this.f2598l;
        C0704y c0704y2 = (C0704y) this.f2597k;
        C0704y c0704y3 = (C0704y) this.f2596j;
        C0704y c0704y4 = (C0704y) this.f2600n;
        C0704y c0704y5 = (C0704y) this.f2599m;
        C31271g c31271g = (C31271g) ((C0352d) this.f2593g).f1239z;
        C38059n c38059n = (C38059n) this.f2601o;
        C0698s c0698s = (C0698s) this.f2595i;
        boolean z4 = this.f2589c;
        if (c0698s.f2582i && c0698s.f2579f) {
            c0698s.f2585l = c0698s.f2575b;
            c0698s.f2582i = false;
        } else if (c0698s.f2580g || c0698s.f2579f) {
            if (z4 && c0698s.f2581h) {
                c0698s.m1752a(i13 + ((int) (j7 - c0698s.f2574a)));
            }
            c0698s.f2583j = c0698s.f2574a;
            c0698s.f2584k = c0698s.f2577d;
            c0698s.f2585l = c0698s.f2575b;
            c0698s.f2581h = true;
        }
        if (!this.f2589c) {
            c0704y3.m1757b(i14);
            c0704y2.m1757b(i14);
            c0704y.m1757b(i14);
            if (c0704y3.f2665d && c0704y2.f2665d && c0704y.f2665d) {
                String str = this.f2588b;
                int i15 = c0704y3.f2667f;
                byte[] bArr = new byte[c0704y2.f2667f + i15 + c0704y.f2667f];
                System.arraycopy((byte[]) c0704y3.f2666e, 0, bArr, 0, i15);
                System.arraycopy((byte[]) c0704y2.f2666e, 0, bArr, c0704y3.f2667f, c0704y2.f2667f);
                System.arraycopy((byte[]) c0704y.f2666e, 0, bArr, c0704y3.f2667f + c0704y2.f2667f, c0704y.f2667f);
                C39315j c39315jM125282i = AbstractC39319n.m125282i((byte[]) c0704y2.f2666e, 3, c0704y2.f2667f, null);
                C39313h c39313h = c39315jM125282i.f169133b;
                String strM121828a = c39313h != null ? AbstractC38047b.m121828a(c39313h.f169121a, c39313h.f169122b, c39313h.f169123c, c39313h.f169124d, c39313h.f169125e, c39313h.f169126f) : null;
                C34608o c34608o = new C34608o();
                c34608o.f145729a = str;
                c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                c34608o.f145741m = AbstractC34587d0.m109382o("video/hevc");
                c34608o.f145738j = strM121828a;
                c34608o.f145748t = c39315jM125282i.f169136e;
                c34608o.f145749u = c39315jM125282i.f169137f;
                c34608o.f145717A = new C34592g(c39315jM125282i.f169140i, c39315jM125282i.f169141j, c39315jM125282i.f169142k, c39315jM125282i.f169134c + 8, c39315jM125282i.f169135d + 8, null);
                c34608o.f145752x = c39315jM125282i.f169138g;
                c34608o.f145743o = c39315jM125282i.f169139h;
                c34608o.f145718B = c39315jM125282i.f169132a + 1;
                c34608o.f145744p = Collections.singletonList(bArr);
                C34610p c34610p = new C34610p(c34608o);
                ((InterfaceC33639k0) this.f2594h).mo36173a(c34610p);
                int i16 = c34610p.f145785p;
                if (i16 == -1) {
                    throw new IllegalStateException();
                }
                c31271g.getClass();
                AbstractC35849g.m113807i(i16 >= 0);
                c31271g.f128784a = i16;
                c31271g.m96290b(i16);
                this.f2589c = true;
            }
        }
        if (c0704y5.m1757b(i14)) {
            c38059n.m121844D(AbstractC39319n.m125287n(c0704y5.f2667f, (byte[]) c0704y5.f2666e), (byte[]) c0704y5.f2666e);
            c38059n.m121847G(5);
            c31271g.m96289a(j13, c38059n);
        }
        if (c0704y4.m1757b(i14)) {
            c38059n.m121844D(AbstractC39319n.m125287n(c0704y4.f2667f, (byte[]) c0704y4.f2666e), (byte[]) c0704y4.f2666e);
            c38059n.m121847G(5);
            c31271g.m96289a(j13, c38059n);
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public void mo1664c(C38059n c38059n) {
        int i13;
        AbstractC35849g.m113808j((InterfaceC33639k0) this.f2594h);
        int i14 = AbstractC38065t.f163031a;
        while (c38059n.m121848a() > 0) {
            int i15 = c38059n.f163018b;
            int i16 = c38059n.f163019c;
            byte[] bArr = c38059n.f163017a;
            this.f2591e += (long) c38059n.m121848a();
            ((InterfaceC33639k0) this.f2594h).mo36176d(c38059n, c38059n.m121848a(), 0);
            while (i15 < i16) {
                int iM125276c = AbstractC39319n.m125276c(bArr, i15, i16, this.f2590d);
                if (iM125276c == i16) {
                    m1754j(bArr, i15, i16);
                    return;
                }
                int i17 = (bArr[iM125276c + 3] & 126) >> 1;
                if (iM125276c <= 0 || bArr[iM125276c - 1] != 0) {
                    i13 = 3;
                } else {
                    iM125276c--;
                    i13 = 4;
                }
                int i18 = iM125276c;
                int i19 = i13;
                int i24 = i18 - i15;
                if (i24 > 0) {
                    m1754j(bArr, i15, i18);
                }
                int i25 = i16 - i18;
                long j7 = this.f2591e - ((long) i25);
                m1753b(i25, i24 < 0 ? -i24 : 0, j7, this.f2592f);
                m1755k(i25, i17, j7, this.f2592f);
                i15 = i18 + i19;
            }
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        switch (this.f2587a) {
            case 0:
                this.f2592f = j7;
                break;
            default:
                if (j7 != -9223372036854775807L) {
                    this.f2592f = j7;
                }
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public void mo1666e(boolean z4) {
        AbstractC35849g.m113808j((InterfaceC33639k0) this.f2594h);
        int i13 = AbstractC38065t.f163031a;
        if (z4) {
            ((C31271g) ((C0352d) this.f2593g).f1239z).m96290b(0);
            m1753b(0, 0, this.f2591e, this.f2592f);
            m1755k(0, 48, this.f2591e, this.f2592f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0375  */
    /* JADX WARN: Code duplicated, block: B:171:0x037e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0389  */
    /* JADX WARN: Code duplicated, block: B:176:0x0394  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:183:0x03df  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:188:0x040a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0413  */
    /* JADX WARN: Code duplicated, block: B:196:0x044a  */
    /* JADX WARN: Code duplicated, block: B:218:0x0494  */
    /* JADX WARN: Code duplicated, block: B:221:0x049a  */
    /* JADX WARN: Code duplicated, block: B:224:0x049f  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:231:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public void mo1711f(C13117a c13117a) {
        byte[] bArr;
        InterfaceC37377s[] interfaceC37377sArr;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        C0704y c0704y;
        int i13;
        float f13;
        C0704y c0704y2 = (C0704y) this.f2599m;
        C0704y c0704y3 = (C0704y) this.f2600n;
        C0704y c0704y4 = (C0704y) this.f2596j;
        C0704y c0704y5 = (C0704y) this.f2597k;
        C0704y c0704y6 = (C0704y) this.f2598l;
        AbstractC24543a.m71574j((InterfaceC37377s) this.f2594h);
        int i14 = AbstractC24567y.f95875a;
        while (c13117a.m36692a() > 0) {
            int i15 = c13117a.f45382b;
            int i16 = c13117a.f45383c;
            byte[] bArr2 = c13117a.f45381a;
            this.f2591e += (long) c13117a.m36692a();
            ((InterfaceC37377s) this.f2594h).mo102732c(c13117a.m36692a(), c13117a);
            while (i15 < i16) {
                int iM71580p = AbstractC24543a.m71580p(bArr2, i15, i16, this.f2590d);
                if (iM71580p == i16) {
                    m1754j(bArr2, i15, i16);
                    return;
                }
                int i17 = iM71580p + 3;
                int i18 = (bArr2[i17] & 126) >> 1;
                int i19 = iM71580p - i15;
                if (i19 > 0) {
                    m1754j(bArr2, i15, iM71580p);
                }
                int i24 = i16 - iM71580p;
                long j7 = this.f2591e - ((long) i24);
                int i25 = i19 < 0 ? -i19 : 0;
                long j13 = this.f2592f;
                InterfaceC37377s[] interfaceC37377sArr2 = (InterfaceC37377s[]) ((C20378c) this.f2593g).f76423y;
                C13117a c13117a2 = (C13117a) this.f2601o;
                C0698s c0698s = (C0698s) this.f2595i;
                int i26 = i16;
                boolean z16 = this.f2589c;
                if (c0698s.f2582i && c0698s.f2579f) {
                    c0698s.f2585l = c0698s.f2575b;
                    c0698s.f2582i = false;
                } else {
                    if (c0698s.f2580g || c0698s.f2579f) {
                        if (z16 && c0698s.f2581h) {
                            bArr = bArr2;
                            long j14 = c0698s.f2574a;
                            int i27 = i24 + ((int) (j7 - j14));
                            long j15 = c0698s.f2584k;
                            if (j15 != -9223372036854775807L) {
                                ((InterfaceC37377s) c0698s.f2586m).mo102733d(j15, c0698s.f2585l ? 1 : 0, (int) (j14 - c0698s.f2583j), i27, null);
                            }
                        } else {
                            bArr = bArr2;
                        }
                        c0698s.f2583j = c0698s.f2574a;
                        c0698s.f2584k = c0698s.f2577d;
                        c0698s.f2585l = c0698s.f2575b;
                        c0698s.f2581h = true;
                    }
                    if (this.f2589c) {
                        c0704y6 = c0704y6;
                    } else {
                        c0704y4.m1757b(i25);
                        c0704y5.m1757b(i25);
                        c0704y6.m1757b(i25);
                        if (!c0704y4.f2665d && c0704y5.f2665d && c0704y6.f2665d) {
                            InterfaceC37377s interfaceC37377s = (InterfaceC37377s) this.f2594h;
                            String str = this.f2588b;
                            int i28 = c0704y4.f2667f;
                            byte[] bArr3 = new byte[c0704y5.f2667f + i28 + c0704y6.f2667f];
                            System.arraycopy((byte[]) c0704y4.f2666e, 0, bArr3, 0, i28);
                            System.arraycopy((byte[]) c0704y5.f2666e, 0, bArr3, c0704y4.f2667f, c0704y5.f2667f);
                            System.arraycopy((byte[]) c0704y6.f2666e, 0, bArr3, c0704y4.f2667f + c0704y5.f2667f, c0704y6.f2667f);
                            C24561s c24561s = new C24561s(0, c0704y5.f2667f, 1, (byte[]) c0704y5.f2666e);
                            c24561s.m71643t(44);
                            int iM71632i = c24561s.m71632i(3);
                            c24561s.m71642s();
                            int iM71632i2 = c24561s.m71632i(2);
                            boolean zM71631h = c24561s.m71631h();
                            int iM71632i3 = c24561s.m71632i(5);
                            int i29 = 0;
                            for (int i34 = 0; i34 < 32; i34++) {
                                if (c24561s.m71631h()) {
                                    i29 |= 1 << i34;
                                }
                            }
                            int[] iArr = new int[6];
                            for (int i35 = 0; i35 < 6; i35++) {
                                iArr[i35] = c24561s.m71632i(8);
                            }
                            int iM71632i4 = c24561s.m71632i(8);
                            int i36 = 0;
                            for (int i37 = 0; i37 < iM71632i; i37++) {
                                if (c24561s.m71631h()) {
                                    i36 += 89;
                                }
                                if (c24561s.m71631h()) {
                                    i36 += 8;
                                }
                            }
                            c24561s.m71643t(i36);
                            if (iM71632i > 0) {
                                c24561s.m71643t((8 - iM71632i) * 2);
                            }
                            c24561s.m71636m();
                            int iM71636m = c24561s.m71636m();
                            if (iM71636m == 3) {
                                c24561s.m71642s();
                            }
                            int iM71636m2 = c24561s.m71636m();
                            int iM71636m3 = c24561s.m71636m();
                            if (c24561s.m71631h()) {
                                int iM71636m4 = c24561s.m71636m();
                                int iM71636m5 = c24561s.m71636m();
                                int iM71636m6 = c24561s.m71636m();
                                int iM71636m7 = c24561s.m71636m();
                                iM71636m2 -= (iM71636m4 + iM71636m5) * ((iM71636m == 1 || iM71636m == 2) ? 2 : 1);
                                iM71636m3 -= (iM71636m6 + iM71636m7) * (iM71636m == 1 ? 2 : 1);
                            }
                            c24561s.m71636m();
                            c24561s.m71636m();
                            int iM71636m8 = c24561s.m71636m();
                            for (int i38 = c24561s.m71631h() ? 0 : iM71632i; i38 <= iM71632i; i38++) {
                                c24561s.m71636m();
                                c24561s.m71636m();
                                c24561s.m71636m();
                            }
                            c24561s.m71636m();
                            c24561s.m71636m();
                            c24561s.m71636m();
                            c24561s.m71636m();
                            c24561s.m71636m();
                            c24561s.m71636m();
                            int i39 = 4;
                            if (c24561s.m71631h() && c24561s.m71631h()) {
                                int i44 = 0;
                                while (i44 < i39) {
                                    int i45 = i39;
                                    int i46 = iM71636m8;
                                    for (int i47 = 0; i47 < 6; i47 += i44 == 3 ? 3 : 1) {
                                        if (c24561s.m71631h()) {
                                            int iMin = Math.min(64, 1 << ((i44 << 1) + 4));
                                            if (i44 > 1) {
                                                c24561s.m71637n();
                                            }
                                            for (int i48 = 0; i48 < iMin; i48++) {
                                                c24561s.m71637n();
                                            }
                                        } else {
                                            c24561s.m71636m();
                                        }
                                    }
                                    i44++;
                                    i39 = i45;
                                    iM71636m8 = i46;
                                }
                            }
                            int i49 = i39;
                            int i54 = iM71636m8;
                            c24561s.m71643t(2);
                            if (c24561s.m71631h()) {
                                c24561s.m71643t(8);
                                c24561s.m71636m();
                                c24561s.m71636m();
                                c24561s.m71642s();
                            }
                            int i55 = 0;
                            int i56 = 0;
                            boolean zM71631h2 = false;
                            for (int iM71636m9 = c24561s.m71636m(); i55 < iM71636m9; iM71636m9 = iM71636m9) {
                                if (i55 != 0) {
                                    zM71631h2 = c24561s.m71631h();
                                }
                                if (zM71631h2) {
                                    c24561s.m71642s();
                                    c24561s.m71636m();
                                    for (int i57 = 0; i57 <= i56; i57++) {
                                        if (c24561s.m71631h()) {
                                            c24561s.m71642s();
                                        }
                                    }
                                } else {
                                    int iM71636m10 = c24561s.m71636m();
                                    int iM71636m11 = c24561s.m71636m();
                                    int i58 = iM71636m10 + iM71636m11;
                                    for (int i59 = 0; i59 < iM71636m10; i59++) {
                                        c24561s.m71636m();
                                        c24561s.m71642s();
                                    }
                                    for (int i64 = 0; i64 < iM71636m11; i64++) {
                                        c24561s.m71636m();
                                        c24561s.m71642s();
                                    }
                                    i56 = i58;
                                }
                                i55++;
                            }
                            if (c24561s.m71631h()) {
                                for (int i65 = 0; i65 < c24561s.m71636m(); i65++) {
                                    c24561s.m71643t(i54 + 5);
                                }
                            }
                            c24561s.m71643t(2);
                            if (c24561s.m71631h()) {
                                if (c24561s.m71631h()) {
                                    int iM71632i5 = c24561s.m71632i(8);
                                    if (iM71632i5 == 255) {
                                        int iM71632i6 = c24561s.m71632i(16);
                                        int iM71632i7 = c24561s.m71632i(16);
                                        f13 = (iM71632i6 == 0 || iM71632i7 == 0) ? 1.0f : iM71632i6 / iM71632i7;
                                    } else {
                                        float[] fArr = AbstractC24543a.f95800d;
                                        if (iM71632i5 < 17) {
                                            f13 = fArr[iM71632i5];
                                        } else {
                                            AbstractC30007c.m91850t(46, iM71632i5, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                        }
                                    }
                                    c0704y6 = c0704y6;
                                    if (c24561s.m71631h()) {
                                        c24561s.m71642s();
                                    }
                                    if (c24561s.m71631h()) {
                                        c24561s.m71643t(i49);
                                        if (c24561s.m71631h()) {
                                            c24561s.m71643t(24);
                                        }
                                    }
                                    if (c24561s.m71631h()) {
                                        c24561s.m71636m();
                                        c24561s.m71636m();
                                    }
                                    c24561s.m71642s();
                                    if (c24561s.m71631h()) {
                                        iM71636m3 *= 2;
                                    }
                                    i13 = iM71636m3;
                                }
                                f13 = 1.0f;
                                if (c24561s.m71631h()) {
                                    c24561s.m71642s();
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(i49);
                                    if (c24561s.m71631h()) {
                                        c24561s.m71643t(24);
                                    }
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71636m();
                                    c24561s.m71636m();
                                }
                                c24561s.m71642s();
                                if (c24561s.m71631h()) {
                                    iM71636m3 *= 2;
                                }
                                i13 = iM71636m3;
                            } else {
                                c0704y6 = c0704y6;
                                i13 = iM71636m3;
                                f13 = 1.0f;
                            }
                            String strM71568d = AbstractC24543a.m71568d(iM71632i2, zM71631h, iM71632i3, i29, iArr, iM71632i4);
                            C31518b0 c31518b0 = new C31518b0();
                            c31518b0.f130037a = str;
                            c31518b0.f130047k = "video/hevc";
                            c31518b0.f130044h = strM71568d;
                            c31518b0.f130052p = iM71636m2;
                            c31518b0.f130053q = i13;
                            c31518b0.f130056t = f13;
                            c31518b0.f130049m = Collections.singletonList(bArr3);
                            interfaceC37377s.mo102730a(new C31521c0(c31518b0));
                            this.f2589c = true;
                        } else {
                            c0704y6 = c0704y6;
                        }
                    }
                    if (c0704y2.m1757b(i25)) {
                        c13117a2.m36687I(AbstractC24543a.m71563E(c0704y2.f2667f, (byte[]) c0704y2.f2666e), (byte[]) c0704y2.f2666e);
                        c13117a2.m36690L(5);
                        interfaceC37377sArr = interfaceC37377sArr2;
                        AbstractC32123d.m100022b(j13, c13117a2, interfaceC37377sArr);
                    } else {
                        interfaceC37377sArr = r7;
                    }
                    c0704y3 = c0704y3;
                    if (c0704y3.m1757b(i25)) {
                        c13117a2.m36687I(AbstractC24543a.m71563E(c0704y3.f2667f, (byte[]) c0704y3.f2666e), (byte[]) c0704y3.f2666e);
                        c13117a2.m36690L(5);
                        AbstractC32123d.m100022b(j13, c13117a2, interfaceC37377sArr);
                    }
                    long j16 = this.f2592f;
                    C0698s c0698s2 = (C0698s) this.f2595i;
                    boolean z17 = this.f2589c;
                    c0698s2.f2579f = false;
                    c0698s2.f2580g = false;
                    c0698s2.f2577d = j16;
                    c0698s2.f2576c = 0;
                    c0698s2.f2574a = j7;
                    if (i18 >= 32 || i18 == 40) {
                        z4 = false;
                    } else {
                        if (!c0698s2.f2581h || c0698s2.f2582i) {
                            z4 = false;
                        } else {
                            if (z17) {
                                long j17 = c0698s2.f2584k;
                                if (j17 != -9223372036854775807L) {
                                    ((InterfaceC37377s) c0698s2.f2586m).mo102733d(j17, c0698s2.f2585l ? 1 : 0, (int) (j7 - c0698s2.f2583j), i24, null);
                                }
                            }
                            z4 = false;
                            c0698s2.f2581h = false;
                        }
                        if ((32 <= i18 && i18 <= 35) || i18 == 39) {
                            z13 = true;
                            c0698s2.f2580g = !c0698s2.f2582i;
                            c0698s2.f2582i = true;
                        }
                        if (i18 >= 16 || i18 > 21) {
                            z14 = z4;
                        } else {
                            z14 = z13;
                        }
                        c0698s2.f2575b = z14;
                        if (!z14 || i18 <= 9) {
                            z15 = z13;
                        } else {
                            z15 = z4;
                        }
                        c0698s2.f2578e = z15;
                        if (this.f2589c) {
                            c0704y = c0704y6;
                        } else {
                            c0704y4.m1760e(i18);
                            c0704y5.m1760e(i18);
                            c0704y = c0704y6;
                            c0704y.m1760e(i18);
                        }
                        c0704y2.m1760e(i18);
                        c0704y3.m1760e(i18);
                        c0704y6 = c0704y;
                        i15 = i17;
                        i16 = i26;
                        bArr2 = bArr;
                    }
                    z13 = true;
                    if (i18 >= 16) {
                        z14 = z4;
                    } else {
                        z14 = z4;
                    }
                    c0698s2.f2575b = z14;
                    if (z14) {
                        z15 = z13;
                    } else {
                        z15 = z13;
                    }
                    c0698s2.f2578e = z15;
                    if (this.f2589c) {
                        c0704y4.m1760e(i18);
                        c0704y5.m1760e(i18);
                        c0704y = c0704y6;
                        c0704y.m1760e(i18);
                    } else {
                        c0704y = c0704y6;
                    }
                    c0704y2.m1760e(i18);
                    c0704y3.m1760e(i18);
                    c0704y6 = c0704y;
                    i15 = i17;
                    i16 = i26;
                    bArr2 = bArr;
                }
                bArr = bArr2;
                if (this.f2589c) {
                    c0704y4.m1757b(i25);
                    c0704y5.m1757b(i25);
                    c0704y6.m1757b(i25);
                    if (!c0704y4.f2665d) {
                        c0704y6 = c0704y6;
                    } else {
                        c0704y6 = c0704y6;
                    }
                } else {
                    c0704y6 = c0704y6;
                }
                if (c0704y2.m1757b(i25)) {
                    c13117a2.m36687I(AbstractC24543a.m71563E(c0704y2.f2667f, (byte[]) c0704y2.f2666e), (byte[]) c0704y2.f2666e);
                    c13117a2.m36690L(5);
                    interfaceC37377sArr = interfaceC37377sArr2;
                    AbstractC32123d.m100022b(j13, c13117a2, interfaceC37377sArr);
                } else {
                    interfaceC37377sArr = r7;
                }
                c0704y3 = c0704y3;
                if (c0704y3.m1757b(i25)) {
                    c13117a2.m36687I(AbstractC24543a.m71563E(c0704y3.f2667f, (byte[]) c0704y3.f2666e), (byte[]) c0704y3.f2666e);
                    c13117a2.m36690L(5);
                    AbstractC32123d.m100022b(j13, c13117a2, interfaceC37377sArr);
                }
                long j18 = this.f2592f;
                C0698s c0698s3 = (C0698s) this.f2595i;
                boolean z18 = this.f2589c;
                c0698s3.f2579f = false;
                c0698s3.f2580g = false;
                c0698s3.f2577d = j18;
                c0698s3.f2576c = 0;
                c0698s3.f2574a = j7;
                if (i18 >= 32) {
                    z4 = false;
                    z13 = true;
                } else {
                    z4 = false;
                    z13 = true;
                }
                if (i18 >= 16) {
                    z14 = z4;
                } else {
                    z14 = z4;
                }
                c0698s3.f2575b = z14;
                if (z14) {
                    z15 = z13;
                } else {
                    z15 = z13;
                }
                c0698s3.f2578e = z15;
                if (this.f2589c) {
                    c0704y4.m1760e(i18);
                    c0704y5.m1760e(i18);
                    c0704y = c0704y6;
                    c0704y.m1760e(i18);
                } else {
                    c0704y = c0704y6;
                }
                c0704y2.m1760e(i18);
                c0704y3.m1760e(i18);
                c0704y6 = c0704y;
                i15 = i17;
                i16 = i26;
                bArr2 = bArr;
            }
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2588b = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 2);
        this.f2594h = interfaceC37377sMo3102o;
        this.f2595i = new C0698s(interfaceC37377sMo3102o);
        ((C20378c) this.f2593g).m56586o(interfaceC37369k, c0690l0);
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public void mo1713h() {
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2588b = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 2);
        this.f2594h = interfaceC33639k0Mo3101o;
        this.f2595i = new C0698s(interfaceC33639k0Mo3101o);
        ((C0352d) this.f2593g).m936h(interfaceC33648q, c0690l0);
    }

    /* JADX INFO: renamed from: j */
    public final void m1754j(byte[] bArr, int i13, int i14) {
        switch (this.f2587a) {
            case 0:
                C0698s c0698s = (C0698s) this.f2595i;
                if (c0698s.f2578e) {
                    int i15 = c0698s.f2576c;
                    int i16 = (i13 + 2) - i15;
                    if (i16 < i14) {
                        c0698s.f2579f = (bArr[i16] & 128) != 0;
                        c0698s.f2578e = false;
                    } else {
                        c0698s.f2576c = (i14 - i13) + i15;
                    }
                }
                if (!this.f2589c) {
                    ((C0704y) this.f2596j).m1756a(bArr, i13, i14);
                    ((C0704y) this.f2597k).m1756a(bArr, i13, i14);
                    ((C0704y) this.f2598l).m1756a(bArr, i13, i14);
                }
                ((C0704y) this.f2599m).m1756a(bArr, i13, i14);
                ((C0704y) this.f2600n).m1756a(bArr, i13, i14);
                break;
            default:
                C0698s c0698s2 = (C0698s) this.f2595i;
                if (c0698s2.f2578e) {
                    int i17 = c0698s2.f2576c;
                    int i18 = (i13 + 2) - i17;
                    if (i18 < i14) {
                        c0698s2.f2579f = (bArr[i18] & 128) != 0;
                        c0698s2.f2578e = false;
                    } else {
                        c0698s2.f2576c = (i14 - i13) + i17;
                    }
                }
                if (!this.f2589c) {
                    ((C0704y) this.f2596j).m1756a(bArr, i13, i14);
                    ((C0704y) this.f2597k).m1756a(bArr, i13, i14);
                    ((C0704y) this.f2598l).m1756a(bArr, i13, i14);
                }
                ((C0704y) this.f2599m).m1756a(bArr, i13, i14);
                ((C0704y) this.f2600n).m1756a(bArr, i13, i14);
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1755k(int i13, int i14, long j7, long j13) {
        C0698s c0698s = (C0698s) this.f2595i;
        boolean z4 = this.f2589c;
        c0698s.f2579f = false;
        c0698s.f2580g = false;
        c0698s.f2577d = j13;
        c0698s.f2576c = 0;
        c0698s.f2574a = j7;
        if (i14 >= 32 && i14 != 40) {
            if (c0698s.f2581h && !c0698s.f2582i) {
                if (z4) {
                    c0698s.m1752a(i13);
                }
                c0698s.f2581h = false;
            }
            if ((32 <= i14 && i14 <= 35) || i14 == 39) {
                c0698s.f2580g = !c0698s.f2582i;
                c0698s.f2582i = true;
            }
        }
        boolean z13 = i14 >= 16 && i14 <= 21;
        c0698s.f2575b = z13;
        c0698s.f2578e = z13 || i14 <= 9;
        if (!this.f2589c) {
            ((C0704y) this.f2596j).m1760e(i14);
            ((C0704y) this.f2597k).m1760e(i14);
            ((C0704y) this.f2598l).m1760e(i14);
        }
        ((C0704y) this.f2599m).m1760e(i14);
        ((C0704y) this.f2600n).m1760e(i14);
    }

    public C0699t(C20378c c20378c) {
        this.f2587a = 1;
        this.f2593g = c20378c;
        this.f2590d = new boolean[3];
        this.f2596j = new C0704y(32, 1);
        this.f2597k = new C0704y(33, 1);
        this.f2598l = new C0704y(34, 1);
        this.f2599m = new C0704y(39, 1);
        this.f2600n = new C0704y(40, 1);
        this.f2592f = -9223372036854775807L;
        this.f2601o = new C13117a();
    }
}
