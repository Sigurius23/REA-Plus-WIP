package h53;

import s83.AbstractC32269c;
import v33.C35629n;

/* JADX INFO: renamed from: h53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16937b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f64988E;

    /* JADX INFO: renamed from: w */
    public C16940e f64989w;

    /* JADX INFO: renamed from: x */
    public C35629n f64990x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f64991y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16940e f64992z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16937b(C16940e c16940e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64992z = c16940e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64991y = obj;
        this.f64988E |= Integer.MIN_VALUE;
        return C16940e.m47697b(this.f64992z, null, this);
    }
}
