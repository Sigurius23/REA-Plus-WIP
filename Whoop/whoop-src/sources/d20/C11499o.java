package d20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C11499o extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f36977w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11502r f36978x;

    /* JADX INFO: renamed from: y */
    public int f36979y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11499o(C11502r c11502r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36978x = c11502r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36977w = obj;
        this.f36979y |= Integer.MIN_VALUE;
        Object objM30910j = this.f36978x.m30910j(null, null, null, 0, this);
        return objM30910j == EnumC31071a.f128113w ? objM30910j : new C23468n(objM30910j);
    }
}
