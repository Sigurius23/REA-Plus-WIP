package p033bk;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3340h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12962E;

    /* JADX INFO: renamed from: w */
    public C3346n f12963w;

    /* JADX INFO: renamed from: x */
    public int f12964x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12965y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3346n f12966z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3340h(C3346n c3346n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12966z = c3346n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12965y = obj;
        this.f12962E |= Integer.MIN_VALUE;
        return this.f12966z.m9651b(this);
    }
}
