package p330n1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: n1.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C26113m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public float f103453w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f103454x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26114n f103455y;

    /* JADX INFO: renamed from: z */
    public int f103456z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26113m(C26114n c26114n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103455y = c26114n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103454x = obj;
        this.f103456z |= Integer.MIN_VALUE;
        return this.f103455y.m77676e1(0.0f, this);
    }
}
