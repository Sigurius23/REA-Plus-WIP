package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C12493p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42663w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42664x;

    /* JADX INFO: renamed from: y */
    public int f42665y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12493p(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42664x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42663w = obj;
        this.f42665y |= Integer.MIN_VALUE;
        Object objM35127o = this.f42664x.m35127o(null, null, null, null, null, null, null, null, null, null, this);
        return objM35127o == EnumC31071a.f128113w ? objM35127o : new C23468n(objM35127o);
    }
}
