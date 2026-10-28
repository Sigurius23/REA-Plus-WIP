package a30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C0333x extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1171w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0274a0 f1172x;

    /* JADX INFO: renamed from: y */
    public int f1173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333x(C0274a0 c0274a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1172x = c0274a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1171w = obj;
        this.f1173y |= Integer.MIN_VALUE;
        Object objM811d = C0274a0.m811d(this.f1172x, null, null, null, null, null, null, null, this);
        return objM811d == EnumC31071a.f128113w ? objM811d : new C23468n(objM811d);
    }
}
