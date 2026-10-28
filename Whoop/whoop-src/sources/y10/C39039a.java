package y10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39039a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168010w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39041c f168011x;

    /* JADX INFO: renamed from: y */
    public int f168012y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39039a(C39041c c39041c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168011x = c39041c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168010w = obj;
        this.f168012y |= Integer.MIN_VALUE;
        Object objM124462a = this.f168011x.m124462a(null, null, null, null, this);
        return objM124462a == EnumC31071a.f128113w ? objM124462a : new C23468n(objM124462a);
    }
}
