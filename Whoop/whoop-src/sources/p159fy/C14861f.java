package p159fy;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: fy.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14861f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C14862g f55489w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f55490x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14862g f55491y;

    /* JADX INFO: renamed from: z */
    public int f55492z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14861f(C14862g c14862g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f55491y = c14862g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f55490x = obj;
        this.f55492z |= Integer.MIN_VALUE;
        return this.f55491y.m42885g(null, this);
    }
}
