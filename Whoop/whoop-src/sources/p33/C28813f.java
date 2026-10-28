package p33;

import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p33.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C28813f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f116645E;

    /* JADX INFO: renamed from: w */
    public C28822o f116646w;

    /* JADX INFO: renamed from: x */
    public C22669g0 f116647x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f116648y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C28822o f116649z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28813f(C28822o c28822o, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116649z = c28822o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116648y = obj;
        this.f116645E |= Integer.MIN_VALUE;
        return this.f116649z.sendAnswer(null, this);
    }
}
