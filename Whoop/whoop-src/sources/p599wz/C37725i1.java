package p599wz;

import l83.C23468n;
import p631xz.C38747x;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37725i1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f161657E;

    /* JADX INFO: renamed from: w */
    public C37718g0 f161658w;

    /* JADX INFO: renamed from: x */
    public C38747x f161659x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f161660y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37734l1 f161661z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37725i1(C37734l1 c37734l1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161661z = c37734l1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161660y = obj;
        this.f161657E |= Integer.MIN_VALUE;
        Object objM121147a = this.f161661z.m121147a(null, null, this);
        return objM121147a == EnumC31071a.f128113w ? objM121147a : new C23468n(objM121147a);
    }
}
