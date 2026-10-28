package yv2;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yv2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010$\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u0014\u0010!¨\u0006%"}, m65681d2 = {"Lyv2/b;", "", "Ljava/util/Locale;", "locale", "", "Lyv2/a;", "fieldOrder", "", "displayPattern", "<init>", "(Ljava/util/Locale;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getDisplayPattern", "Ljava/time/format/DateTimeFormatter;", "d", "Ljava/time/format/DateTimeFormatter;", "()Ljava/time/format/DateTimeFormatter;", "monthFormatter", "e", "displayFormatter", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39808b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<EnumC39807a> fieldOrder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String displayPattern;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final DateTimeFormatter monthFormatter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final DateTimeFormatter displayFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    public C39808b(Locale locale, List<? extends EnumC39807a> fieldOrder, String displayPattern) {
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(fieldOrder, "fieldOrder");
        AbstractC22676k.m65750j(displayPattern, "displayPattern");
        this.locale = locale;
        this.fieldOrder = fieldOrder;
        this.displayPattern = displayPattern;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMMM", locale);
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.monthFormatter = dateTimeFormatterOfPattern;
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(displayPattern, locale);
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern2, "ofPattern(...)");
        this.displayFormatter = dateTimeFormatterOfPattern2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTimeFormatter getDisplayFormatter() {
        return this.displayFormatter;
    }

    /* JADX INFO: renamed from: b */
    public final List<EnumC39807a> m127612b() {
        return this.fieldOrder;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTimeFormatter getMonthFormatter() {
        return this.monthFormatter;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39808b)) {
            return false;
        }
        C39808b c39808b = (C39808b) other;
        return AbstractC22676k.m65745e(this.locale, c39808b.locale) && AbstractC22676k.m65745e(this.fieldOrder, c39808b.fieldOrder) && AbstractC22676k.m65745e(this.displayPattern, c39808b.displayPattern);
    }

    public int hashCode() {
        return this.displayPattern.hashCode() + AbstractC11895b.m31983b(this.locale.hashCode() * 31, 31, this.fieldOrder);
    }

    public String toString() {
        Locale locale = this.locale;
        List<EnumC39807a> list = this.fieldOrder;
        String str = this.displayPattern;
        StringBuilder sb4 = new StringBuilder("OneRepMaxDateLocaleFormat(locale=");
        sb4.append(locale);
        sb4.append(", fieldOrder=");
        sb4.append(list);
        sb4.append(", displayPattern=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
