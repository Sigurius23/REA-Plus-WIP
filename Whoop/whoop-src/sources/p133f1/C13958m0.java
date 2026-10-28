package p133f1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p512u2.InterfaceC34449b;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: f1.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13958m0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f49753E;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f49754x;

    /* JADX INFO: renamed from: y */
    public int f49755y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f49756z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13958m0(int i13, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49754x = i13;
        this.f49753E = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49754x) {
            case 0:
                C13958m0 c13958m0 = new C13958m0(0, this.f49753E, interfaceC30057d);
                c13958m0.f49756z = obj;
                return c13958m0;
            default:
                C13958m0 c13958m1 = new C13958m0(1, this.f49753E, interfaceC30057d);
                c13958m1.f49756z = obj;
                return c13958m1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC34449b interfaceC34449b = (InterfaceC34449b) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49754x) {
            case 0:
                ((C13958m0) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                return ((C13958m0) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008f -> B:34:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f49754x
            kotlin.jvm.functions.Function1 r1 = r7.f49753E
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L63;
                default: goto La;
            }
        La:
            r83.a r0 = r83.EnumC31071a.f128113w
            int r4 = r7.f49755y
            r5 = 2
            if (r4 == 0) goto L27
            if (r4 == r3) goto L1f
            if (r4 != r5) goto L19
            p505ts.AbstractC34132o.m107864I(r8)
            goto L59
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
            throw r8
        L1f:
            java.lang.Object r2 = r7.f49756z
            u2.b r2 = (p512u2.InterfaceC34449b) r2
            p505ts.AbstractC34132o.m107864I(r8)
            goto L3a
        L27:
            p505ts.AbstractC34132o.m107864I(r8)
            java.lang.Object r8 = r7.f49756z
            r2 = r8
            u2.b r2 = (p512u2.InterfaceC34449b) r2
            r7.f49756z = r2
            r7.f49755y = r3
            java.lang.Object r8 = s30.AbstractC32103e.m99882d(r2, r7)
            if (r8 != r0) goto L3a
            goto L62
        L3a:
            u2.r r8 = (p512u2.C34472r) r8
            r8.m108946a()
            long r3 = r8.f144817c
            h2.b r8 = new h2.b
            r8.<init>(r3)
            r1.invoke(r8)
            r8 = 0
            r7.f49756z = r8
            r7.f49755y = r5
            h0.d3 r8 = p180h0.AbstractC16434o3.f63148a
            u2.l r8 = p512u2.EnumC34466l.f144807x
            java.lang.Object r8 = p180h0.AbstractC16434o3.m46610j(r2, r8, r7)
            if (r8 != r0) goto L59
            goto L62
        L59:
            u2.r r8 = (p512u2.C34472r) r8
            if (r8 == 0) goto L60
            r8.m108946a()
        L60:
            l83.a0 r0 = l83.C23454a0.f92919a
        L62:
            return r0
        L63:
            r83.a r0 = r83.EnumC31071a.f128113w
            int r4 = r7.f49755y
            if (r4 == 0) goto L79
            if (r4 != r3) goto L73
            java.lang.Object r2 = r7.f49756z
            u2.b r2 = (p512u2.InterfaceC34449b) r2
            p505ts.AbstractC34132o.m107864I(r8)
            goto L92
        L73:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
            throw r8
        L79:
            p505ts.AbstractC34132o.m107864I(r8)
            java.lang.Object r8 = r7.f49756z
            u2.b r8 = (p512u2.InterfaceC34449b) r8
        L80:
            u2.l r2 = p512u2.EnumC34466l.f144806w
            r7.f49756z = r8
            r7.f49755y = r3
            u2.g0 r8 = (p512u2.C34460g0) r8
            java.lang.Object r2 = r8.m108928a(r2, r7)
            if (r2 != r0) goto L8f
            return r0
        L8f:
            r6 = r2
            r2 = r8
            r8 = r6
        L92:
            u2.k r8 = (p512u2.C34465k) r8
            boolean r8 = p133f1.AbstractC13994y0.m39834w(r8)
            r8 = r8 ^ r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1.invoke(r8)
            r8 = r2
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: p133f1.C13958m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
