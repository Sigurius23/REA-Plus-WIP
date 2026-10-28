package f53;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f53.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C14121i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C14122j f50743w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f50744x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14122j f50745y;

    /* JADX INFO: renamed from: z */
    public int f50746z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14121i(C14122j c14122j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f50745y = c14122j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f50744x = obj;
        this.f50746z |= Integer.MIN_VALUE;
        return C14122j.m40212d(this.f50745y, this);
    }
}
