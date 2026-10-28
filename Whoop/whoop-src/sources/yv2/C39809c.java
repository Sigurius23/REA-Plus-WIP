package yv2;

import e93.AbstractC12889b;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b2\b\u0081\b\u0018\u0000 R2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0017J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00106R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b;\u00106R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b=\u00106R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b?\u00106R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\bA\u00106R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\bC\u00106R\u0017\u0010G\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010\u001fR\u0017\u0010I\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010E\u001a\u0004\bH\u0010\u001fR\u0017\u0010L\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010\u001fR\u0017\u0010O\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b0\u0010\u001dR\u0017\u0010Q\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bP\u0010N\u001a\u0004\b8\u0010\u001d¨\u0006S"}, m65681d2 = {"Lyv2/c;", "", "Ljava/time/LocalDate;", "floor", "ceiling", "selected", "Lyv2/b;", "localeFormat", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Lyv2/b;)V", "Lyv2/a;", "field", "", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lyv2/a;)Ljava/util/List;", "", "i", "(Lyv2/a;)I", "index", "k", "(Lyv2/a;I)Lyv2/c;", "m", "(I)Lyv2/c;", "l", "j", "a", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Lyv2/b;)Lyv2/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "year", "g", "(I)Ljava/util/List;", "month", "c", "(II)Ljava/util/List;", "Ljava/time/LocalDate;", "getFloor", "()Ljava/time/LocalDate;", "b", "getCeiling", "getSelected", "d", "Lyv2/b;", "getLocaleFormat", "()Lyv2/b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "fieldOrder", "f", "getYearValues", "yearValues", "getMonthValues", "monthValues", "getDayValues", "dayValues", "getYearOptions", "yearOptions", "getMonthOptions", "monthOptions", "getDayOptions", "dayOptions", "I", "getSelectedYearIndex", "selectedYearIndex", "getSelectedMonthIndex", "selectedMonthIndex", "n", "getSelectedDayIndex", "selectedDayIndex", "o", "Ljava/lang/String;", "displayLabel", "p", "selectedIso", "q", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39809c {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r */
    public static final int f171551r = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalDate floor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate ceiling;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDate selected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39808b localeFormat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<EnumC39807a> fieldOrder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<Integer> yearValues;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<Integer> monthValues;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<Integer> dayValues;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<String> yearOptions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<String> monthOptions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<String> dayOptions;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int selectedYearIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int selectedMonthIndex;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int selectedDayIndex;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String displayLabel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String selectedIso;

    /* JADX INFO: renamed from: yv2.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lyv2/c$a;", "", "<init>", "()V", "", "floorIso", "ceilingIso", "selectedIso", "Lyv2/b;", "localeFormat", "Lyv2/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyv2/b;)Lyv2/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C39809c m127627a(String floorIso, String ceilingIso, String selectedIso, C39808b localeFormat) {
            AbstractC22676k.m65750j(floorIso, "floorIso");
            AbstractC22676k.m65750j(ceilingIso, "ceilingIso");
            AbstractC22676k.m65750j(selectedIso, "selectedIso");
            AbstractC22676k.m65750j(localeFormat, "localeFormat");
            LocalDate localDate = LocalDate.parse(floorIso);
            LocalDate localDate2 = LocalDate.parse(ceilingIso);
            LocalDate localDate3 = (LocalDate) AbstractC12889b.m36289s(LocalDate.parse(selectedIso), localDate, localDate2);
            AbstractC22676k.m65747g(localDate);
            AbstractC22676k.m65747g(localDate2);
            return new C39809c(localDate, localDate2, localDate3, localeFormat);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: yv2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171568a;

        static {
            int[] iArr = new int[EnumC39807a.values().length];
            try {
                iArr[EnumC39807a.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39807a.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39807a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f171568a = iArr;
        }
    }

    public C39809c(LocalDate floor, LocalDate ceiling, LocalDate selected, C39808b localeFormat) {
        AbstractC22676k.m65750j(floor, "floor");
        AbstractC22676k.m65750j(ceiling, "ceiling");
        AbstractC22676k.m65750j(selected, "selected");
        AbstractC22676k.m65750j(localeFormat, "localeFormat");
        this.floor = floor;
        this.ceiling = ceiling;
        this.selected = selected;
        this.localeFormat = localeFormat;
        this.fieldOrder = localeFormat.m127612b();
        List<Integer> listM74093D1 = AbstractC25265s.m74093D1(new C18284j(floor.getYear(), ceiling.getYear(), 1));
        this.yearValues = listM74093D1;
        this.monthValues = m127616g(selected.getYear());
        this.dayValues = m127615c(selected.getYear(), selected.getMonthValue());
        List<Integer> list = listM74093D1;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        this.yearOptions = arrayList;
        List<Integer> list2 = this.monthValues;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(LocalDate.of(this.selected.getYear(), ((Number) it3.next()).intValue(), 1).format(this.localeFormat.getMonthFormatter()));
        }
        this.monthOptions = arrayList2;
        List<Integer> list3 = this.dayValues;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(String.valueOf(((Number) it4.next()).intValue()));
        }
        this.dayOptions = arrayList3;
        int iIndexOf = this.yearValues.indexOf(Integer.valueOf(this.selected.getYear()));
        this.selectedYearIndex = iIndexOf < 0 ? 0 : iIndexOf;
        int iIndexOf2 = this.monthValues.indexOf(Integer.valueOf(this.selected.getMonthValue()));
        this.selectedMonthIndex = iIndexOf2 < 0 ? 0 : iIndexOf2;
        int iIndexOf3 = this.dayValues.indexOf(Integer.valueOf(this.selected.getDayOfMonth()));
        this.selectedDayIndex = iIndexOf3 >= 0 ? iIndexOf3 : 0;
        String str = this.selected.format(this.localeFormat.getDisplayFormatter());
        AbstractC22676k.m65749i(str, "format(...)");
        this.displayLabel = str;
        String string = this.selected.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        this.selectedIso = string;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39809c m127614b(C39809c c39809c, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, C39808b c39808b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            localDate = c39809c.floor;
        }
        if ((i13 & 2) != 0) {
            localDate2 = c39809c.ceiling;
        }
        if ((i13 & 4) != 0) {
            localDate3 = c39809c.selected;
        }
        if ((i13 & 8) != 0) {
            c39808b = c39809c.localeFormat;
        }
        return c39809c.m127617a(localDate, localDate2, localDate3, c39808b);
    }

    /* JADX INFO: renamed from: c */
    private final List<Integer> m127615c(int year, int month) {
        int iLengthOfMonth = LocalDate.of(year, month, 1).lengthOfMonth();
        int dayOfMonth = (year == this.floor.getYear() && month == this.floor.getMonthValue()) ? this.floor.getDayOfMonth() : 1;
        if (year == this.ceiling.getYear() && month == this.ceiling.getMonthValue()) {
            iLengthOfMonth = this.ceiling.getDayOfMonth();
        }
        return AbstractC25265s.m74093D1(new C18284j(dayOfMonth, iLengthOfMonth, 1));
    }

    /* JADX INFO: renamed from: g */
    private final List<Integer> m127616g(int year) {
        return AbstractC25265s.m74093D1(new C18284j(year == this.floor.getYear() ? this.floor.getMonthValue() : 1, year == this.ceiling.getYear() ? this.ceiling.getMonthValue() : 12, 1));
    }

    /* JADX INFO: renamed from: a */
    public final C39809c m127617a(LocalDate floor, LocalDate ceiling, LocalDate selected, C39808b localeFormat) {
        AbstractC22676k.m65750j(floor, "floor");
        AbstractC22676k.m65750j(ceiling, "ceiling");
        AbstractC22676k.m65750j(selected, "selected");
        AbstractC22676k.m65750j(localeFormat, "localeFormat");
        return new C39809c(floor, ceiling, selected, localeFormat);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    /* JADX INFO: renamed from: e */
    public final List<EnumC39807a> m127619e() {
        return this.fieldOrder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39809c)) {
            return false;
        }
        C39809c c39809c = (C39809c) other;
        return AbstractC22676k.m65745e(this.floor, c39809c.floor) && AbstractC22676k.m65745e(this.ceiling, c39809c.ceiling) && AbstractC22676k.m65745e(this.selected, c39809c.selected) && AbstractC22676k.m65745e(this.localeFormat, c39809c.localeFormat);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedIso() {
        return this.selectedIso;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m127621h(EnumC39807a field) {
        AbstractC22676k.m65750j(field, "field");
        int i13 = b.f171568a[field.ordinal()];
        if (i13 == 1) {
            return this.dayOptions;
        }
        if (i13 == 2) {
            return this.monthOptions;
        }
        if (i13 == 3) {
            return this.yearOptions;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        return this.localeFormat.hashCode() + AbstractC13673n.m38558e(this.selected, AbstractC13673n.m38558e(this.ceiling, this.floor.hashCode() * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final int m127622i(EnumC39807a field) {
        AbstractC22676k.m65750j(field, "field");
        int i13 = b.f171568a[field.ordinal()];
        if (i13 == 1) {
            return this.selectedDayIndex;
        }
        if (i13 == 2) {
            return this.selectedMonthIndex;
        }
        if (i13 == 3) {
            return this.selectedYearIndex;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    public final C39809c m127623j(int index) {
        Integer num = (Integer) AbstractC25265s.m74102I0(index, this.dayValues);
        if (num == null) {
            return this;
        }
        LocalDate localDateOf = LocalDate.of(this.selected.getYear(), this.selected.getMonthValue(), num.intValue());
        AbstractC22676k.m65749i(localDateOf, "of(...)");
        return m127614b(this, null, null, localDateOf, null, 11, null);
    }

    /* JADX INFO: renamed from: k */
    public final C39809c m127624k(EnumC39807a field, int index) {
        AbstractC22676k.m65750j(field, "field");
        int i13 = b.f171568a[field.ordinal()];
        if (i13 == 1) {
            return m127623j(index);
        }
        if (i13 == 2) {
            return m127625l(index);
        }
        if (i13 == 3) {
            return m127626m(index);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public final C39809c m127625l(int index) {
        Integer num = (Integer) AbstractC25265s.m74102I0(index, this.monthValues);
        if (num == null) {
            return this;
        }
        int iIntValue = num.intValue();
        List<Integer> listM127615c = m127615c(this.selected.getYear(), iIntValue);
        LocalDate localDateOf = LocalDate.of(this.selected.getYear(), iIntValue, AbstractC12889b.m36284n(this.selected.getDayOfMonth(), ((Number) AbstractC25265s.m74096F0(listM127615c)).intValue(), ((Number) AbstractC25265s.m74112P0(listM127615c)).intValue()));
        AbstractC22676k.m65749i(localDateOf, "of(...)");
        return m127614b(this, null, null, localDateOf, null, 11, null);
    }

    /* JADX INFO: renamed from: m */
    public final C39809c m127626m(int index) {
        Integer num = (Integer) AbstractC25265s.m74102I0(index, this.yearValues);
        if (num == null) {
            return this;
        }
        int iIntValue = num.intValue();
        List<Integer> listM127616g = m127616g(iIntValue);
        int iM36284n = AbstractC12889b.m36284n(this.selected.getMonthValue(), ((Number) AbstractC25265s.m74096F0(listM127616g)).intValue(), ((Number) AbstractC25265s.m74112P0(listM127616g)).intValue());
        List<Integer> listM127615c = m127615c(iIntValue, iM36284n);
        LocalDate localDateOf = LocalDate.of(iIntValue, iM36284n, AbstractC12889b.m36284n(this.selected.getDayOfMonth(), ((Number) AbstractC25265s.m74096F0(listM127615c)).intValue(), ((Number) AbstractC25265s.m74112P0(listM127615c)).intValue()));
        AbstractC22676k.m65749i(localDateOf, "of(...)");
        return m127614b(this, null, null, localDateOf, null, 11, null);
    }

    public String toString() {
        return "OneRepMaxDateWheelState(floor=" + this.floor + ", ceiling=" + this.ceiling + ", selected=" + this.selected + ", localeFormat=" + this.localeFormat + ")";
    }
}
