package p384ow;

import java.io.IOException;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: ow.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C28414j extends AbstractC28430z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114609a;

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        switch (this.f114609a) {
            case 0:
                if (c37653a.m121062o0() != 9) {
                    return Double.valueOf(c37653a.nextDouble());
                }
                c37653a.m121053T();
                return null;
            case 1:
                if (c37653a.m121062o0() != 9) {
                    return Float.valueOf((float) c37653a.nextDouble());
                }
                c37653a.m121053T();
                return null;
            default:
                if (c37653a.m121062o0() != 9) {
                    return Long.valueOf(c37653a.nextLong());
                }
                c37653a.m121053T();
                return null;
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        switch (this.f114609a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C28417m.m86134a(dDoubleValue);
                    c37654b.m121070a0(dDoubleValue);
                } else {
                    c37654b.m121076m();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C28417m.m86134a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c37654b.m121077o0(numberValueOf);
                } else {
                    c37654b.m121076m();
                }
                break;
            default:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    c37654b.m121078p0(number2.toString());
                } else {
                    c37654b.m121076m();
                }
                break;
        }
    }
}
