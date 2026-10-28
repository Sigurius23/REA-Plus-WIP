package ec3;

import fc3.C14389t;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C13014a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C14389t f44994w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f44995x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13084s1 f44996y;

    /* JADX INFO: renamed from: z */
    public int f44997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13014a(C13084s1 c13084s1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f44996y = c13084s1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f44995x = obj;
        this.f44997z |= Integer.MIN_VALUE;
        return this.f44996y.collect(null, this);
    }
}
