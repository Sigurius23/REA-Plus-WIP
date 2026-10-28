package p647yf;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: yf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39494g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f169892w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f169893x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39496i f169894y;

    /* JADX INFO: renamed from: z */
    public int f169895z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39494g(C39496i c39496i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f169894y = c39496i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f169893x = obj;
        this.f169895z |= Integer.MIN_VALUE;
        return this.f169894y.m126151i(0, this);
    }
}
