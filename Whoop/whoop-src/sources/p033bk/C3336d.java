package p033bk;

import a33.C0352d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3336d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C0352d f12948w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f12949x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0352d f12950y;

    /* JADX INFO: renamed from: z */
    public int f12951z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3336d(C0352d c0352d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12950y = c0352d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12949x = obj;
        this.f12951z |= Integer.MIN_VALUE;
        return this.f12950y.m916C(this);
    }
}
