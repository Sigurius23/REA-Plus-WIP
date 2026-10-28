package p33;

import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p33.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C28821n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f116685E;

    /* JADX INFO: renamed from: w */
    public C28822o f116686w;

    /* JADX INFO: renamed from: x */
    public C22669g0 f116687x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f116688y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C28822o f116689z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28821n(C28822o c28822o, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116689z = c28822o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116688y = obj;
        this.f116685E |= Integer.MIN_VALUE;
        return this.f116689z.updateSubscriptions(null, this);
    }
}
