package p43;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C28842a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f116759w;

    /* JADX INFO: renamed from: x */
    public int f116760x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f116761y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28842a(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116761y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116759w = obj;
        this.f116760x |= Integer.MIN_VALUE;
        return this.f116761y.emit(null, this);
    }
}
