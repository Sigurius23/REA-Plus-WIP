package p195hh;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: hh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17274e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f66404E;

    /* JADX INFO: renamed from: w */
    public C17276g f66405w;

    /* JADX INFO: renamed from: x */
    public C17280k f66406x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f66407y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C17276g f66408z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17274e(C17276g c17276g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f66408z = c17276g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f66407y = obj;
        this.f66404E |= Integer.MIN_VALUE;
        return this.f66408z.mo48922a(null, this);
    }
}
