package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38715c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166642w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38719e0 f166643x;

    /* JADX INFO: renamed from: y */
    public int f166644y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38715c0(C38719e0 c38719e0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166643x = c38719e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166642w = obj;
        this.f166644y |= Integer.MIN_VALUE;
        Object objM124144e = this.f166643x.m124144e(null, null, this);
        return objM124144e == EnumC31071a.f128113w ? objM124144e : new C23468n(objM124144e);
    }
}
