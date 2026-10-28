package a30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C0312n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1074w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0274a0 f1075x;

    /* JADX INFO: renamed from: y */
    public int f1076y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312n(C0274a0 c0274a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1075x = c0274a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1074w = obj;
        this.f1076y |= Integer.MIN_VALUE;
        return C0274a0.m809b(this.f1075x, null, this);
    }
}
