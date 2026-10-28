package p445r0;

import p181h2.C16618c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C30834b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f127133E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C30835c f127134F;

    /* JADX INFO: renamed from: G */
    public int f127135G;

    /* JADX INFO: renamed from: w */
    public C16618c f127136w;

    /* JADX INFO: renamed from: x */
    public Object[] f127137x;

    /* JADX INFO: renamed from: y */
    public int f127138y;

    /* JADX INFO: renamed from: z */
    public int f127139z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30834b(C30835c c30835c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f127134F = c30835c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f127133E = obj;
        this.f127135G |= Integer.MIN_VALUE;
        return this.f127134F.m94839b(null, this);
    }
}
