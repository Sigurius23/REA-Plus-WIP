package p180h0;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16420m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f63103w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16435p f63104x;

    /* JADX INFO: renamed from: y */
    public int f63105y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16420m(C16435p c16435p, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f63104x = c16435p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63103w = obj;
        this.f63105y |= Integer.MIN_VALUE;
        return this.f63104x.m46612a(null, null, null, this);
    }
}
