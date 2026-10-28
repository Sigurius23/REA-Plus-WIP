package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C12488k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42638w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42639x;

    /* JADX INFO: renamed from: y */
    public int f42640y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12488k(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42639x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42638w = obj;
        this.f42640y |= Integer.MIN_VALUE;
        Object objM35123k = this.f42639x.m35123k(null, null, this);
        return objM35123k == EnumC31071a.f128113w ? objM35123k : new C23468n(objM35123k);
    }
}
