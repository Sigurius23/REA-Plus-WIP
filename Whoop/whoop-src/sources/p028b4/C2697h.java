package p028b4;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b4.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C2697h extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f10607w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10608x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC2701l f10609y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f10610z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2697h(boolean z4, AbstractC2701l abstractC2701l, long j7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f10608x = z4;
        this.f10609y = abstractC2701l;
        this.f10610z = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C2697h(this.f10608x, this.f10609y, this.f10610z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C2697h) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r10.f10607w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L4d
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            p505ts.AbstractC34132o.m107864I(r11)
            r6 = r10
            goto L37
        L1d:
            p505ts.AbstractC34132o.m107864I(r11)
            boolean r11 = r10.f10608x
            b4.l r1 = r10.f10609y
            if (r11 != 0) goto L3d
            t2.d r4 = r1.f10642w
            r10.f10607w = r3
            r5 = 0
            long r7 = r10.f10610z
            r9 = r10
            java.lang.Object r11 = r4.m105690a(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L37
            goto L4c
        L37:
            y3.q r11 = (p636y3.C39185q) r11
            r11.getClass()
            goto L52
        L3d:
            r6 = r10
            t2.d r1 = r1.f10642w
            r6.f10607w = r2
            long r2 = r6.f10610z
            r4 = 0
            java.lang.Object r11 = r1.m105690a(r2, r4, r6)
            if (r11 != r0) goto L4d
        L4c:
            return r0
        L4d:
            y3.q r11 = (p636y3.C39185q) r11
            r11.getClass()
        L52:
            l83.a0 r11 = l83.C23454a0.f92919a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p028b4.C2697h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
