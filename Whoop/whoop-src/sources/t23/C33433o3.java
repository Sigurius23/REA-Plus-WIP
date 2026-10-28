package t23;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.o3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33433o3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f139568w;

    /* JADX INFO: renamed from: x */
    public int f139569x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f139570y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33433o3(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f139570y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139568w = obj;
        this.f139569x |= Integer.MIN_VALUE;
        return this.f139570y.emit(null, this);
    }
}
