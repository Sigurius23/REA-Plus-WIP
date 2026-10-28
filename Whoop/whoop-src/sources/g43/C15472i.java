package g43;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g43.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15472i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f58110w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC15473j f58111x;

    /* JADX INFO: renamed from: y */
    public int f58112y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15472i(AbstractC15473j abstractC15473j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f58111x = abstractC15473j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f58110w = obj;
        this.f58112y |= Integer.MIN_VALUE;
        return AbstractC15473j.m43669s(this.f58111x, null, null, this);
    }
}
