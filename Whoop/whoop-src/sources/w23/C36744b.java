package w23;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C36744b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f157264w;

    /* JADX INFO: renamed from: x */
    public int f157265x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f157266y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36744b(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f157266y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157264w = obj;
        this.f157265x |= Integer.MIN_VALUE;
        return this.f157266y.emit(null, this);
    }
}
