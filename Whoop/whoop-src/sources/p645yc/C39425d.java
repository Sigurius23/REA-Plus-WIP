package p645yc;

import p474s.C31983m2;
import p557vo.AbstractC36220b;
import p646yd.C39450a;
import wb3.AbstractC37056f;
import ye.C39475b;

/* JADX INFO: renamed from: yc.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C39425d extends AbstractC36220b {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C39425d f169608b = new C39425d();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m125936I(p645yc.C39423b r7, p474s.C31983m2 r8, s83.AbstractC32269c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p645yc.C39424c
            if (r0 == 0) goto L13
            r0 = r9
            yc.c r0 = (p645yc.C39424c) r0
            int r1 = r0.f169603F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169603F = r1
            goto L18
        L13:
            yc.c r0 = new yc.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f169607z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f169603F
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yc.e r7 = r0.f169606y
            p505ts.AbstractC34132o.m107864I(r9)
            goto L66
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            s.m2 r8 = r0.f169605x
            yc.b r7 = r0.f169604w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L4a
        L3e:
            p505ts.AbstractC34132o.m107864I(r9)
            r0.f169604w = r7
            r0.f169605x = r8
            r0.f169603F = r5
            if (r3 != r1) goto L4a
            goto L65
        L4a:
            yc.e r7 = r7.f169601c
            cg.o r9 = r7.f169618j
            if (r9 != 0) goto L68
            r9 = 0
            r0.f169604w = r9
            r0.f169605x = r9
            r0.f169606y = r7
            r0.f169603F = r4
            java.lang.String r9 = "Signin"
            java.lang.String r2 = "SIGNIN"
            java.lang.String r4 = "signin"
            java.lang.Object r9 = p550vd.AbstractC35902e.m113947R(r8, r9, r2, r4, r0)
            if (r9 != r1) goto L66
        L65:
            return r1
        L66:
            cg.o r9 = (cg.C4560o) r9
        L68:
            r7.f169618j = r9
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p645yc.C39425d.m125936I(yc.b, s.m2, s83.c):java.lang.Object");
    }

    @Override // p557vo.AbstractC36220b
    /* JADX INFO: renamed from: b */
    public final AbstractC37056f mo36635b() {
        return new C39423b();
    }

    @Override // p557vo.AbstractC36220b
    /* JADX INFO: renamed from: n */
    public final void mo36636n(AbstractC37056f abstractC37056f) {
        ((C39423b) abstractC37056f).f169601c.f169619k.add(0, new C39475b());
    }

    @Override // p557vo.AbstractC36220b
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ Object mo36637o(AbstractC37056f abstractC37056f, C31983m2 c31983m2, C31983m2 c31983m3, C39450a c39450a) {
        return m125936I((C39423b) abstractC37056f, c31983m2, c39450a);
    }
}
