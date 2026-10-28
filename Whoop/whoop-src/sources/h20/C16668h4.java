package h20;

import a30.C0290f1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.h4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16668h4 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f64101E;

    /* JADX INFO: renamed from: w */
    public C16686k4 f64102w;

    /* JADX INFO: renamed from: x */
    public C0290f1 f64103x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f64104y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16686k4 f64105z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16668h4(C16686k4 c16686k4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64105z = c16686k4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64104y = obj;
        this.f64101E |= Integer.MIN_VALUE;
        return this.f64105z.m47239E(null, this);
    }
}
