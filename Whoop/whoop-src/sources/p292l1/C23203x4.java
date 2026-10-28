package p292l1;

import a00.C0071f;
import androidx.lifecycle.C1586g1;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import l83.C23454a0;
import p007a6.C0416e;
import p077d0.C11393q0;
import p132f0.C13776c1;
import p132f0.EnumC13840z0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.x4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23203x4 {

    /* JADX INFO: renamed from: a */
    public final C13776c1 f91824a;

    /* JADX INFO: renamed from: b */
    public final C11393q0 f91825b = new C11393q0(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public C3033m f91826c;

    public C23203x4(C13776c1 c13776c1) {
        this.f91824a = c13776c1;
    }

    /* JADX INFO: renamed from: a */
    public final void m67159a() {
        this.f91825b.m30628I0(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67160b() {
        C11393q0 c11393q0 = this.f91825b;
        return ((Boolean) c11393q0.f36534y.getValue()).booleanValue() || ((Boolean) c11393q0.f36535z.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final Object m67161c(EnumC13840z0 enumC13840z0, AbstractC32275i abstractC32275i) {
        InterfaceC30057d interfaceC30057d = null;
        C0071f c0071f = new C0071f(this, new C0416e(this, interfaceC30057d, 7), enumC13840z0, interfaceC30057d, 3);
        C13776c1 c13776c1 = this.f91824a;
        c13776c1.getClass();
        Object objM8719m = AbstractC3006f0.m8719m(new C1586g1(enumC13840z0, c13776c1, c0071f, null), abstractC32275i);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }
}
