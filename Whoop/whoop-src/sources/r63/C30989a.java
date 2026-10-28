package r63;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r63.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C30989a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C30990b f127951w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f127952x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C30990b f127953y;

    /* JADX INFO: renamed from: z */
    public int f127954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30989a(C30990b c30990b, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f127953y = c30990b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f127952x = obj;
        this.f127954z |= Integer.MIN_VALUE;
        return this.f127953y.m95527e(this);
    }
}
