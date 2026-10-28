package p180h0;

import android.view.ViewConfiguration;
import bc3.AbstractC3006f0;
import bm.C3384h;
import c93.InterfaceC4351m;
import e10.C12554k0;
import g20.C15270p;
import go1.C16016a;
import java.util.Collection;
import l83.C23454a0;
import p005a3.InterfaceC0225m;
import p077d0.C11362i1;
import p077d0.InterfaceC11372l;
import p095dp.AbstractC12240d;
import p132f0.EnumC13840z0;
import p133f1.C13985v0;
import p163g1.C15031h7;
import p181h2.C16617b;
import p268k0.AbstractC22086a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p512u2.C34460g0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p705ea2.C12906g;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.q3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16444q3 {

    /* JADX INFO: renamed from: a */
    public static final C16016a f63185a = new C16016a(23);

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final boolean m46619a(InterfaceC34449b interfaceC34449b) {
        ?? r10 = ((C34460g0) interfaceC34449b).f144774F.f144784T.f144800a;
        int size = ((Collection) r10).size();
        boolean z4 = false;
        for (int i13 = 0; i13 < size; i13++) {
            if (((C34472r) r10.get(i13)).f144818d) {
                z4 = true;
                break;
            }
        }
        return !z4;
    }

    /* JADX INFO: renamed from: b */
    public static final float m46620b(long j7) {
        int i13 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i13) == 0.0f && Float.intBitsToFloat((int) (j7 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j7 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m46621c(InterfaceC16478x2 interfaceC16478x2, float f13, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d) {
        C16403i2 c16403i2;
        C22663d0 c22663d0;
        if (interfaceC30057d instanceof C16403i2) {
            c16403i2 = (C16403i2) interfaceC30057d;
            int i13 = c16403i2.f63053y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16403i2.f63053y = i13 - Integer.MIN_VALUE;
            } else {
                c16403i2 = new C16403i2(interfaceC30057d);
            }
        } else {
            c16403i2 = new C16403i2(interfaceC30057d);
        }
        Object obj = c16403i2.f63052x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c16403i2.f63053y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22663d0 c22663d1 = new C22663d0();
            InterfaceC4351m c15031h7 = new C15031h7(f13, interfaceC11372l, c22663d1, null);
            c16403i2.f63051w = c22663d1;
            c16403i2.f63053y = 1;
            if (interfaceC16478x2.mo9764a(EnumC13840z0.f49374w, c15031h7, c16403i2) == obj2) {
                return obj2;
            }
            c22663d0 = c22663d1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = c16403i2.f63051w;
            AbstractC34132o.m107864I(obj);
        }
        return new Float(c22663d0.f89331w);
    }

    /* JADX INFO: renamed from: e */
    public static Object m46623e(InterfaceC16361a4 interfaceC16361a4, float f13, AbstractC32275i abstractC32275i) {
        InterfaceC30057d interfaceC30057d = null;
        C11362i1 c11362i1 = new C11362i1(interfaceC30057d, 5);
        if (f13 <= 0.0f) {
            AbstractC22086a.m63158a("zoom value should be greater than 0");
        }
        C22663d0 c22663d0 = new C22663d0();
        c22663d0.f89331w = 1.0f;
        C15031h7 c15031h7 = new C15031h7(c22663d0, f13, c11362i1, interfaceC30057d, 2);
        EnumC13840z0 enumC13840z0 = EnumC13840z0.f49374w;
        C16386f0 c16386f0 = (C16386f0) interfaceC16361a4;
        c16386f0.getClass();
        Object objM8719m = AbstractC3006f0.m8719m(new C15270p(c16386f0, enumC13840z0, c15031h7, (InterfaceC30057d) null), abstractC32275i);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM8719m != enumC31071a) {
            objM8719m = c23454a0;
        }
        return objM8719m == enumC31071a ? objM8719m : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067 A[LOOP:0: B:20:0x005a->B:24:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003f A[EDGE_INSN: B:28:0x003f->B:16:0x003f BREAK  A[LOOP:0: B:20:0x005a->B:24:0x0067], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:19:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m46624f(p512u2.InterfaceC34449b r7, p512u2.EnumC34466l r8, s83.AbstractC32267a r9) {
        /*
            boolean r0 = r9 instanceof p180h0.C16442q1
            if (r0 == 0) goto L13
            r0 = r9
            h0.q1 r0 = (p180h0.C16442q1) r0
            int r1 = r0.f63180z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63180z = r1
            goto L18
        L13:
            h0.q1 r0 = new h0.q1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f63179y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f63180z
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            u2.l r7 = r0.f63178x
            u2.b r8 = r0.f63177w
            p505ts.AbstractC34132o.m107864I(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p505ts.AbstractC34132o.m107864I(r9)
            boolean r9 = m46619a(r7)
            if (r9 != 0) goto L6a
        L3f:
            r0.f63177w = r7
            r0.f63178x = r8
            r0.f63180z = r3
            u2.g0 r7 = (p512u2.C34460g0) r7
            java.lang.Object r9 = r7.m108928a(r8, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            u2.k r9 = (p512u2.C34465k) r9
            java.lang.Object r9 = r9.f144800a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L5a:
            if (r4 >= r2) goto L6a
            java.lang.Object r5 = r9.get(r4)
            u2.r r5 = (p512u2.C34472r) r5
            boolean r5 = r5.f144818d
            if (r5 == 0) goto L67
            goto L3f
        L67:
            int r4 = r4 + 1
            goto L5a
        L6a:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.AbstractC16444q3.m46624f(u2.b, u2.l, s83.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static final Object m46625g(InterfaceC34476v interfaceC34476v, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        Object objM108934X0 = ((C34462h0) interfaceC34476v).m108934X0(new C13985v0(interfaceC30057d.getContext(), interfaceC4351m, (InterfaceC30057d) null), interfaceC30057d);
        return objM108934X0 == EnumC31071a.f128113w ? objM108934X0 : C23454a0.f92919a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public static final long m46626h(C34465k c34465k, boolean z4) {
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        long jM47192h = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            C34472r c34472r = (C34472r) r10.get(i14);
            if (c34472r.f144818d && c34472r.f144822h) {
                jM47192h = C16617b.m47192h(jM47192h, z4 ? c34472r.f144817c : c34472r.f144821g);
                i13++;
            }
        }
        if (i13 == 0) {
            return 9205357640488583168L;
        }
        return C16617b.m47186b(i13, jM47192h);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    public static final float m46627i(C34465k c34465k, boolean z4) {
        long jM46626h = m46626h(c34465k, z4);
        float fM47188d = 0.0f;
        if (C16617b.m47187c(jM46626h, 9205357640488583168L)) {
            return 0.0f;
        }
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            C34472r c34472r = (C34472r) r10.get(i14);
            if (c34472r.f144818d && c34472r.f144822h) {
                i13++;
                fM47188d = C16617b.m47188d(C16617b.m47191g(z4 ? c34472r.f144817c : c34472r.f144821g, jM46626h)) + fM47188d;
            }
        }
        return fM47188d / i13;
    }

    /* JADX INFO: renamed from: j */
    public static final long m46628j(C34465k c34465k) {
        long jM46626h = m46626h(c34465k, true);
        if (C16617b.m47187c(jM46626h, 9205357640488583168L)) {
            return 0L;
        }
        return C16617b.m47191g(jM46626h, m46626h(c34465k, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    public static final float m46629k(C34465k c34465k) {
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 1;
            if (i13 >= size) {
                break;
            }
            C34472r c34472r = (C34472r) r10.get(i13);
            if (!c34472r.f144822h || !c34472r.f144818d) {
                i15 = 0;
            }
            i14 += i15;
            i13++;
        }
        if (i14 >= 2) {
            long jM46626h = m46626h(c34465k, true);
            long jM46626h2 = m46626h(c34465k, false);
            int size2 = ((Collection) r10).size();
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (int i16 = 0; i16 < size2; i16++) {
                C34472r c34472r2 = (C34472r) r10.get(i16);
                if (c34472r2.f144818d && c34472r2.f144822h) {
                    long j7 = c34472r2.f144817c;
                    long jM47191g = C16617b.m47191g(c34472r2.f144821g, jM46626h2);
                    long jM47191g2 = C16617b.m47191g(j7, jM46626h);
                    float fM46620b = m46620b(jM47191g2) - m46620b(jM47191g);
                    float fM47188d = C16617b.m47188d(C16617b.m47192h(jM47191g2, jM47191g)) / 2.0f;
                    if (fM46620b > 180.0f) {
                        fM46620b -= 360.0f;
                    } else if (fM46620b < -180.0f) {
                        fM46620b += 360.0f;
                    }
                    f14 += fM46620b * fM47188d;
                    f13 += fM47188d;
                }
            }
            if (f13 != 0.0f) {
                return f14 / f13;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public static final float m46630l(C34465k c34465k) {
        float fM46627i = m46627i(c34465k, true);
        float fM46627i2 = m46627i(c34465k, false);
        if (fM46627i == 0.0f || fM46627i2 == 0.0f) {
            return 1.0f;
        }
        return fM46627i / fM46627i2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:49|27|(3:30|31|(0)(1:34))|46) */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r4 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r2 = r10;
        r10 = r12;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r4 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        if (r12 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r12 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [u2.v] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [q83.j] */
    /* JADX WARN: Type inference failed for: r10v12, types: [q83.j] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [q83.j] */
    /* JADX WARN: Type inference failed for: r10v3, types: [q83.j] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, u2.v] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r11v3, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r11v9, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r12v10, types: [q83.j] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [u2.v] */
    /* JADX WARN: Type inference failed for: r2v12, types: [u2.v] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [u2.v] */
    /* JADX WARN: Type inference failed for: r2v3, types: [u2.v] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m46631m(p512u2.InterfaceC34476v r10, c93.InterfaceC4351m r11, q83.InterfaceC30057d r12) {
        /*
            boolean r0 = r12 instanceof p180h0.C16447r1
            if (r0 == 0) goto L13
            r0 = r12
            h0.r1 r0 = (p180h0.C16447r1) r0
            int r1 = r0.f63197E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63197E = r1
            goto L18
        L13:
            h0.r1 r0 = new h0.r1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f63201z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f63197E
            r3 = 0
            l83.a0 r4 = l83.C23454a0.f92919a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L56
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            q83.j r10 = r0.f63200y
            c93.m r11 = r0.f63199x
            u2.v r2 = r0.f63198w
            p505ts.AbstractC34132o.m107864I(r12)
            goto L47
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            q83.j r10 = r0.f63200y
            c93.m r11 = r0.f63199x
            u2.v r2 = r0.f63198w
            p505ts.AbstractC34132o.m107864I(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
        L47:
            r12 = r10
            r10 = r2
            goto L5d
        L4a:
            r12 = move-exception
            goto L96
        L4c:
            q83.j r10 = r0.f63200y
            c93.m r11 = r0.f63199x
            u2.v r2 = r0.f63198w
            p505ts.AbstractC34132o.m107864I(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
            goto L74
        L56:
            p505ts.AbstractC34132o.m107864I(r12)
            q83.j r12 = r0.getContext()
        L5d:
            boolean r2 = bc3.AbstractC3006f0.m8730x(r12)
            if (r2 == 0) goto Lba
            r0.f63198w = r10     // Catch: java.util.concurrent.CancellationException -> L91
            r0.f63199x = r11     // Catch: java.util.concurrent.CancellationException -> L91
            r0.f63200y = r12     // Catch: java.util.concurrent.CancellationException -> L91
            r0.f63197E = r7     // Catch: java.util.concurrent.CancellationException -> L91
            java.lang.Object r2 = r11.invoke(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L91
            if (r2 != r1) goto L72
            goto Lb8
        L72:
            r2 = r10
            r10 = r12
        L74:
            r0.f63198w = r2     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f63199x = r11     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f63200y = r10     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f63197E = r6     // Catch: java.util.concurrent.CancellationException -> L4a
            h0.p1 r12 = new h0.p1     // Catch: java.util.concurrent.CancellationException -> L4a
            r12.<init>(r6, r3)     // Catch: java.util.concurrent.CancellationException -> L4a
            r8 = r2
            u2.h0 r8 = (p512u2.C34462h0) r8     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r12 = r8.m108934X0(r12, r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            r83.a r8 = r83.EnumC31071a.f128113w     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r12 != r8) goto L8d
            goto L8e
        L8d:
            r12 = r4
        L8e:
            if (r12 != r1) goto L47
            goto Lb8
        L91:
            r2 = move-exception
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
        L96:
            boolean r8 = bc3.AbstractC3006f0.m8730x(r10)
            if (r8 == 0) goto Lb9
            r0.f63198w = r2
            r0.f63199x = r11
            r0.f63200y = r10
            r0.f63197E = r5
            h0.p1 r12 = new h0.p1
            r12.<init>(r6, r3)
            r8 = r2
            u2.h0 r8 = (p512u2.C34462h0) r8
            java.lang.Object r12 = r8.m108934X0(r12, r0)
            r83.a r8 = r83.EnumC31071a.f128113w
            if (r12 != r8) goto Lb5
            goto Lb6
        Lb5:
            r12 = r4
        Lb6:
            if (r12 != r1) goto L47
        Lb8:
            return r1
        Lb9:
            throw r12
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.AbstractC16444q3.m46631m(u2.v, c93.m, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public static final C12554k0 m46632n(InterfaceC0225m interfaceC0225m) {
        return new C12554k0(ViewConfiguration.get(AbstractC12240d.m34057W(interfaceC0225m).getContext()), 26);
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC16361a4 m46633o(Function3 function3, C28655q c28655q) {
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            C16386f0 c16386f0 = new C16386f0(new C12906g(4, interfaceC28601c1M87238F));
            c28655q.m87172p0(c16386f0);
            objM87133R = c16386f0;
        }
        return (InterfaceC16361a4) objM87133R;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public static final Object m46634p(InterfaceC16478x2 interfaceC16478x2, float f13, InterfaceC30057d interfaceC30057d) {
        C16408j2 c16408j2;
        C22663d0 c22663d0;
        if (interfaceC30057d instanceof C16408j2) {
            c16408j2 = (C16408j2) interfaceC30057d;
            int i13 = c16408j2.f63065y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16408j2.f63065y = i13 - Integer.MIN_VALUE;
            } else {
                c16408j2 = new C16408j2(interfaceC30057d);
            }
        } else {
            c16408j2 = new C16408j2(interfaceC30057d);
        }
        Object obj = c16408j2.f63064x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c16408j2.f63065y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22663d0 c22663d1 = new C22663d0();
            InterfaceC4351m c3384h = new C3384h(c22663d1, f13, null);
            c16408j2.f63063w = c22663d1;
            c16408j2.f63065y = 1;
            if (interfaceC16478x2.mo9764a(EnumC13840z0.f49374w, c3384h, c16408j2) == obj2) {
                return obj2;
            }
            c22663d0 = c22663d1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = c16408j2.f63063w;
            AbstractC34132o.m107864I(obj);
        }
        return new Float(c22663d0.f89331w);
    }
}
