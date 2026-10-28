package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C38739p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166709w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166710x;

    /* JADX INFO: renamed from: y */
    public int f166711y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38739p(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166710x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166709w = obj;
        this.f166711y |= Integer.MIN_VALUE;
        Object objM124166r = this.f166710x.m124166r(null, this);
        return objM124166r == EnumC31071a.f128113w ? objM124166r : new C23468n(objM124166r);
    }
}
