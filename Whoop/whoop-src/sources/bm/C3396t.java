package bm;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.Iterator;
import java.util.ListIterator;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p132f0.EnumC13840z0;
import p180h0.InterfaceC16478x2;
import p329n0.C26061n;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p634y1.AbstractC39038k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: bm.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3396t implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: h */
    public static final C28539n0 f13251h = AbstractC39038k.m124456b(C3391o.f13237w, C3392p.f13238w);

    /* JADX INFO: renamed from: a */
    public final C26068u f13252a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f13253b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f13254c = AbstractC28683x.m87272z(0);

    /* JADX INFO: renamed from: d */
    public final C28612f0 f13255d = AbstractC28683x.m87264r(new C3394r(this, 1));

    /* JADX INFO: renamed from: e */
    public final C28612f0 f13256e = AbstractC28683x.m87264r(new C3394r(this, 0));

    /* JADX INFO: renamed from: f */
    public final C28633k1 f13257f = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: g */
    public final C28633k1 f13258g = AbstractC28683x.m87272z(null);

    public C3396t(int i13) {
        this.f13252a = new C26068u(i13, 2, 0);
        this.f13253b = AbstractC28683x.m87272z(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: n */
    public static void m9763n(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "page[", "] must be >= 0").toString());
        }
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: a */
    public final Object mo9764a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        Object objMo9764a = this.f13252a.mo9764a(enumC13840z0, interfaceC4351m, interfaceC30057d);
        return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return this.f13252a.f103226i.mo9765b();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return this.f13252a.f103226i.mo9766e(f13);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0100 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0128 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[Catch: all -> 0x0037, PHI: r0 r3 r11
      0x0151: PHI (r0v13 ??) = (r0v15 ??), (r0v16 ??) binds: [B:72:0x014e, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r3v19 int) = (r3v13 int), (r3v26 int) binds: [B:72:0x014e, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r11v15 bm.t) = (r11v12 bm.t), (r11v18 bm.t) binds: [B:72:0x014e, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0165 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0187 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:74:0x0151, B:75:0x015f, B:77:0x0165, B:81:0x0176, B:83:0x017a, B:85:0x0187, B:57:0x00d7, B:58:0x00e5, B:60:0x00eb, B:64:0x00fc, B:66:0x0100, B:69:0x011e, B:71:0x0128, B:48:0x00a3, B:50:0x00ae, B:53:0x00bf), top: B:97:0x0025 }] */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a1, code lost:
    
        if (r12.m77563f(r0, r3, r1) == r2) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [n0.u] */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2, types: [bm.t] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18, types: [int] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [n0.u] */
    /* JADX WARN: Type inference failed for: r12v31, types: [n0.u] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9767f(int r11, s83.AbstractC32269c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.C3396t.m9767f(int, s83.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final InterfaceC26054g m9768g() {
        Object objPrevious;
        ?? r10 = this.f13252a.m77565h().f103177k;
        ListIterator listIterator = r10.listIterator(r10.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (((C26062o) ((InterfaceC26054g) objPrevious)).getIndex() == m9774m()) {
                return (InterfaceC26054g) objPrevious;
            }
        }
        objPrevious = null;
        return (InterfaceC26054g) objPrevious;
    }

    /* JADX INFO: renamed from: h */
    public final float m9769h() {
        return ((Number) this.f13256e.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m9770i() {
        return ((Number) this.f13254c.getValue()).intValue();
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC26054g m9771j() {
        Object obj;
        C26061n c26061nM77565h = this.f13252a.m77565h();
        Iterator it = ((Iterable) c26061nM77565h.f103177k).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                C26062o c26062o = (C26062o) ((InterfaceC26054g) next);
                int iMax = Math.max(c26062o.m77551n(), 0);
                int iM77552o = c26062o.m77552o() + c26062o.m77551n();
                int i13 = c26061nM77565h.f103179m - c26061nM77565h.f103182p;
                int iMin = Math.min(iM77552o, i13) - iMax;
                do {
                    Object next2 = it.next();
                    C26062o c26062o2 = (C26062o) ((InterfaceC26054g) next2);
                    int iMin2 = Math.min(c26062o2.m77552o() + c26062o2.m77551n(), i13) - Math.max(c26062o2.m77551n(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (InterfaceC26054g) obj;
    }

    /* JADX INFO: renamed from: k */
    public final int m9772k() {
        return ((Number) this.f13255d.getValue()).intValue();
    }

    /* JADX INFO: renamed from: l */
    public final int m9773l() {
        Integer num = (Integer) this.f13257f.getValue();
        if (num != null) {
            return num.intValue();
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f13258g.getValue();
        Integer num2 = interfaceC4339a != null ? (Integer) interfaceC4339a.invoke() : null;
        if (num2 != null) {
            return num2.intValue();
        }
        if (this.f13252a.f103226i.mo9765b() && Math.abs(m9769h()) >= 0.001f) {
            if (m9769h() >= 0.0f) {
                int iM9774m = m9774m() + 1;
                int iM9772k = m9772k() - 1;
                return iM9774m > iM9772k ? iM9772k : iM9774m;
            }
            int iM9774m2 = m9774m() - 1;
            if (iM9774m2 < 0) {
                return 0;
            }
            return iM9774m2;
        }
        return m9774m();
    }

    /* JADX INFO: renamed from: m */
    public final int m9774m() {
        return ((Number) this.f13253b.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r7.mo9764a(p132f0.EnumC13840z0.f49374w, r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9775o(int r7, s83.AbstractC32269c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bm.C3395s
            if (r0 == 0) goto L13
            r0 = r8
            bm.s r0 = (bm.C3395s) r0
            int r1 = r0.f13250z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13250z = r1
            goto L18
        L13:
            bm.s r0 = new bm.s
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13248x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f13250z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            bm.t r7 = r0.f13247w
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Throwable -> L2d
            goto L9c
        L2d:
            r8 = move-exception
            goto La8
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            bm.t r7 = r0.f13247w
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)
            m9763n(r7)
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> La2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La2
            r6.m9776p(r8)     // Catch: java.lang.Throwable -> La6
            n0.u r8 = r6.f13252a     // Catch: java.lang.Throwable -> La6
            r0.f13247w = r6     // Catch: java.lang.Throwable -> La6
            r0.f13250z = r4     // Catch: java.lang.Throwable -> La6
            p0.n0 r2 = p329n0.C26068u.f103217x     // Catch: java.lang.Throwable -> La2
            r2 = 0
            java.lang.Object r7 = r8.m77567j(r7, r2, r0)     // Catch: java.lang.Throwable -> La2
            if (r7 != r1) goto L5c
            goto L9b
        L5c:
            r7 = r6
        L5d:
            n0.g r8 = r7.m9771j()     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L78
            n0.o r8 = (p329n0.C26062o) r8     // Catch: java.lang.Throwable -> L2d
            int r8 = r8.getIndex()     // Catch: java.lang.Throwable -> L2d
            int r2 = r7.m9774m()     // Catch: java.lang.Throwable -> L2d
            if (r8 == r2) goto L78
            p1.k1 r2 = r7.f13253b     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2d
            r2.setValue(r8)     // Catch: java.lang.Throwable -> L2d
        L78:
            r8 = 0
            float r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L2d
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L9c
            n0.g r8 = r7.m9768g()     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L9c
            ay.u r2 = new ay.u     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r8, r7, r5, r4)     // Catch: java.lang.Throwable -> L2d
            r0.f13247w = r7     // Catch: java.lang.Throwable -> L2d
            r0.f13250z = r3     // Catch: java.lang.Throwable -> L2d
            f0.z0 r8 = p132f0.EnumC13840z0.f49374w     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.mo9764a(r8, r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r7.m9776p(r5)
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        La2:
            r7 = move-exception
            r8 = r7
        La4:
            r7 = r6
            goto La8
        La6:
            r8 = move-exception
            goto La4
        La8:
            r7.m9776p(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.C3396t.m9775o(int, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    public final void m9776p(Integer num) {
        this.f13257f.setValue(num);
    }

    public final String toString() {
        return "PagerState(pageCount=" + m9772k() + ", currentPage=" + m9774m() + ", currentPageOffset=" + m9769h() + ')';
    }
}
