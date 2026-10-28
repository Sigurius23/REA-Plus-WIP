package p715kotlin.reflect.jvm.internal;

import aa3.AbstractC0645p;
import aa3.C0606b1;
import aa3.C0612d1;
import aa3.C0615e1;
import aa3.C0641n0;
import aa3.C0644o0;
import aa3.C0648q0;
import aa3.EnumC0621g1;
import aa3.EnumC0639m1;
import aa3.EnumC0642n1;
import aa3.EnumC0647q;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "arity", "Laa3/n0;", "createFunctionKmClass", "(I)Laa3/n0;", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BuiltinsKt {
    public static final C0641n0 createFunctionKmClass(int i13) {
        C0641n0 c0641n0 = new C0641n0();
        String str = "kotlin/Function" + i13;
        AbstractC22676k.m65750j(str, "<set-?>");
        c0641n0.f2241x = str;
        EnumC0647q enumC0647q = EnumC0647q.INTERFACE;
        InterfaceC21493z[] interfaceC21493zArr = AbstractC0645p.f2250a;
        AbstractC22676k.m65750j(enumC0647q, "<set-?>");
        C41113q c41113q = AbstractC0645p.f2253d;
        InterfaceC21493z[] interfaceC21493zArr2 = AbstractC0645p.f2250a;
        c41113q.m133461M(c0641n0, interfaceC21493zArr2[9], enumC0647q);
        EnumC0639m1 enumC0639m1 = EnumC0639m1.ABSTRACT;
        AbstractC22676k.m65750j(enumC0639m1, "<set-?>");
        AbstractC0645p.f2251b.m133461M(c0641n0, interfaceC21493zArr2[7], enumC0639m1);
        EnumC0642n1 enumC0642n1 = EnumC0642n1.PUBLIC;
        AbstractC22676k.m65750j(enumC0642n1, "<set-?>");
        AbstractC0645p.f2252c.m133461M(c0641n0, interfaceC21493zArr2[8], enumC0642n1);
        ArrayList arrayList = c0641n0.f2242y;
        if (1 <= i13) {
            int i14 = 1;
            while (true) {
                arrayList.add(new C0612d1(AbstractC2875y.m8295h(i14, "P"), i14, EnumC0621g1.f2184x));
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        int i15 = i13 + 1;
        arrayList.add(new C0612d1("R", i15, EnumC0621g1.f2185y));
        C0606b1 c0606b1 = new C0606b1(0);
        c0606b1.f2153b = new C0644o0("kotlin/Function");
        EnumC0621g1 enumC0621g1 = EnumC0621g1.f2183w;
        C0606b1 c0606b2 = new C0606b1(0);
        c0606b2.f2153b = new C0648q0(i15);
        c0606b1.f2154c.add(new C0615e1(enumC0621g1, c0606b2));
        c0641n0.f2243z.add(c0606b1);
        return c0641n0;
    }
}
