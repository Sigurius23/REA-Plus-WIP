package p206i0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: i0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17828f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f69323w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17829g f69324x;

    /* JADX INFO: renamed from: y */
    public int f69325y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17828f(C17829g c17829g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f69324x = c17829g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f69323w = obj;
        this.f69325y |= Integer.MIN_VALUE;
        return C17829g.m51261b(this.f69324x, null, 0.0f, 0.0f, null, this);
    }
}
