package p522uf;

import p715kotlin.time.Duration;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: uf.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C34891r extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f146937E;

    /* JADX INFO: renamed from: w */
    public C34876f0 f146938w;

    /* JADX INFO: renamed from: x */
    public Duration f146939x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f146940y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C34892s f146941z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34891r(C34892s c34892s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f146941z = c34892s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f146940y = obj;
        this.f146937E |= Integer.MIN_VALUE;
        return this.f146941z.mo2061a(null, this);
    }
}
