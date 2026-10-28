package bm;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bm.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C3382f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f13206w;

    /* JADX INFO: renamed from: x */
    public int f13207x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f13208y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3382f(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f13208y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f13206w = obj;
        this.f13207x |= Integer.MIN_VALUE;
        return this.f13208y.emit(null, this);
    }
}
