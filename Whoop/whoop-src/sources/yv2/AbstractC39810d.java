package yv2;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: yv2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"", "pattern", "", "Lyv2/a;", "a", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/Locale;", "locale", "Lyv2/b;", "b", "(Ljava/util/Locale;)Lyv2/b;", "Lyb3/p;", "Lyb3/p;", "QUOTED_LITERAL", "Ljava/util/List;", "getMonthDayYearFieldOrder", "()Ljava/util/List;", "monthDayYearFieldOrder", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39810d {

    /* JADX INFO: renamed from: a */
    private static final C39412p f171569a = new C39412p("'[^']*'");

    /* JADX INFO: renamed from: b */
    private static final List<EnumC39807a> f171570b = AbstractC37056f.m118959K(EnumC39807a.MONTH, EnumC39807a.DAY, EnumC39807a.YEAR);

    /* JADX INFO: renamed from: yv2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q((Integer) ((Map.Entry) t14).getValue(), (Integer) ((Map.Entry) t15).getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List<EnumC39807a> m127628a(String pattern) {
        AbstractC22676k.m65750j(pattern, "pattern");
        String strM125852f = f171569a.m125852f(pattern, "");
        C23465k c23465k = new C23465k(EnumC39807a.DAY, Integer.valueOf(AbstractC39414r.m125887f0(strM125852f, 'd', 0, false, 6)));
        EnumC39807a enumC39807a = EnumC39807a.MONTH;
        int length = strM125852f.length();
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i13 = -1;
                break;
            }
            char cCharAt = strM125852f.charAt(i13);
            if (cCharAt == 'M' || cCharAt == 'L') {
                break;
            }
            i13++;
        }
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, new C23465k(enumC39807a, Integer.valueOf(i13)), new C23465k(EnumC39807a.YEAR, Integer.valueOf(AbstractC39414r.m125887f0(strM125852f, 'y', 0, false, 6))));
        Collection collectionValues = mapM73990Y.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() < 0) {
                    return f171570b;
                }
            }
        }
        List listM74152u1 = AbstractC25265s.m74152u1(mapM73990Y.entrySet(), new a());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it3 = listM74152u1.iterator();
        while (it3.hasNext()) {
            arrayList.add((EnumC39807a) ((Map.Entry) it3.next()).getKey());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final C39808b m127629b(Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "yMMMMd");
        String bestDateTimePattern2 = DateFormat.getBestDateTimePattern(locale, "yMMMd");
        AbstractC22676k.m65747g(bestDateTimePattern);
        List<EnumC39807a> listM127628a = m127628a(bestDateTimePattern);
        AbstractC22676k.m65747g(bestDateTimePattern2);
        return new C39808b(locale, listM127628a, bestDateTimePattern2);
    }
}
