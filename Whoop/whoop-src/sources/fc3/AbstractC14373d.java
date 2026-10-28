package fc3;

import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.EnumC11916a;
import dc3.InterfaceC11936u;
import dc3.InterfaceC11938w;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import l83.C23454a0;
import m83.AbstractC25265s;
import p007a6.C0410c;
import p007a6.C0458v;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: fc3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14373d implements InterfaceC14386q {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f52480w;

    /* JADX INFO: renamed from: x */
    public final int f52481x;

    /* JADX INFO: renamed from: y */
    public final EnumC11916a f52482y;

    public AbstractC14373d(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        this.f52480w = interfaceC30063j;
        this.f52481x = i13;
        this.f52482y = enumC11916a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // fc3.InterfaceC14386q
    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l mo36565b(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        InterfaceC30063j interfaceC30063j2 = this.f52480w;
        InterfaceC30063j interfaceC30063jPlus = interfaceC30063j.plus(interfaceC30063j2);
        EnumC11916a enumC11916a2 = EnumC11916a.f38982w;
        EnumC11916a enumC11916a3 = this.f52482y;
        int i14 = this.f52481x;
        if (enumC11916a == enumC11916a2) {
            if (i14 != -3) {
                if (i13 == -3) {
                    i13 = i14;
                } else if (i14 != -2) {
                    if (i13 == -2) {
                        i13 = i14;
                    } else {
                        i13 += i14;
                        if (i13 < 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC11916a = enumC11916a3;
        }
        return (AbstractC22676k.m65745e(interfaceC30063jPlus, interfaceC30063j2) && i13 == i14 && enumC11916a == enumC11916a3) ? this : mo36559f(interfaceC30063jPlus, i13, enumC11916a);
    }

    /* JADX INFO: renamed from: c */
    public String mo36561c() {
        return null;
    }

    @Override // ec3.InterfaceC13058l
    public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objM8719m = AbstractC3006f0.m8719m(new C0458v(interfaceC13062m, this, (InterfaceC30057d) null, 6), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo36558e(InterfaceC11936u interfaceC11936u, InterfaceC30057d interfaceC30057d);

    /* JADX INFO: renamed from: f */
    public abstract AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a);

    /* JADX INFO: renamed from: g */
    public InterfaceC13058l mo36562g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC11938w mo36563h(InterfaceC2994c0 interfaceC2994c0) {
        int i13 = this.f52481x;
        if (i13 == -3) {
            i13 = -2;
        }
        EnumC2998d0 enumC2998d0 = EnumC2998d0.f12006y;
        InterfaceC4351m c0410c = new C0410c(this, null, 15);
        C11935t c11935t = new C11935t(AbstractC3006f0.m8695A(interfaceC2994c0, this.f52480w), AbstractC30060g.m92111d(i13, 4, this.f52482y), true, true);
        c11935t.m8676b0(enumC2998d0, c11935t, c0410c);
        return c11935t;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo36561c = mo36561c();
        if (strMo36561c != null) {
            arrayList.add(strMo36561c);
        }
        C30064k c30064k = C30064k.f122676w;
        InterfaceC30063j interfaceC30063j = this.f52480w;
        if (interfaceC30063j != c30064k) {
            arrayList.add("context=" + interfaceC30063j);
        }
        int i13 = this.f52481x;
        if (i13 != -3) {
            AbstractC38963t7.m124389s(i13, "capacity=", arrayList);
        }
        EnumC11916a enumC11916a = EnumC11916a.f38982w;
        EnumC11916a enumC11916a2 = this.f52482y;
        if (enumC11916a2 != enumC11916a) {
            arrayList.add("onBufferOverflow=" + enumC11916a2);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getClass().getSimpleName());
        sb4.append('[');
        return AbstractC25012a.m73377j(sb4, AbstractC25265s.m74110N0(arrayList, ", ", null, null, null, 62), ']');
    }
}
