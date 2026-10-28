package ec3;

import p007a6.C0454t;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13044h1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45085w;

    /* JADX INFO: renamed from: x */
    public int f45086x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0454t f45087y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13044h1(C0454t c0454t, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45087y = c0454t;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45085w = obj;
        this.f45086x |= Integer.MIN_VALUE;
        return this.f45087y.emit(null, this);
    }
}
