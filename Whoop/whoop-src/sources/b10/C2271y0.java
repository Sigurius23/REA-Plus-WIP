package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2271y0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f9005w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f9006x;

    /* JADX INFO: renamed from: y */
    public int f9007y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2271y0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9006x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f9005w = obj;
        this.f9007y |= Integer.MIN_VALUE;
        Object objM7078X = this.f9006x.m7078X(null, null, null, this);
        return objM7078X == EnumC31071a.f128113w ? objM7078X : new C23468n(objM7078X);
    }
}
