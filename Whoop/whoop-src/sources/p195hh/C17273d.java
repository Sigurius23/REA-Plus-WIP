package p195hh;

import bh.C3239b;
import bh.C3240c;
import mh.C25542j;
import mh.C25545m;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: hh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17273d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public C25545m f66394E;

    /* JADX INFO: renamed from: F */
    public C3240c f66395F;

    /* JADX INFO: renamed from: G */
    public int f66396G;

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f66397H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C17276g f66398I;

    /* JADX INFO: renamed from: J */
    public int f66399J;

    /* JADX INFO: renamed from: w */
    public C17276g f66400w;

    /* JADX INFO: renamed from: x */
    public C3239b f66401x;

    /* JADX INFO: renamed from: y */
    public C25542j f66402y;

    /* JADX INFO: renamed from: z */
    public Object f66403z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17273d(C17276g c17276g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f66398I = c17276g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f66397H = obj;
        this.f66399J |= Integer.MIN_VALUE;
        return this.f66398I.m48923d(null, null, null, null, null, this);
    }
}
