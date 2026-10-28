package sz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C33159x extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f138273w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33161z f138274x;

    /* JADX INFO: renamed from: y */
    public int f138275y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33159x(C33161z c33161z, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138274x = c33161z;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138273w = obj;
        this.f138275y |= Integer.MIN_VALUE;
        return this.f138274x.m105023n(0, null, this);
    }
}
