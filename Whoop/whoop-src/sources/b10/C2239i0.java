package b10;

import p664yy.C39859g;
import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2239i0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f8894E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C2273z0 f8895F;

    /* JADX INFO: renamed from: G */
    public int f8896G;

    /* JADX INFO: renamed from: w */
    public C2273z0 f8897w;

    /* JADX INFO: renamed from: x */
    public C39859g f8898x;

    /* JADX INFO: renamed from: y */
    public Function1 f8899y;

    /* JADX INFO: renamed from: z */
    public AbstractC2238i f8900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2239i0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8895F = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8894E = obj;
        this.f8896G |= Integer.MIN_VALUE;
        return this.f8895F.m7061G(null, null, this);
    }
}
