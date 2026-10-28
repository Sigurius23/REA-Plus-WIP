package p581we;

import p368og.InterfaceC27910g;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: we.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C37198n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f159035E;

    /* JADX INFO: renamed from: w */
    public C37187g f159036w;

    /* JADX INFO: renamed from: x */
    public InterfaceC27910g f159037x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f159038y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37199o f159039z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37198n(C37199o c37199o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f159039z = c37199o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f159038y = obj;
        this.f159035E |= Integer.MIN_VALUE;
        return this.f159039z.m119214T(null, null, this);
    }
}
