package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2272z extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f9008w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f9009x;

    /* JADX INFO: renamed from: y */
    public int f9010y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2272z(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9009x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f9008w = obj;
        this.f9010y |= Integer.MIN_VALUE;
        Object objM7097t = this.f9009x.m7097t(null, null, this, null);
        return objM7097t == EnumC31071a.f128113w ? objM7097t : new C23468n(objM7097t);
    }
}
