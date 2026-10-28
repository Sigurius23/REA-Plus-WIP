package g43;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g43.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15470g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f58095w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC15473j f58096x;

    /* JADX INFO: renamed from: y */
    public int f58097y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15470g(AbstractC15473j abstractC15473j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f58096x = abstractC15473j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f58095w = obj;
        this.f58097y |= Integer.MIN_VALUE;
        return AbstractC15473j.m43667q(this.f58096x, null, null, this);
    }
}
