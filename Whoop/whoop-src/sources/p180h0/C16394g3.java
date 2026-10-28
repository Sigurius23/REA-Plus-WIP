package p180h0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: h0.g3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16394g3 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C34472r f63029E;

    /* JADX INFO: renamed from: x */
    public long f63030x;

    /* JADX INFO: renamed from: y */
    public int f63031y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f63032z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16394g3(C34472r c34472r, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63029E = c34472r;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16394g3 c16394g3 = new C16394g3(this.f63029E, interfaceC30057d);
        c16394g3.f63032z = obj;
        return c16394g3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16394g3) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r7.f63031y
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f63030x
            java.lang.Object r1 = r7.f63032z
            u2.b r1 = (p512u2.InterfaceC34449b) r1
            p505ts.AbstractC34132o.m107864I(r8)
            goto L41
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p505ts.AbstractC34132o.m107864I(r8)
            java.lang.Object r8 = r7.f63032z
            u2.b r8 = (p512u2.InterfaceC34449b) r8
            u2.r r1 = r7.f63029E
            long r3 = r1.f144816b
            u2.g0 r8 = (p512u2.C34460g0) r8
            b3.j3 r1 = r8.m108930f()
            long r5 = r1.getDoubleTapMinTimeMillis()
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L33:
            r7.f63032z = r1
            r7.f63030x = r3
            r7.f63031y = r2
            r8 = 3
            java.lang.Object r8 = p180h0.AbstractC16434o3.m46603c(r1, r7, r8)
            if (r8 != r0) goto L41
            return r0
        L41:
            u2.r r8 = (p512u2.C34472r) r8
            long r5 = r8.f144816b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L33
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16394g3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
