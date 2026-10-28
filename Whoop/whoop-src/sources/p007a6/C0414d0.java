package p007a6;

import java.io.Serializable;
import p715kotlin.jvm.internal.C22669g0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0414d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1420E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f1421F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0429i0 f1422G;

    /* JADX INFO: renamed from: H */
    public int f1423H;

    /* JADX INFO: renamed from: w */
    public boolean f1424w;

    /* JADX INFO: renamed from: x */
    public Object f1425x;

    /* JADX INFO: renamed from: y */
    public C22669g0 f1426y;

    /* JADX INFO: renamed from: z */
    public Serializable f1427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0414d0(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1422G = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1421F = obj;
        this.f1423H |= Integer.MIN_VALUE;
        return C0429i0.m1111g(this.f1422G, false, this);
    }
}
