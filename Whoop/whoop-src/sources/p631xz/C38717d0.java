package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38717d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166648w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38719e0 f166649x;

    /* JADX INFO: renamed from: y */
    public int f166650y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38717d0(C38719e0 c38719e0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166649x = c38719e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166648w = obj;
        this.f166650y |= Integer.MIN_VALUE;
        Object objM124146g = this.f166649x.m124146g(null, null, null, null, null, null, this);
        return objM124146g == EnumC31071a.f128113w ? objM124146g : new C23468n(objM124146g);
    }
}
