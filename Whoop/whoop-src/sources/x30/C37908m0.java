package x30;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x30.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37908m0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f162301w;

    /* JADX INFO: renamed from: x */
    public int f162302x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f162303y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37908m0(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f162303y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162301w = obj;
        this.f162302x |= Integer.MIN_VALUE;
        return this.f162303y.emit(null, this);
    }
}
