package p163g1;

import bc3.C3033m;
import ge3.AbstractC15751g;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.n6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15092n6 {

    /* JADX INFO: renamed from: a */
    public final C25437c f56506a = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: b */
    public final C28633k1 f56507b = AbstractC28683x.m87272z(null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m43161a(String str, EnumC15030h6 enumC15030h6, AbstractC32269c abstractC32269c) {
        C15082m6 c15082m6;
        InterfaceC25435a interfaceC25435a;
        String str2;
        String str3;
        InterfaceC25435a interfaceC25435a2;
        if (abstractC32269c instanceof C15082m6) {
            c15082m6 = (C15082m6) abstractC32269c;
            int i13 = c15082m6.f56464G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15082m6.f56464G = i13 - Integer.MIN_VALUE;
            } else {
                c15082m6 = new C15082m6(this, abstractC32269c);
            }
        } else {
            c15082m6 = new C15082m6(this, abstractC32269c);
        }
        Object obj = c15082m6.f56462E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15082m6.f56464G;
        C28633k1 c28633k1 = this.f56507b;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c15082m6.f56465w = str;
                    c15082m6.f56466x = null;
                    c15082m6.f56467y = enumC15030h6;
                    interfaceC25435a = this.f56506a;
                    c15082m6.f56468z = interfaceC25435a;
                    c15082m6.f56464G = 1;
                    if (interfaceC25435a.mo68211b(c15082m6) != enumC31071a) {
                        str2 = null;
                        str3 = str;
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = c15082m6.f56468z;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c28633k1.setValue(null);
                        interfaceC25435a2.mo68214i(null);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        c28633k1.setValue(null);
                        throw th;
                    }
                }
                InterfaceC25435a interfaceC25435a3 = c15082m6.f56468z;
                enumC15030h6 = c15082m6.f56467y;
                str2 = c15082m6.f56466x;
                String str4 = c15082m6.f56465w;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
                str3 = str4;
                c15082m6.f56465w = str3;
                c15082m6.f56466x = str2;
                c15082m6.f56467y = enumC15030h6;
                c15082m6.f56468z = interfaceC25435a;
                c15082m6.f56464G = 2;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c15082m6));
                c3033m.m8774s();
                c28633k1.setValue(new C15072l6(str3, str2, enumC15030h6, c3033m));
                Object objM8773r = c3033m.m8773r();
                if (objM8773r != enumC31071a) {
                    InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
                    obj = objM8773r;
                    interfaceC25435a2 = interfaceC25435a4;
                    c28633k1.setValue(null);
                    interfaceC25435a2.mo68214i(null);
                    return obj;
                }
                return enumC31071a;
            } catch (Throwable th4) {
                th = th4;
                c28633k1.setValue(null);
                throw th;
            }
        } catch (Throwable th5) {
            str.mo68214i(null);
            throw th5;
        }
    }
}
