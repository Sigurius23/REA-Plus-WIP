package b30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p329n0.C26068u;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.x1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2653x1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f10364w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10365x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26068u f10366y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f10367z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2653x1(boolean z4, C26068u c26068u, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f10365x = z4;
        this.f10366y = c26068u;
        this.f10367z = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C2653x1(this.f10365x, this.f10366y, this.f10367z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C2653x1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5.m77567j(r4, 0, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r5.m77563f(r4, 0, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        return r0;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f10364w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L3b
        L19:
            p505ts.AbstractC34132o.m107864I(r7)
            boolean r7 = r6.f10365x
            r1 = 0
            int r4 = r6.f10367z
            n0.u r5 = r6.f10366y
            if (r7 == 0) goto L30
            r6.f10364w = r3
            p0.n0 r7 = p329n0.C26068u.f103217x
            java.lang.Object r7 = r5.m77567j(r4, r1, r6)
            if (r7 != r0) goto L3b
            goto L3a
        L30:
            r6.f10364w = r2
            p0.n0 r7 = p329n0.C26068u.f103217x
            java.lang.Object r7 = r5.m77563f(r4, r1, r6)
            if (r7 != r0) goto L3b
        L3a:
            return r0
        L3b:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b30.C2653x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
