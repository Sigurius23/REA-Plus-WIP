package n10;

import e10.C12553k;
import e10.InterfaceC12576v0;
import j10.C21196a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n10.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26129g0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f103525E;

    /* JADX INFO: renamed from: w */
    public InterfaceC12576v0 f103526w;

    /* JADX INFO: renamed from: x */
    public C12553k f103527x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f103528y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C21196a f103529z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26129g0(C21196a c21196a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103529z = c21196a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103528y = obj;
        this.f103525E |= Integer.MIN_VALUE;
        return this.f103529z.m59428i(null, null, this);
    }
}
