package v53;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: v53.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C35708b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f151921w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35709c f151922x;

    /* JADX INFO: renamed from: y */
    public int f151923y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35708b(C35709c c35709c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151922x = c35709c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151921w = obj;
        this.f151923y |= Integer.MIN_VALUE;
        return this.f151922x.m113181b(null, this);
    }
}
