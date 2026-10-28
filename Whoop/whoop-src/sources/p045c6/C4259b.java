package p045c6;

import ne3.C26621j0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: c6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C4259b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f17301E;

    /* JADX INFO: renamed from: w */
    public C4260c f17302w;

    /* JADX INFO: renamed from: x */
    public C26621j0 f17303x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f17304y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C4260c f17305z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4259b(C4260c c4260c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f17305z = c4260c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f17304y = obj;
        this.f17301E |= Integer.MIN_VALUE;
        return C4260c.m13290f(this.f17305z, this);
    }
}
