package fc3;

import dc3.C11923h;
import ec3.InterfaceC13062m;

/* JADX INFO: renamed from: fc3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C14382m implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11923h f52506w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f52507x;

    public C14382m(C11923h c11923h, int i13) {
        this.f52506w = c11923h;
        this.f52507x = i13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (bc3.AbstractC3006f0.m8706L(r0) == r1) goto L21;
     */
    @Override // ec3.InterfaceC13062m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, q83.InterfaceC30057d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fc3.C14381l
            if (r0 == 0) goto L13
            r0 = r7
            fc3.l r0 = (fc3.C14381l) r0
            int r1 = r0.f52505y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52505y = r1
            goto L18
        L13:
            fc3.l r0 = new fc3.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f52503w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f52505y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4b
        L36:
            p505ts.AbstractC34132o.m107864I(r7)
            m83.c0 r7 = new m83.c0
            int r2 = r5.f52507x
            r7.<init>(r2, r6)
            r0.f52505y = r4
            dc3.h r6 = r5.f52506w
            java.lang.Object r6 = r6.mo32219t(r7, r0)
            if (r6 != r1) goto L4b
            goto L53
        L4b:
            r0.f52505y = r3
            java.lang.Object r6 = bc3.AbstractC3006f0.m8706L(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fc3.C14382m.emit(java.lang.Object, q83.d):java.lang.Object");
    }
}
