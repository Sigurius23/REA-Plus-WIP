package n53;

import bc3.C3058t;
import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n53.w1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26374w1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f104803E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C26377x1 f104804F;

    /* JADX INFO: renamed from: G */
    public int f104805G;

    /* JADX INFO: renamed from: w */
    public C26377x1 f104806w;

    /* JADX INFO: renamed from: x */
    public String f104807x;

    /* JADX INFO: renamed from: y */
    public C3058t f104808y;

    /* JADX INFO: renamed from: z */
    public int f104809z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26374w1(C26377x1 c26377x1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f104804F = c26377x1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f104803E = obj;
        this.f104805G |= Integer.MIN_VALUE;
        Object objM78095c = this.f104804F.m78095c(null, null, this);
        return objM78095c == EnumC31071a.f128113w ? objM78095c : new C23468n(objM78095c);
    }
}
