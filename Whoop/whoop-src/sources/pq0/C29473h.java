package pq0;

import com.whoop.community.share.WidgetCollectionName;
import or2.C28204u;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pq0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lpq0/h;", "", "", "selectedDate", "Lcom/whoop/community/share/WidgetCollectionName;", "widgetCollectionToDisplay", "<init>", "(Ljava/lang/String;Lcom/whoop/community/share/WidgetCollectionName;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSelectedDate", "setSelectedDate", "(Ljava/lang/String;)V", "b", "Lcom/whoop/community/share/WidgetCollectionName;", "getWidgetCollectionToDisplay", "()Lcom/whoop/community/share/WidgetCollectionName;", "setWidgetCollectionToDisplay", "(Lcom/whoop/community/share/WidgetCollectionName;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29473h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String selectedDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private WidgetCollectionName widgetCollectionToDisplay;

    public C29473h(String selectedDate, WidgetCollectionName widgetCollectionToDisplay) {
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(widgetCollectionToDisplay, "widgetCollectionToDisplay");
        this.selectedDate = selectedDate;
        this.widgetCollectionToDisplay = widgetCollectionToDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29473h)) {
            return false;
        }
        C29473h c29473h = (C29473h) other;
        return AbstractC22676k.m65745e(this.selectedDate, c29473h.selectedDate) && this.widgetCollectionToDisplay == c29473h.widgetCollectionToDisplay;
    }

    public int hashCode() {
        return this.widgetCollectionToDisplay.hashCode() + (this.selectedDate.hashCode() * 31);
    }

    public String toString() {
        return "ShareWidgetButtonViewState(selectedDate=" + this.selectedDate + ", widgetCollectionToDisplay=" + this.widgetCollectionToDisplay + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C29473h(String str, WidgetCollectionName widgetCollectionName, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C28204u.Companion companion = C28204u.INSTANCE;
            LocalDate localDateNow = LocalDate.now();
            AbstractC22676k.m65749i(localDateNow, "now(...)");
            str = companion.m85358a(localDateNow, "yyyy-MM-dd");
        }
        this(str, (i13 & 2) != 0 ? WidgetCollectionName.OVERVIEW : widgetCollectionName);
    }
}
