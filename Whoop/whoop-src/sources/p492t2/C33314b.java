package p492t2;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t2.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C33314b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f138971w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33316d f138972x;

    /* JADX INFO: renamed from: y */
    public int f138973y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33314b(C33316d c33316d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138972x = c33316d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138971w = obj;
        this.f138973y |= Integer.MIN_VALUE;
        return this.f138972x.m105690a(0L, 0L, this);
    }
}
