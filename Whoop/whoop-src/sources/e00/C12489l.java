package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C12489l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42641w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42642x;

    /* JADX INFO: renamed from: y */
    public int f42643y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12489l(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42642x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42641w = obj;
        this.f42643y |= Integer.MIN_VALUE;
        Object objM35124l = this.f42642x.m35124l(null, null, null, null, null, this);
        return objM35124l == EnumC31071a.f128113w ? objM35124l : new C23468n(objM35124l);
    }
}
