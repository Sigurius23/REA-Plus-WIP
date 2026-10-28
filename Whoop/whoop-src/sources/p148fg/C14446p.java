package p148fg;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C14446p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f52723w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f52724x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14447q f52725y;

    /* JADX INFO: renamed from: z */
    public int f52726z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14446p(C14447q c14447q, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f52725y = c14447q;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52724x = obj;
        this.f52726z |= Integer.MIN_VALUE;
        return this.f52725y.m41169b(null, this);
    }
}
