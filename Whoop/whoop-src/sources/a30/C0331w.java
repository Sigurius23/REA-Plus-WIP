package a30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C0331w extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1161w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0274a0 f1162x;

    /* JADX INFO: renamed from: y */
    public int f1163y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331w(C0274a0 c0274a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1162x = c0274a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1161w = obj;
        this.f1163y |= Integer.MIN_VALUE;
        return this.f1162x.m815h(null, null, this);
    }
}
