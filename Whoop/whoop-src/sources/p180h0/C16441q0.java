package p180h0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p512u2.C34465k;
import p512u2.InterfaceC34449b;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: h0.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16441q0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f63170E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22659b0 f63171F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22669g0 f63172G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C22669g0 f63173H;

    /* JADX INFO: renamed from: x */
    public C34465k f63174x;

    /* JADX INFO: renamed from: y */
    public int f63175y;

    /* JADX INFO: renamed from: z */
    public int f63176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16441q0(C22659b0 c22659b0, C22669g0 c22669g0, C22669g0 c22669g1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63171F = c22659b0;
        this.f63172G = c22669g0;
        this.f63173H = c22669g1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16441q0 c16441q0 = new C16441q0(this.f63171F, this.f63172G, this.f63173H, interfaceC30057d);
        c16441q0.f63170E = obj;
        return c16441q0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16441q0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[LOOP:2: B:16:0x005e->B:20:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0071 A[EDGE_INSN: B:74:0x0071->B:22:0x0071 BREAK  A[LOOP:2: B:16:0x005e->B:20:0x006d], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bf -> B:39:0x00c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16441q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
