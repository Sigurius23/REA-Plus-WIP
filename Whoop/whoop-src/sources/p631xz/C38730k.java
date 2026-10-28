package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C38730k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f166685E;

    /* JADX INFO: renamed from: w */
    public C38747x f166686w;

    /* JADX INFO: renamed from: x */
    public boolean f166687x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f166688y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38747x f166689z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38730k(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166689z = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166688y = obj;
        this.f166685E |= Integer.MIN_VALUE;
        Object objM124160k = this.f166689z.m124160k(null, null, false, null, this);
        return objM124160k == EnumC31071a.f128113w ? objM124160k : new C23468n(objM124160k);
    }
}
