package p33;

import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p33.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C28814g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22669g0 f116650w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116651x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28822o f116652y;

    /* JADX INFO: renamed from: z */
    public int f116653z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28814g(C28822o c28822o, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116652y = c28822o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116651x = obj;
        this.f116653z |= Integer.MIN_VALUE;
        return this.f116652y.sendMetrics(null, this);
    }
}
