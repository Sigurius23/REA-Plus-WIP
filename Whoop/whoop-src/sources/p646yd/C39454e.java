package p646yd;

import aws.smithy.kotlin.runtime.ClientException;
import ih0.AbstractC18489d0;
import m83.AbstractC25260n;
import p090df.EnumC11994c;
import p090df.EnumC11995d;
import p090df.EnumC11996e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yd.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C39454e implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C39454e f169735x = new C39454e(0);

    /* JADX INFO: renamed from: y */
    public static final C39454e f169736y = new C39454e(1);

    /* JADX INFO: renamed from: z */
    public static final C39454e f169737z = new C39454e(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169738w;

    public /* synthetic */ C39454e(int i13) {
        this.f169738w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC11996e enumC11996e;
        EnumC11994c enumC11994c;
        EnumC11995d enumC11995d;
        switch (this.f169738w) {
            case 0:
                String strValue = (String) obj;
                AbstractC22676k.m65750j(strValue, "strValue");
                EnumC11996e[] enumC11996eArrValues = EnumC11996e.values();
                int length = enumC11996eArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        enumC11996e = enumC11996eArrValues[i13];
                        if (!AbstractC39421y.m125921F(enumC11996e.name(), strValue, true)) {
                            i13++;
                        }
                    } else {
                        enumC11996e = null;
                    }
                }
                if (enumC11996e != null) {
                    return enumC11996e;
                }
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Value ", strValue, " is not supported, should be one of ");
                sbM53375p.append(AbstractC25260n.m74028D0(enumC11996eArrValues, ", ", null, null, null, 62));
                throw new ClientException(sbM53375p.toString());
            case 1:
                String strValue2 = (String) obj;
                AbstractC22676k.m65750j(strValue2, "strValue");
                EnumC11994c[] enumC11994cArrValues = EnumC11994c.values();
                int length2 = enumC11994cArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 < length2) {
                        enumC11994c = enumC11994cArrValues[i14];
                        if (!AbstractC39421y.m125921F(enumC11994c.name(), strValue2, true)) {
                            i14++;
                        }
                    } else {
                        enumC11994c = null;
                    }
                }
                if (enumC11994c != null) {
                    return enumC11994c;
                }
                StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("Value ", strValue2, " is not supported, should be one of ");
                sbM53375p2.append(AbstractC25260n.m74028D0(enumC11994cArrValues, ", ", null, null, null, 62));
                throw new ClientException(sbM53375p2.toString());
            default:
                String strValue3 = (String) obj;
                AbstractC22676k.m65750j(strValue3, "strValue");
                EnumC11995d[] enumC11995dArrValues = EnumC11995d.values();
                int length3 = enumC11995dArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length3) {
                        enumC11995d = enumC11995dArrValues[i15];
                        if (!AbstractC39421y.m125921F(enumC11995d.name(), strValue3, true)) {
                            i15++;
                        }
                    } else {
                        enumC11995d = null;
                    }
                }
                if (enumC11995d != null) {
                    return enumC11995d;
                }
                StringBuilder sbM53375p3 = AbstractC18489d0.m53375p("Value ", strValue3, " is not supported, should be one of ");
                sbM53375p3.append(AbstractC25260n.m74028D0(enumC11995dArrValues, ", ", null, null, null, 62));
                throw new ClientException(sbM53375p3.toString());
        }
    }
}
