package sz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33148o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33150p0 f138236w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f138237x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33150p0 f138238y;

    /* JADX INFO: renamed from: z */
    public int f138239z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33148o0(C33150p0 c33150p0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138238y = c33150p0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138237x = obj;
        this.f138239z |= Integer.MIN_VALUE;
        return this.f138238y.m105018j(this);
    }
}
