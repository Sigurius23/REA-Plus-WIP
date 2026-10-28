package vg;

import mc3.InterfaceC25439e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: vg.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35955b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f153108E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C35956c f153109F;

    /* JADX INFO: renamed from: G */
    public int f153110G;

    /* JADX INFO: renamed from: w */
    public AbstractC32275i f153111w;

    /* JADX INFO: renamed from: x */
    public InterfaceC25439e f153112x;

    /* JADX INFO: renamed from: y */
    public C35961h f153113y;

    /* JADX INFO: renamed from: z */
    public int f153114z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35955b(C35956c c35956c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f153109F = c35956c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f153108E = obj;
        this.f153110G |= Integer.MIN_VALUE;
        return this.f153109F.m114203b(null, this);
    }
}
