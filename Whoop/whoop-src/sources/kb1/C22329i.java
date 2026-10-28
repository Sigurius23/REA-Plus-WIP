package kb1;

import i93.C18286l;
import i93.C18287m;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kb1.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lkb1/i;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Ljava/time/DayOfWeek;", "b", "(Ljava/util/Locale;)Ljava/time/DayOfWeek;", "", "", "a", "(Ljava/util/Locale;)Ljava/util/List;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22329i {

    /* JADX INFO: renamed from: a */
    public static final C22329i f87163a = new C22329i();

    private C22329i() {
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m64212a(Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        DayOfWeek dayOfWeekM64213b = m64213b(locale);
        C18287m c18287m = new C18287m(0L, 6L);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18287m, 10));
        Iterator it = c18287m.iterator();
        while (true) {
            C18286l c18286l = (C18286l) it;
            if (!c18286l.f71146y) {
                return arrayList;
            }
            String displayName = dayOfWeekM64213b.plus(c18286l.nextLong()).getDisplayName(TextStyle.SHORT, locale);
            AbstractC22676k.m65749i(displayName, "getDisplayName(...)");
            String upperCase = displayName.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
    }

    /* JADX INFO: renamed from: b */
    public final DayOfWeek m64213b(Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        DayOfWeek firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek();
        AbstractC22676k.m65749i(firstDayOfWeek, "getFirstDayOfWeek(...)");
        return firstDayOfWeek;
    }
}
