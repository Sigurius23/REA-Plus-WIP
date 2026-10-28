package ec3;

import p007a6.C0466z;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C13079r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45193w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0466z f45194x;

    /* JADX INFO: renamed from: y */
    public int f45195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13079r(C0466z c0466z, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45194x = c0466z;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45193w = obj;
        this.f45195y |= Integer.MIN_VALUE;
        return this.f45194x.emit(null, this);
    }
}
