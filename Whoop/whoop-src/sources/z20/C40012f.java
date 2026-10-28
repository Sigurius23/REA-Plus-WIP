package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C40012f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f172615E;

    /* JADX INFO: renamed from: w */
    public C40013g f172616w;

    /* JADX INFO: renamed from: x */
    public String f172617x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f172618y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C40013g f172619z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40012f(C40013g c40013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172619z = c40013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172618y = obj;
        this.f172615E |= Integer.MIN_VALUE;
        Object objM128244f = this.f172619z.m128244f(null, null, null, this);
        return objM128244f == EnumC31071a.f128113w ? objM128244f : new C23468n(objM128244f);
    }
}
