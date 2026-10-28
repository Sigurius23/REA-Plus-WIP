package p10;

import i10.C17851a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C28695d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f116064w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17851a f116065x;

    /* JADX INFO: renamed from: y */
    public int f116066y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28695d(C17851a c17851a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116065x = c17851a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116064w = obj;
        this.f116066y |= Integer.MIN_VALUE;
        return this.f116065x.m51335i(null, this);
    }
}
