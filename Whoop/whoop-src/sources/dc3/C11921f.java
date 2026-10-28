package dc3;

import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dc3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C11921f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f38991w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11923h f38992x;

    /* JADX INFO: renamed from: y */
    public int f38993y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11921f(C11923h c11923h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f38992x = c11923h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f38991w = obj;
        this.f38993y |= Integer.MIN_VALUE;
        Object objM32189C = C11923h.m32189C(this.f38992x, this);
        return objM32189C == EnumC31071a.f128113w ? objM32189C : new C11930o(objM32189C);
    }
}
