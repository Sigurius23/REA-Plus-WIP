package eu;

import bc3.InterfaceC3027k1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: eu.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C13608e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f48166E;

    /* JADX INFO: renamed from: w */
    public C13612g f48167w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3027k1 f48168x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f48169y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13612g f48170z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13608e(C13612g c13612g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f48170z = c13612g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f48169y = obj;
        this.f48166E |= Integer.MIN_VALUE;
        return this.f48170z.m38430b(null, 0, this);
    }
}
