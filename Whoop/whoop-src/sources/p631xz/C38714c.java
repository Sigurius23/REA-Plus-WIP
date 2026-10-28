package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C38714c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38747x f166638w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166639x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166640y;

    /* JADX INFO: renamed from: z */
    public int f166641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38714c(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166640y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166639x = obj;
        this.f166641z |= Integer.MIN_VALUE;
        Object objM124152c = this.f166640y.m124152c(null, this);
        return objM124152c == EnumC31071a.f128113w ? objM124152c : new C23468n(objM124152c);
    }
}
