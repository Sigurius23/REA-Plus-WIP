package p492t2;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t2.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C33315c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f138974w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33316d f138975x;

    /* JADX INFO: renamed from: y */
    public int f138976y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33315c(C33316d c33316d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138975x = c33316d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138974w = obj;
        this.f138976y |= Integer.MIN_VALUE;
        return this.f138975x.m105691b(0L, this);
    }
}
