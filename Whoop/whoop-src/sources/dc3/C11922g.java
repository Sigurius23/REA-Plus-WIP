package dc3;

import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dc3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C11922g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f38994w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11923h f38995x;

    /* JADX INFO: renamed from: y */
    public int f38996y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11922g(C11923h c11923h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f38995x = c11923h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f38994w = obj;
        this.f38996y |= Integer.MIN_VALUE;
        Object objM32196D = this.f38995x.m32196D(null, 0, 0L, this);
        return objM32196D == EnumC31071a.f128113w ? objM32196D : new C11930o(objM32196D);
    }
}
