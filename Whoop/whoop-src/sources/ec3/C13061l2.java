package ec3;

import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.l2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13061l2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45137w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13065m2 f45138x;

    /* JADX INFO: renamed from: y */
    public int f45139y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13061l2(C13065m2 c13065m2, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45138x = c13065m2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45137w = obj;
        this.f45139y |= Integer.MIN_VALUE;
        this.f45138x.collect(null, this);
        return EnumC31071a.f128113w;
    }
}
