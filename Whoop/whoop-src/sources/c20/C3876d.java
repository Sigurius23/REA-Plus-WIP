package c20;

import p664yy.C39857f;
import s40.C32132a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: c20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3876d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f15861E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC3877e f15862F;

    /* JADX INFO: renamed from: G */
    public int f15863G;

    /* JADX INFO: renamed from: w */
    public AbstractC3877e f15864w;

    /* JADX INFO: renamed from: x */
    public C32132a f15865x;

    /* JADX INFO: renamed from: y */
    public Object f15866y;

    /* JADX INFO: renamed from: z */
    public C39857f f15867z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3876d(AbstractC3877e abstractC3877e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f15862F = abstractC3877e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f15861E = obj;
        this.f15863G |= Integer.MIN_VALUE;
        return this.f15862F.m11857c(null, null, null, this);
    }
}
