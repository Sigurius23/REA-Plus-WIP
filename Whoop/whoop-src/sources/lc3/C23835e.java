package lc3;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lc3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C23835e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C23836f f94279w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f94280x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23836f f94281y;

    /* JADX INFO: renamed from: z */
    public int f94282z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23835e(C23836f c23836f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f94281y = c23836f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f94280x = obj;
        this.f94282z |= Integer.MIN_VALUE;
        return this.f94281y.m70039d(this);
    }
}
