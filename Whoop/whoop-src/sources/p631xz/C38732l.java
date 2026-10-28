package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C38732l extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f166691E;

    /* JADX INFO: renamed from: w */
    public C38747x f166692w;

    /* JADX INFO: renamed from: x */
    public String f166693x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f166694y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38747x f166695z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38732l(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166695z = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166694y = obj;
        this.f166691E |= Integer.MIN_VALUE;
        Object objM124161l = this.f166695z.m124161l(null, null, this);
        return objM124161l == EnumC31071a.f128113w ? objM124161l : new C23468n(objM124161l);
    }
}
