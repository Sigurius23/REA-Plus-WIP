package tp1;

import com.whoop.design.util.TextResource;
import l83.C23471q;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tp1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Ltp1/a;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "buttonDisplay", "", "currentDate", "maxDate", "minDate", "Ll83/q;", "", "calendarDialogStartDate", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll83/q;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "b", "getButtonDisplay", "c", "Ljava/lang/String;", "d", "e", "f", "Ll83/q;", "()Ll83/q;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34061a {

    /* JADX INFO: renamed from: g */
    public static final int f142740g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource buttonDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String maxDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String minDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C23471q calendarDialogStartDate;

    public C34061a(TextResource titleDisplay, TextResource buttonDisplay, String currentDate, String maxDate, String minDate, C23471q calendarDialogStartDate) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        AbstractC22676k.m65750j(calendarDialogStartDate, "calendarDialogStartDate");
        this.titleDisplay = titleDisplay;
        this.buttonDisplay = buttonDisplay;
        this.currentDate = currentDate;
        this.maxDate = maxDate;
        this.minDate = minDate;
        this.calendarDialogStartDate = calendarDialogStartDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23471q getCalendarDialogStartDate() {
        return this.calendarDialogStartDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34061a)) {
            return false;
        }
        C34061a c34061a = (C34061a) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c34061a.titleDisplay) && AbstractC22676k.m65745e(this.buttonDisplay, c34061a.buttonDisplay) && AbstractC22676k.m65745e(this.currentDate, c34061a.currentDate) && AbstractC22676k.m65745e(this.maxDate, c34061a.maxDate) && AbstractC22676k.m65745e(this.minDate, c34061a.minDate) && AbstractC22676k.m65745e(this.calendarDialogStartDate, c34061a.calendarDialogStartDate);
    }

    public int hashCode() {
        return this.calendarDialogStartDate.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.buttonDisplay, 31), 31, this.currentDate), 31, this.maxDate), 31, this.minDate);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.buttonDisplay;
        String str = this.currentDate;
        String str2 = this.maxDate;
        String str3 = this.minDate;
        C23471q c23471q = this.calendarDialogStartDate;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DueDateDrawerViewState(titleDisplay=", textResource, ", buttonDisplay=", textResource2, ", currentDate=");
        AbstractC11266d.m30444B(sbM106658q, str, ", maxDate=", str2, ", minDate=");
        sbM106658q.append(str3);
        sbM106658q.append(", calendarDialogStartDate=");
        sbM106658q.append(c23471q);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
