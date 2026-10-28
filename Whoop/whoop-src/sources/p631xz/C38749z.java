package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C38749z extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166766w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38719e0 f166767x;

    /* JADX INFO: renamed from: y */
    public int f166768y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38749z(C38719e0 c38719e0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166767x = c38719e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166766w = obj;
        this.f166768y |= Integer.MIN_VALUE;
        Object objM124141b = this.f166767x.m124141b(null, null, null, null, null, null, this);
        return objM124141b == EnumC31071a.f128113w ? objM124141b : new C23468n(objM124141b);
    }
}
