package e33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C12643m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43180w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12645n f43181x;

    /* JADX INFO: renamed from: y */
    public int f43182y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12643m(C12645n c12645n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43181x = c12645n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43180w = obj;
        this.f43182y |= Integer.MIN_VALUE;
        return this.f43181x.m35408x(this);
    }
}
