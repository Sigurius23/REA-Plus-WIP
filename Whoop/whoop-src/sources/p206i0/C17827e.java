package p206i0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: i0.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C17827e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f69320w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17829g f69321x;

    /* JADX INFO: renamed from: y */
    public int f69322y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17827e(C17829g c17829g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f69321x = c17829g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f69320w = obj;
        this.f69322y |= Integer.MIN_VALUE;
        return this.f69321x.m51263d(null, 0.0f, null, this);
    }
}
