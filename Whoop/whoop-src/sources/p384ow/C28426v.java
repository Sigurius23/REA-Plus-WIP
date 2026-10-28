package p384ow;

import com.nimbusds.jose.shaded.gson.JsonParseException;
import com.nimbusds.jose.shaded.gson.stream.MalformedJsonException;
import ih0.AbstractC18489d0;
import p596ww.C37653a;

/* JADX INFO: renamed from: ow.v */
/* JADX INFO: loaded from: classes6.dex */
public final enum C28426v extends EnumC28428x {
    public C28426v() {
        super("LONG_OR_DOUBLE", 2);
    }

    /* JADX INFO: renamed from: b */
    public static Double m86144b(String str, C37653a c37653a) throws MalformedJsonException {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (c37653a.f161372O != 1) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c37653a.m121060k(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e5) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Cannot parse ", str, "; at path ");
            sbM53375p.append(c37653a.m121060k(true));
            throw new JsonParseException(sbM53375p.toString(), e5);
        }
    }

    @Override // p384ow.EnumC28428x
    /* JADX INFO: renamed from: a */
    public final Number mo86143a(C37653a c37653a) {
        String strNextString = c37653a.nextString();
        if (strNextString.indexOf(46) >= 0) {
            return m86144b(strNextString, c37653a);
        }
        try {
            return Long.valueOf(Long.parseLong(strNextString));
        } catch (NumberFormatException unused) {
            return m86144b(strNextString, c37653a);
        }
    }
}
