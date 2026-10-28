package n10;

import s83.AbstractC32269c;
import y00.C38809d5;

/* JADX INFO: renamed from: n10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C26132i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f103531E;

    /* JADX INFO: renamed from: w */
    public C26136k f103532w;

    /* JADX INFO: renamed from: x */
    public C38809d5 f103533x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f103534y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26136k f103535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26132i(C26136k c26136k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103535z = c26136k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103534y = obj;
        this.f103531E |= Integer.MIN_VALUE;
        return this.f103535z.m77686c(null, this);
    }
}
