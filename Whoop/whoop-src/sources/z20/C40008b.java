package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C40008b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f172599E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C40013g f172600F;

    /* JADX INFO: renamed from: G */
    public int f172601G;

    /* JADX INFO: renamed from: w */
    public C40013g f172602w;

    /* JADX INFO: renamed from: x */
    public C40014h f172603x;

    /* JADX INFO: renamed from: y */
    public String f172604y;

    /* JADX INFO: renamed from: z */
    public Object f172605z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40008b(C40013g c40013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172600F = c40013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172599E = obj;
        this.f172601G |= Integer.MIN_VALUE;
        Object objM128240b = this.f172600F.m128240b(null, null, null, this);
        return objM128240b == EnumC31071a.f128113w ? objM128240b : new C23468n(objM128240b);
    }
}
