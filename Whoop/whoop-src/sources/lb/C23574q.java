package lb;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C23574q extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f93489w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23576s f93490x;

    /* JADX INFO: renamed from: y */
    public int f93491y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23574q(C23576s c23576s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93490x = c23576s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93489w = obj;
        this.f93491y |= Integer.MIN_VALUE;
        return this.f93490x.m68218a(this);
    }
}
