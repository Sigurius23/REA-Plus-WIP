package m00;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: m00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24870b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C24872d f97424w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f97425x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C24872d f97426y;

    /* JADX INFO: renamed from: z */
    public int f97427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24870b(C24872d c24872d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f97426y = c24872d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f97425x = obj;
        this.f97427z |= Integer.MIN_VALUE;
        return C24872d.m72902g(this.f97426y, null, null, null, this);
    }
}
