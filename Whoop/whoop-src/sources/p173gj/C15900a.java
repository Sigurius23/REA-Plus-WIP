package p173gj;

import p428qk.C30439b;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: gj.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15900a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f60120E;

    /* JADX INFO: renamed from: w */
    public C15903d f60121w;

    /* JADX INFO: renamed from: x */
    public C30439b f60122x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f60123y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15903d f60124z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15900a(C15903d c15903d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f60124z = c15903d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f60123y = obj;
        this.f60120E |= Integer.MIN_VALUE;
        return C15903d.m44878b(this.f60124z, null, this);
    }
}
