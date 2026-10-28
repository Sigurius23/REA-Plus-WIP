package f30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14040c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f50099w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14042e f50100x;

    /* JADX INFO: renamed from: y */
    public int f50101y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14040c(C14042e c14042e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f50100x = c14042e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f50099w = obj;
        this.f50101y |= Integer.MIN_VALUE;
        return this.f50100x.m39956a(this);
    }
}
