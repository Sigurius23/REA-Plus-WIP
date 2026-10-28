package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C37110p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158752w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37116s f158753x;

    /* JADX INFO: renamed from: y */
    public int f158754y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37110p(C37116s c37116s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158753x = c37116s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158752w = obj;
        this.f158754y |= Integer.MIN_VALUE;
        return this.f158753x.m119031h(this);
    }
}
