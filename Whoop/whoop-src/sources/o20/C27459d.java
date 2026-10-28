package o20;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: o20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C27459d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f110660w;

    /* JADX INFO: renamed from: x */
    public int f110661x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f110662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27459d(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f110662y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f110660w = obj;
        this.f110661x |= Integer.MIN_VALUE;
        return this.f110662y.emit(null, this);
    }
}
