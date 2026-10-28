package yl0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import or2.AbstractC28193q0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yl0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"", "decimalPlaces", "Ljava/util/Locale;", "locale", "Ljava/text/NumberFormat;", "d", "(ILjava/util/Locale;)Ljava/text/NumberFormat;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/Locale;)Ljava/text/NumberFormat;", "", "text", "", "f", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;", "e", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "value", "a", "(DILjava/util/Locale;)Ljava/lang/String;", "g", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Double;", "", "b", "(Ljava/lang/String;ILjava/util/Locale;)Z", "min", "max", "c", "(Ljava/lang/String;DDLjava/util/Locale;)Z", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39633p {
    /* JADX INFO: renamed from: a */
    public static final String m126689a(double d3, int i13, Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        String str = m126692d(i13, locale).format(d3);
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m126690b(String text, int i13, Locale locale) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(locale, "locale");
        if (text.length() == 0) {
            return true;
        }
        List<String> listM126694f = m126694f(text, locale);
        if (listM126694f == null) {
            return false;
        }
        return listM126694f.size() != 2 || (i13 != 0 && listM126694f.get(1).length() <= i13);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m126691c(String text, double d3, double d14, Locale locale) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(locale, "locale");
        boolean z4 = false;
        if (text.length() == 0) {
            return false;
        }
        Double dM126695g = m126695g(text, locale);
        if (dM126695g == null) {
            return true;
        }
        double dDoubleValue = dM126695g.doubleValue();
        if (d3 <= dDoubleValue && dDoubleValue <= d14) {
            z4 = true;
        }
        return !z4;
    }

    /* JADX INFO: renamed from: d */
    private static final NumberFormat m126692d(int i13, Locale locale) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setGroupingUsed(false);
        numberInstance.setMinimumFractionDigits(i13);
        numberInstance.setMaximumFractionDigits(i13);
        return numberInstance;
    }

    /* JADX INFO: renamed from: e */
    public static final Locale m126693e(Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        return AbstractC28193q0.m85323b(locale);
    }

    /* JADX INFO: renamed from: f */
    private static final List<String> m126694f(String str, Locale locale) {
        List<String> listM125905x0 = AbstractC39414r.m125905x0(str, new char[]{DecimalFormatSymbols.getInstance(locale).getDecimalSeparator()}, 0, 6);
        if (listM125905x0.size() > 2) {
            return null;
        }
        List<String> list = listM125905x0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                for (int i13 = 0; i13 < str2.length(); i13++) {
                    if (!Character.isDigit(str2.charAt(i13))) {
                        return null;
                    }
                }
            }
        }
        return listM125905x0;
    }

    /* JADX INFO: renamed from: g */
    public static final Double m126695g(String text, Locale locale) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(locale, "locale");
        List<String> listM126694f = m126694f(text, locale);
        if (listM126694f == null) {
            return null;
        }
        List<String> list = listM126694f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                for (int i13 = 0; i13 < str.length(); i13++) {
                    if (Character.isDigit(str.charAt(i13))) {
                        ParsePosition parsePosition = new ParsePosition(0);
                        Number number = m126696h(locale).parse(text, parsePosition);
                        if (number != null && parsePosition.getErrorIndex() == -1 && parsePosition.getIndex() == text.length()) {
                            return Double.valueOf(number.doubleValue());
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private static final NumberFormat m126696h(Locale locale) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setGroupingUsed(false);
        return numberInstance;
    }
}
