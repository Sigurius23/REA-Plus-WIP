package e33;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C12625d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43124w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12645n f43125x;

    /* JADX INFO: renamed from: y */
    public int f43126y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12625d(C12645n c12645n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43125x = c12645n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43124w = obj;
        this.f43126y |= Integer.MIN_VALUE;
        Object objM35404t = this.f43125x.m35404t(null, false, this);
        return objM35404t == EnumC31071a.f128113w ? objM35404t : new C23468n(objM35404t);
    }
}
