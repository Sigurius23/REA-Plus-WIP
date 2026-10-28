package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40007a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f172594E;

    /* JADX INFO: renamed from: w */
    public C40013g f172595w;

    /* JADX INFO: renamed from: x */
    public String f172596x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f172597y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C40013g f172598z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40007a(C40013g c40013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172598z = c40013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172597y = obj;
        this.f172594E |= Integer.MIN_VALUE;
        Object objM128239a = this.f172598z.m128239a(null, null, false, this);
        return objM128239a == EnumC31071a.f128113w ? objM128239a : new C23468n(objM128239a);
    }
}
