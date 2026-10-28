package p599wz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C37765w extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C37770y f161747w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f161748x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37770y f161749y;

    /* JADX INFO: renamed from: z */
    public int f161750z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37765w(C37770y c37770y, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161749y = c37770y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161748x = obj;
        this.f161750z |= Integer.MIN_VALUE;
        return C37770y.m121166j(this.f161749y, this);
    }
}
