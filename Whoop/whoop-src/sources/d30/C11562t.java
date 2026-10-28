package d30;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d30.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C11562t extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37291w;

    /* JADX INFO: renamed from: x */
    public int f37292x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f37293y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11562t(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f37293y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37291w = obj;
        this.f37292x |= Integer.MIN_VALUE;
        return this.f37293y.emit(null, this);
    }
}
