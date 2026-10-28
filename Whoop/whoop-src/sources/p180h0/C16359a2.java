package p180h0;

import c93.InterfaceC4351m;
import d30.C11530f0;
import l83.C23454a0;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.a2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16359a2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f62887E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22663d0 f62888F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22669g0 f62889G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C22669g0 f62890H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ float f62891I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C11530f0 f62892J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ float f62893K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C16372c3 f62894L;

    /* JADX INFO: renamed from: w */
    public C22659b0 f62895w;

    /* JADX INFO: renamed from: x */
    public C22659b0 f62896x;

    /* JADX INFO: renamed from: y */
    public int f62897y;

    /* JADX INFO: renamed from: z */
    public int f62898z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16359a2(C22663d0 c22663d0, C22669g0 c22669g0, C22669g0 c22669g1, float f13, C11530f0 c11530f0, float f14, C16372c3 c16372c3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62888F = c22663d0;
        this.f62889G = c22669g0;
        this.f62890H = c22669g1;
        this.f62891I = f13;
        this.f62892J = c11530f0;
        this.f62893K = f14;
        this.f62894L = c16372c3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16359a2 c16359a2 = new C16359a2(this.f62888F, this.f62889G, this.f62890H, this.f62891I, this.f62892J, this.f62893K, this.f62894L, interfaceC30057d);
        c16359a2.f62887E = obj;
        return c16359a2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16359a2) create((C16360a3) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:17:0x0093  */
    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0182 -> B:36:0x0183). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0193 -> B:13:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16359a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
