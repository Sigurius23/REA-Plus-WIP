package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2270y extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f9002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f9003x;

    /* JADX INFO: renamed from: y */
    public int f9004y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2270y(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9003x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f9002w = obj;
        this.f9004y |= Integer.MIN_VALUE;
        Object objM7096s = this.f9003x.m7096s(null, null, this);
        return objM7096s == EnumC31071a.f128113w ? objM7096s : new C23468n(objM7096s);
    }
}
