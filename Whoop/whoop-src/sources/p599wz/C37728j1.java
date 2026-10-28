package p599wz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37728j1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f161668w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37734l1 f161669x;

    /* JADX INFO: renamed from: y */
    public int f161670y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37728j1(C37734l1 c37734l1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161669x = c37734l1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161668w = obj;
        this.f161670y |= Integer.MIN_VALUE;
        Object objM121149c = this.f161669x.m121149c(null, this);
        return objM121149c == EnumC31071a.f128113w ? objM121149c : new C23468n(objM121149c);
    }
}
