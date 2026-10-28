package p421qd;

import p474s.C31983m2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: qd.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30288c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C30289d f123858E;

    /* JADX INFO: renamed from: F */
    public int f123859F;

    /* JADX INFO: renamed from: w */
    public C30287b f123860w;

    /* JADX INFO: renamed from: x */
    public C31983m2 f123861x;

    /* JADX INFO: renamed from: y */
    public C30290e f123862y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f123863z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30288c(C30289d c30289d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f123858E = c30289d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f123863z = obj;
        this.f123859F |= Integer.MIN_VALUE;
        return this.f123858E.m92544I(null, null, this);
    }
}
