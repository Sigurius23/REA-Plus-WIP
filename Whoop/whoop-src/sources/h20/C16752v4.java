package h20;

import l83.C23468n;
import p715kotlin.jvm.functions.Function1;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.v4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16752v4 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f64334E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C16776z4 f64335F;

    /* JADX INFO: renamed from: G */
    public int f64336G;

    /* JADX INFO: renamed from: w */
    public C16776z4 f64337w;

    /* JADX INFO: renamed from: x */
    public Object f64338x;

    /* JADX INFO: renamed from: y */
    public Object f64339y;

    /* JADX INFO: renamed from: z */
    public Function1 f64340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16752v4(C16776z4 c16776z4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64335F = c16776z4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64334E = obj;
        this.f64336G |= Integer.MIN_VALUE;
        Object objM47280a = this.f64335F.m47280a(null, null, null, this);
        return objM47280a == EnumC31071a.f128113w ? objM47280a : new C23468n(objM47280a);
    }
}
