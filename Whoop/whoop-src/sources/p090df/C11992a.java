package p090df;

import aws.smithy.kotlin.runtime.ClientException;
import bg.EnumC3218m;
import ih0.AbstractC18489d0;
import m83.AbstractC25260n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11992a implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C11992a f39478w = new C11992a();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC3218m enumC3218m;
        String strValue = (String) obj;
        AbstractC22676k.m65750j(strValue, "strValue");
        EnumC3218m[] enumC3218mArrValues = EnumC3218m.values();
        int length = enumC3218mArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC3218m = null;
                break;
            }
            enumC3218m = enumC3218mArrValues[i13];
            if (AbstractC39421y.m125921F(enumC3218m.name(), strValue, true)) {
                break;
            }
            i13++;
        }
        if (enumC3218m != null) {
            return enumC3218m;
        }
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Value ", strValue, " is not supported, should be one of ");
        sbM53375p.append(AbstractC25260n.m74028D0(enumC3218mArrValues, ", ", null, null, null, 62));
        throw new ClientException(sbM53375p.toString());
    }
}
