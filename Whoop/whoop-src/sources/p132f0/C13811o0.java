package p132f0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f0.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13811o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f49278w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13817q0 f49279x;

    /* JADX INFO: renamed from: y */
    public int f49280y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13811o0(C13817q0 c13817q0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f49279x = c13817q0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f49278w = obj;
        this.f49280y |= Integer.MIN_VALUE;
        return C13817q0.m39180Y0(this.f49279x, this);
    }
}
