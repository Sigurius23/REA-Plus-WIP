package w53;

import q83.InterfaceC30057d;
import s63.C32236a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w53.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C36844a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f157608E;

    /* JADX INFO: renamed from: w */
    public C36845b f157609w;

    /* JADX INFO: renamed from: x */
    public C32236a f157610x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f157611y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36845b f157612z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36844a(C36845b c36845b, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f157612z = c36845b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157611y = obj;
        this.f157608E |= Integer.MIN_VALUE;
        return this.f157612z.m118137a(null, this);
    }
}
