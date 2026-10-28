package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2251o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8939w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8940x;

    /* JADX INFO: renamed from: y */
    public int f8941y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2251o0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8940x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8939w = obj;
        this.f8941y |= Integer.MIN_VALUE;
        Object objM7068N = this.f8940x.m7068N(null, null, this, null);
        return objM7068N == EnumC31071a.f128113w ? objM7068N : new C23468n(objM7068N);
    }
}
