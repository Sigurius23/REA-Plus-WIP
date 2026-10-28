package sz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33119a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f138156w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33121b f138157x;

    /* JADX INFO: renamed from: y */
    public int f138158y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33119a(C33121b c33121b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138157x = c33121b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138156w = obj;
        this.f138158y |= Integer.MIN_VALUE;
        return this.f138157x.m105015a(null, this);
    }
}
