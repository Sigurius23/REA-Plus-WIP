package p132f0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.C16398h2;
import p238j0.InterfaceC21083i;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C13777d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f49151E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC21083i f49152F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC13789h f49153G;

    /* JADX INFO: renamed from: w */
    public boolean f49154w;

    /* JADX INFO: renamed from: x */
    public int f49155x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f49156y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16398h2 f49157z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13777d(C16398h2 c16398h2, long j7, InterfaceC21083i interfaceC21083i, AbstractC13789h abstractC13789h, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49157z = c16398h2;
        this.f49151E = j7;
        this.f49152F = interfaceC21083i;
        this.f49153G = abstractC13789h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C13777d c13777d = new C13777d(this.f49157z, this.f49151E, this.f49152F, this.f49153G, interfaceC30057d);
        c13777d.f49156y = obj;
        return c13777d;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C13777d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        if (((p238j0.C21084j) r15).m58921a(r2, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (((p238j0.C21084j) r15).m58921a(r3, r17) == r1) goto L40;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p132f0.C13777d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
