package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2231e0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8877w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8878x;

    /* JADX INFO: renamed from: y */
    public int f8879y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2231e0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8878x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8877w = obj;
        this.f8879y |= Integer.MIN_VALUE;
        Object objM7056B = this.f8878x.m7056B(null, null, null, this);
        return objM7056B == EnumC31071a.f128113w ? objM7056B : new C23468n(objM7056B);
    }
}
