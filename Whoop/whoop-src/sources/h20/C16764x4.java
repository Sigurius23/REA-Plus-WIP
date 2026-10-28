package h20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v00.C35484p;

/* JADX INFO: renamed from: h20.x4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16764x4 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f64432E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C16776z4 f64433F;

    /* JADX INFO: renamed from: G */
    public int f64434G;

    /* JADX INFO: renamed from: w */
    public C16776z4 f64435w;

    /* JADX INFO: renamed from: x */
    public String f64436x;

    /* JADX INFO: renamed from: y */
    public C35484p f64437y;

    /* JADX INFO: renamed from: z */
    public boolean f64438z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16764x4(C16776z4 c16776z4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64433F = c16776z4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64432E = obj;
        this.f64434G |= Integer.MIN_VALUE;
        Object objM47282c = this.f64433F.m47282c(null, this);
        return objM47282c == EnumC31071a.f128113w ? objM47282c : new C23468n(objM47282c);
    }
}
