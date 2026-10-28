package cp1;

import com.whoop.design.util.TextResource;
import l83.C23471q;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cp1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001f\u0010\u000f¨\u0006!"}, m65681d2 = {"Lcp1/m;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "button", "Ll83/q;", "", "calendarDialogStartDate", "", "maxDate", "minDate", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll83/q;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Ll83/q;", "()Ll83/q;", "e", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11026m {

    /* JADX INFO: renamed from: g */
    public static final int f34602g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource button;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23471q calendarDialogStartDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String maxDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String minDate;

    public C11026m(TextResource title, TextResource description, TextResource button, C23471q calendarDialogStartDate, String maxDate, String minDate) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(calendarDialogStartDate, "calendarDialogStartDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        this.title = title;
        this.description = description;
        this.button = button;
        this.calendarDialogStartDate = calendarDialogStartDate;
        this.maxDate = maxDate;
        this.minDate = minDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23471q getCalendarDialogStartDate() {
        return this.calendarDialogStartDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11026m)) {
            return false;
        }
        C11026m c11026m = (C11026m) other;
        return AbstractC22676k.m65745e(this.title, c11026m.title) && AbstractC22676k.m65745e(this.description, c11026m.description) && AbstractC22676k.m65745e(this.button, c11026m.button) && AbstractC22676k.m65745e(this.calendarDialogStartDate, c11026m.calendarDialogStartDate) && AbstractC22676k.m65745e(this.maxDate, c11026m.maxDate) && AbstractC22676k.m65745e(this.minDate, c11026m.minDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.minDate.hashCode() + AbstractC11266d.m30450d((this.calendarDialogStartDate.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.button, 31)) * 31, 31, this.maxDate);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.button;
        C23471q c23471q = this.calendarDialogStartDate;
        String str = this.maxDate;
        String str2 = this.minDate;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MciPregnancyDueDateState(title=", textResource, ", description=", textResource2, ", button=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", calendarDialogStartDate=");
        sbM106658q.append(c23471q);
        sbM106658q.append(", maxDate=");
        return AbstractC11266d.m30464r(sbM106658q, str, ", minDate=", str2, ")");
    }
}
