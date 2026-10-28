package p133f1;

import androidx.compose.foundation.text.contextmenu.modifier.AbstractC1113a;
import l83.C23454a0;
import p025b1.C2214e;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p181h2.C16617b;
import p181h2.C16618c;
import p268k0.AbstractC22086a;
import p390p1.C28633k1;
import p635y2.InterfaceC39147y;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13928c0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49661w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13988w0 f49662x;

    public /* synthetic */ C13928c0(C13988w0 c13988w0, int i13) {
        this.f49661w = i13;
        this.f49662x = c13988w0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13978t c13978t;
        C13978t c13978t2;
        switch (this.f49661w) {
            case 0:
                return new C2214e(this.f49662x, 4);
            case 1:
                long jLongValue = ((Long) obj).longValue();
                C13988w0 c13988w0 = this.f49662x;
                if (c13988w0.f49900a.m39690a().m78b(jLongValue)) {
                    c13988w0.m39805j();
                    c13988w0.m39808m(null);
                }
                return C23454a0.f92919a;
            case 2:
                long jLongValue2 = ((Long) obj).longValue();
                C13988w0 c13988w1 = this.f49662x;
                C13981u c13981uM39802g = c13988w1.m39802g();
                if (c13981uM39802g != null && (c13978t2 = c13981uM39802g.f49879a) != null && jLongValue2 == c13978t2.f49873c) {
                    c13988w1.f49915p.setValue(null);
                }
                C13981u c13981uM39802g2 = c13988w1.m39802g();
                if (c13981uM39802g2 != null && (c13978t = c13981uM39802g2.f49880b) != null && jLongValue2 == c13978t.f49873c) {
                    c13988w1.f49916q.setValue(null);
                }
                if (c13988w1.f49900a.m39690a().m78b(jLongValue2)) {
                    c13988w1.m39811p();
                }
                return C23454a0.f92919a;
            case 3:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) obj;
                C13988w0 c13988w2 = this.f49662x;
                C16618c c16618c = (C16618c) c13988w2.f49909j.getValue();
                if (c16618c == null) {
                    return null;
                }
                InterfaceC39147y interfaceC39147y2 = c13988w2.f49911l;
                if (interfaceC39147y2 != null) {
                    return AbstractC1113a.m3453d(c16618c, interfaceC39147y2, interfaceC39147y);
                }
                AbstractC22086a.m63161d("Required value was null.");
                throw new KotlinNothingValueException();
            case 4:
                InterfaceC39147y interfaceC39147y3 = (InterfaceC39147y) obj;
                C13988w0 c13988w3 = this.f49662x;
                c13988w3.f49911l = interfaceC39147y3;
                if (((Boolean) c13988w3.f49908i.getValue()).booleanValue() && c13988w3.m39802g() != null) {
                    C16617b c16617b = interfaceC39147y3 != null ? new C16617b(interfaceC39147y3.mo3510E(0L)) : null;
                    if (!AbstractC22676k.m65745e(c13988w3.f49910k, c16617b)) {
                        c13988w3.f49910k = c16617b;
                        c13988w3.m39809n();
                        c13988w3.m39811p();
                    }
                }
                return C23454a0.f92919a;
            case 5:
                C13988w0 c13988w4 = this.f49662x;
                C28633k1 c28633k1 = c13988w4.f49908i;
                EnumC15251w enumC15251w = (EnumC15251w) ((InterfaceC15250v) obj);
                if (!enumC15251w.m43353a() && ((Boolean) c28633k1.getValue()).booleanValue()) {
                    c13988w4.m39805j();
                }
                c28633k1.setValue(Boolean.valueOf(enumC15251w.m43353a()));
                return C23454a0.f92919a;
            case 6:
                this.f49662x.m39807l(((Boolean) obj).booleanValue());
                return C23454a0.f92919a;
            case 7:
                this.f49662x.m39808m((C13981u) obj);
                return C23454a0.f92919a;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                C13988w0 c13988w5 = this.f49662x;
                boolean zM78b = c13988w5.f49900a.m39690a().m78b(jLongValue3);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (zM78b) {
                    c13988w5.f49912m.setValue(c23454a0);
                    c13988w5.m39809n();
                    c13988w5.m39811p();
                }
                return c23454a0;
        }
    }
}
