package h20;

import l83.C23468n;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38915o4;

/* JADX INFO: renamed from: h20.y4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16770y4 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C16776z4 f64451E;

    /* JADX INFO: renamed from: F */
    public int f64452F;

    /* JADX INFO: renamed from: w */
    public C16776z4 f64453w;

    /* JADX INFO: renamed from: x */
    public C38915o4 f64454x;

    /* JADX INFO: renamed from: y */
    public Object f64455y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f64456z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16770y4(C16776z4 c16776z4, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f64451E = c16776z4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64456z = obj;
        this.f64452F |= Integer.MIN_VALUE;
        Object objM47283d = this.f64451E.m47283d(null, this);
        return objM47283d == EnumC31071a.f128113w ? objM47283d : new C23468n(objM47283d);
    }
}
