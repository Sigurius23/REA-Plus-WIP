package sz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33123c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f138166E;

    /* JADX INFO: renamed from: w */
    public C33125d f138167w;

    /* JADX INFO: renamed from: x */
    public C33125d f138168x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f138169y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33125d f138170z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33123c(C33125d c33125d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138170z = c33125d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138169y = obj;
        this.f138166E |= Integer.MIN_VALUE;
        return C33125d.m105016a(this.f138170z, this);
    }
}
