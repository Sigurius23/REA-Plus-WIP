package p007a6;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426h0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0429i0 f1461E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1462F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f1463G;

    /* JADX INFO: renamed from: w */
    public C22665e0 f1464w;

    /* JADX INFO: renamed from: x */
    public int f1465x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1466y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22665e0 f1467z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0426h0(C22665e0 c22665e0, C0429i0 c0429i0, Object obj, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1467z = c22665e0;
        this.f1461E = c0429i0;
        this.f1462F = obj;
        this.f1463G = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C0426h0 c0426h0 = new C0426h0(this.f1467z, this.f1461E, this.f1462F, this.f1463G, interfaceC30057d);
        c0426h0.f1466y = obj;
        return c0426h0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C0426h0) create((InterfaceC0439l1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r6.mo1120d(r2, r7) == r0) goto L16;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r7.f1465x
            java.lang.Object r2 = r7.f1462F
            a6.i0 r3 = r7.f1461E
            kotlin.jvm.internal.e0 r4 = r7.f1467z
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            p505ts.AbstractC34132o.m107864I(r8)
            goto L65
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.jvm.internal.e0 r1 = r7.f1464w
            java.lang.Object r6 = r7.f1466y
            a6.l1 r6 = (p007a6.InterfaceC0439l1) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L28:
            p505ts.AbstractC34132o.m107864I(r8)
            java.lang.Object r8 = r7.f1466y
            a6.l1 r8 = (p007a6.InterfaceC0439l1) r8
            a6.d1 r1 = r3.m1112h()
            r7.f1466y = r8
            r7.f1464w = r4
            r7.f1465x = r6
            aj.d r1 = r1.f1429b
            java.lang.Object r1 = r1.f3422w
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            goto L64
        L4b:
            r1 = r6
            r6 = r8
            r8 = r1
            r1 = r4
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f89334w = r8
            r8 = 0
            r7.f1466y = r8
            r7.f1464w = r8
            r7.f1465x = r5
            java.lang.Object r8 = r6.mo1120d(r2, r7)
            if (r8 != r0) goto L65
        L64:
            return r0
        L65:
            boolean r8 = r7.f1463G
            if (r8 == 0) goto L7d
            bu.c r8 = r3.f1477g
            a6.b r0 = new a6.b
            if (r2 == 0) goto L74
            int r1 = r2.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r3 = r4.f89334w
            r0.<init>(r2, r1, r3)
            r8.m11161J(r0)
        L7d:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0426h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
