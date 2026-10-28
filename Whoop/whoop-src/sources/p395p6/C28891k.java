package p395p6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C28891k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C28879g f116941w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116942x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28894l f116943y;

    /* JADX INFO: renamed from: z */
    public int f116944z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28891k(C28894l c28894l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116943y = c28894l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116942x = obj;
        this.f116944z |= Integer.MIN_VALUE;
        return this.f116943y.m87817f(this);
    }
}
