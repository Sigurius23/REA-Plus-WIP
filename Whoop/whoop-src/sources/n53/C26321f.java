package n53;

import p673z7.C40137a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n53.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C26321f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f104638E;

    /* JADX INFO: renamed from: F */
    public long f104639F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f104640G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C40137a f104641H;

    /* JADX INFO: renamed from: I */
    public int f104642I;

    /* JADX INFO: renamed from: w */
    public C40137a f104643w;

    /* JADX INFO: renamed from: x */
    public float f104644x;

    /* JADX INFO: renamed from: y */
    public float f104645y;

    /* JADX INFO: renamed from: z */
    public int f104646z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26321f(C40137a c40137a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f104641H = c40137a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f104640G = obj;
        this.f104642I |= Integer.MIN_VALUE;
        return C40137a.m128681a(this.f104641H, 0.0f, 0.0f, this);
    }
}
