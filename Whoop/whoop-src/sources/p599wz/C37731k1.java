package p599wz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37731k1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f161677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37734l1 f161678x;

    /* JADX INFO: renamed from: y */
    public int f161679y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37731k1(C37734l1 c37734l1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161678x = c37734l1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161677w = obj;
        this.f161679y |= Integer.MIN_VALUE;
        Object objM121150d = this.f161678x.m121150d(null, null, this);
        return objM121150d == EnumC31071a.f128113w ? objM121150d : new C23468n(objM121150d);
    }
}
