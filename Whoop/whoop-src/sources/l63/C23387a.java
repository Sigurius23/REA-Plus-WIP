package l63;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: l63.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C23387a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f92687w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23388b f92688x;

    /* JADX INFO: renamed from: y */
    public int f92689y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23387a(C23388b c23388b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f92688x = c23388b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92687w = obj;
        this.f92689y |= Integer.MIN_VALUE;
        return this.f92688x.mo63740b(null, null, null, this);
    }
}
