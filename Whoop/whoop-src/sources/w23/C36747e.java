package w23;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w23.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C36747e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f157273w;

    /* JADX INFO: renamed from: x */
    public int f157274x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f157275y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36747e(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f157275y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157273w = obj;
        this.f157274x |= Integer.MIN_VALUE;
        return this.f157275y.emit(null, this);
    }
}
