package p395p6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C28885i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C28894l f116919w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116920x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28894l f116921y;

    /* JADX INFO: renamed from: z */
    public int f116922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28885i(C28894l c28894l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116921y = c28894l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116920x = obj;
        this.f116922z |= Integer.MIN_VALUE;
        return C28894l.m87813b(this.f116921y, null, null, this);
    }
}
