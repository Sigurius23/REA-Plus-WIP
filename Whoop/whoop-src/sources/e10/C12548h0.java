package e10;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e10.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12548h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C12550i0 f42865E;

    /* JADX INFO: renamed from: F */
    public int f42866F;

    /* JADX INFO: renamed from: w */
    public C12550i0 f42867w;

    /* JADX INFO: renamed from: x */
    public C12553k f42868x;

    /* JADX INFO: renamed from: y */
    public InterfaceC12555l f42869y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f42870z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12548h0(C12550i0 c12550i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42865E = c12550i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42870z = obj;
        this.f42866F |= Integer.MIN_VALUE;
        return this.f42865E.m35205a(null, null, this);
    }
}
