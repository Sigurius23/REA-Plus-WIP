package zz0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lzz0/a;", "", "Lcom/whoop/design/util/TextResource;", "currentDateRangeDisplay", "", "canNavigateForward", "canNavigateBackward", "", "nextDateTime", "previousDateTime", "<init>", "(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "()Z", "d", "Ljava/lang/String;", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41240a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource currentDateRangeDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean canNavigateForward;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean canNavigateBackward;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String nextDateTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String previousDateTime;

    public C41240a(TextResource currentDateRangeDisplay, boolean z4, boolean z13, String str, String str2) {
        AbstractC22676k.m65750j(currentDateRangeDisplay, "currentDateRangeDisplay");
        this.currentDateRangeDisplay = currentDateRangeDisplay;
        this.canNavigateForward = z4;
        this.canNavigateBackward = z13;
        this.nextDateTime = str;
        this.previousDateTime = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanNavigateBackward() {
        return this.canNavigateBackward;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanNavigateForward() {
        return this.canNavigateForward;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCurrentDateRangeDisplay() {
        return this.currentDateRangeDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNextDateTime() {
        return this.nextDateTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPreviousDateTime() {
        return this.previousDateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41240a)) {
            return false;
        }
        C41240a c41240a = (C41240a) other;
        return AbstractC22676k.m65745e(this.currentDateRangeDisplay, c41240a.currentDateRangeDisplay) && this.canNavigateForward == c41240a.canNavigateForward && this.canNavigateBackward == c41240a.canNavigateBackward && AbstractC22676k.m65745e(this.nextDateTime, c41240a.nextDateTime) && AbstractC22676k.m65745e(this.previousDateTime, c41240a.previousDateTime);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.currentDateRangeDisplay.hashCode() * 31, 31, this.canNavigateForward), 31, this.canNavigateBackward);
        String str = this.nextDateTime;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousDateTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.currentDateRangeDisplay;
        boolean z4 = this.canNavigateForward;
        boolean z13 = this.canNavigateBackward;
        String str = this.nextDateTime;
        String str2 = this.previousDateTime;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("BehaviorsCalendarDatePickerViewState(currentDateRangeDisplay=", textResource, ", canNavigateForward=", z4, ", canNavigateBackward=");
        AbstractC38963t7.m124391u(sbM91846p, z13, ", nextDateTime=", str, ", previousDateTime=");
        return AbstractC25012a.m73376i(str2, ")", sbM91846p);
    }

    public /* synthetic */ C41240a(TextResource textResource, boolean z4, boolean z13, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? true : z13, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2);
    }
}
