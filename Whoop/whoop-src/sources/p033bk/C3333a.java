package p033bk;

import a33.C0352d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3333a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C0352d f12929w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f12930x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0352d f12931y;

    /* JADX INFO: renamed from: z */
    public int f12932z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3333a(C0352d c0352d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12931y = c0352d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12930x = obj;
        this.f12932z |= Integer.MIN_VALUE;
        return this.f12931y.m939k(this);
    }
}
