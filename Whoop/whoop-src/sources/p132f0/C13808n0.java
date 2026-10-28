package p132f0;

import p238j0.C21080f;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f0.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13808n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C21080f f49268w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f49269x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13817q0 f49270y;

    /* JADX INFO: renamed from: z */
    public int f49271z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13808n0(C13817q0 c13817q0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f49270y = c13817q0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f49269x = obj;
        this.f49271z |= Integer.MIN_VALUE;
        return C13817q0.m39179X0(this.f49270y, this);
    }
}
