package t23;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C33379e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f139340w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33384f f139341x;

    /* JADX INFO: renamed from: y */
    public int f139342y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33379e(C33384f c33384f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139341x = c33384f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139340w = obj;
        this.f139342y |= Integer.MIN_VALUE;
        return C33384f.m105842b(this.f139341x, null, this);
    }
}
