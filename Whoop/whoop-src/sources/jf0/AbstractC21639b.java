package jf0;

import android.icu.text.NumberFormat;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import e93.AbstractC12889b;
import java.util.Arrays;
import or2.AbstractC28164g1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: jf0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroid/icu/text/NumberFormat;", "", "text", "", "b", "(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;", "", "c", "(D)Ljava/lang/String;", "", "a", "(D)Z", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21639b {
    /* JADX INFO: renamed from: a */
    private static final boolean m60890a(double d3) {
        return d3 % 1.0d == 0.0d;
    }

    /* JADX INFO: renamed from: b */
    public static final Number m60891b(NumberFormat numberFormat, String text) {
        AbstractC22676k.m65750j(numberFormat, "<this>");
        AbstractC22676k.m65750j(text, "text");
        int i13 = 0;
        for (int i14 = 0; i14 < text.length(); i14++) {
            if (text.charAt(i14) == ',') {
                i13++;
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < text.length(); i16++) {
            if (text.charAt(i16) == '.') {
                i15++;
            }
        }
        if (i13 > 1 || i15 > 1) {
            return null;
        }
        if (i13 > 0 && i15 > 0) {
            return null;
        }
        Number numberM85264a = AbstractC28164g1.m85264a(numberFormat, text);
        return (numberM85264a == null && (numberM85264a = AbstractC28164g1.m85264a(numberFormat, AbstractC39421y.m125927L(text, '.', DateTimeRange.lowerUpperDelimiter))) == null) ? AbstractC28164g1.m85264a(numberFormat, AbstractC39421y.m125927L(text, DateTimeRange.lowerUpperDelimiter, '.')) : numberM85264a;
    }

    /* JADX INFO: renamed from: c */
    public static final String m60892c(double d3) {
        return m60890a(d3) ? String.valueOf(AbstractC12889b.m36257W(d3)) : String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
    }
}
