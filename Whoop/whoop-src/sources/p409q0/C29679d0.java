package p409q0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: q0.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29679d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f121306w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29681e0 f121307x;

    /* JADX INFO: renamed from: y */
    public int f121308y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29679d0(C29681e0 c29681e0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f121307x = c29681e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f121306w = obj;
        this.f121308y |= Integer.MIN_VALUE;
        return this.f121307x.mo46565a(null, 0.0f, this);
    }
}
