package p180h0;

import d30.C11530f0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.c2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16371c2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f62933w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11530f0 f62934x;

    /* JADX INFO: renamed from: y */
    public int f62935y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16371c2(C11530f0 c11530f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f62934x = c11530f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f62933w = obj;
        this.f62935y |= Integer.MIN_VALUE;
        return this.f62934x.m30990n(null, null, this);
    }
}
