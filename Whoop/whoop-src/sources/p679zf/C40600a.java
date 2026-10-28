package p679zf;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: zf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40600a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f174951w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40602c f174952x;

    /* JADX INFO: renamed from: y */
    public int f174953y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40600a(C40602c c40602c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f174952x = c40602c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f174951w = obj;
        this.f174953y |= Integer.MIN_VALUE;
        return this.f174952x.m131680b(null, this);
    }
}
