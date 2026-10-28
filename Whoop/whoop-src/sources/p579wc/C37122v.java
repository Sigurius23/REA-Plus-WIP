package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C37122v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158811w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37124w f158812x;

    /* JADX INFO: renamed from: y */
    public int f158813y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37122v(C37124w c37124w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158812x = c37124w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158811w = obj;
        this.f158813y |= Integer.MIN_VALUE;
        return this.f158812x.mo79294b(null, this);
    }
}
