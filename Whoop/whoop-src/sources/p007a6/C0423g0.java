package p007a6;

import p715kotlin.jvm.internal.C22665e0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0423g0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22665e0 f1455w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1456x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0429i0 f1457y;

    /* JADX INFO: renamed from: z */
    public int f1458z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0423g0(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1457y = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1456x = obj;
        this.f1458z |= Integer.MIN_VALUE;
        return this.f1457y.m1114j(null, false, this);
    }
}
