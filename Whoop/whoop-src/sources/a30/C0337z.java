package a30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C0337z extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1186w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0274a0 f1187x;

    /* JADX INFO: renamed from: y */
    public int f1188y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0337z(C0274a0 c0274a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1187x = c0274a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1186w = obj;
        this.f1188y |= Integer.MIN_VALUE;
        return C0274a0.m813f(this.f1187x, null, this);
    }
}
