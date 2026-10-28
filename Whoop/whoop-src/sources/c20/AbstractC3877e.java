package c20;

import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p664yy.C39857f;
import s40.C32132a;

/* JADX INFO: renamed from: c20.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3877e {
    /* JADX INFO: renamed from: a */
    public void mo11856a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo6696b(InterfaceC21064c interfaceC21064c, InterfaceC21063b interfaceC21063b) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r2.mo6697d(r6, r7, r8, r0) == r1) goto L22;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11857c(s40.C32132a r6, java.lang.Object r7, p664yy.C39857f r8, s83.AbstractC32269c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof c20.C3876d
            if (r0 == 0) goto L13
            r0 = r9
            c20.d r0 = (c20.C3876d) r0
            int r1 = r0.f15863G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15863G = r1
            goto L18
        L13:
            c20.d r0 = new c20.d
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f15861E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f15863G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r9)
            goto L67
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yy.f r8 = r0.f15867z
            java.lang.Object r7 = r0.f15866y
            s40.a r6 = r0.f15865x
            c20.e r2 = r0.f15864w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L55
        L3e:
            p505ts.AbstractC34132o.m107864I(r9)
            g.l r9 = r6.f133155c
            r0.f15864w = r5
            r0.f15865x = r6
            r0.f15866y = r7
            r0.f15867z = r8
            r0.f15863G = r4
            java.lang.Object r9 = com.squareup.wire.AbstractC5583n.m16781h(r9, r0)
            if (r9 != r1) goto L54
            goto L66
        L54:
            r2 = r5
        L55:
            r9 = 0
            r0.f15864w = r9
            r0.f15865x = r9
            r0.f15866y = r9
            r0.f15867z = r9
            r0.f15863G = r3
            java.lang.Object r6 = r2.mo6697d(r6, r7, r8, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c20.AbstractC3877e.m11857c(s40.a, java.lang.Object, yy.f, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d);
}
