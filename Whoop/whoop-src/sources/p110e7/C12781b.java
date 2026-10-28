package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12781b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public String f43747w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43748x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12786g f43749y;

    /* JADX INFO: renamed from: z */
    public int f43750z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12781b(C12786g c12786g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43749y = c12786g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43748x = obj;
        this.f43750z |= Integer.MIN_VALUE;
        return this.f43749y.mo7838b(null, this);
    }
}
