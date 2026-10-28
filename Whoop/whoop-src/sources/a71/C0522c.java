package a71;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a71.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"La71/c;", "", "", "leadingLabelDisplay", "leadingRangeDisplay", "trailingLabelDisplay", "trailingRangeDisplay", "unitDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0522c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String leadingLabelDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String leadingRangeDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String trailingLabelDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String trailingRangeDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String unitDisplay;

    public C0522c(String leadingLabelDisplay, String leadingRangeDisplay, String trailingLabelDisplay, String trailingRangeDisplay, String unitDisplay) {
        AbstractC22676k.m65750j(leadingLabelDisplay, "leadingLabelDisplay");
        AbstractC22676k.m65750j(leadingRangeDisplay, "leadingRangeDisplay");
        AbstractC22676k.m65750j(trailingLabelDisplay, "trailingLabelDisplay");
        AbstractC22676k.m65750j(trailingRangeDisplay, "trailingRangeDisplay");
        AbstractC22676k.m65750j(unitDisplay, "unitDisplay");
        this.leadingLabelDisplay = leadingLabelDisplay;
        this.leadingRangeDisplay = leadingRangeDisplay;
        this.trailingLabelDisplay = trailingLabelDisplay;
        this.trailingRangeDisplay = trailingRangeDisplay;
        this.unitDisplay = unitDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLeadingLabelDisplay() {
        return this.leadingLabelDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeadingRangeDisplay() {
        return this.leadingRangeDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTrailingLabelDisplay() {
        return this.trailingLabelDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTrailingRangeDisplay() {
        return this.trailingRangeDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUnitDisplay() {
        return this.unitDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0522c)) {
            return false;
        }
        C0522c c0522c = (C0522c) other;
        return AbstractC22676k.m65745e(this.leadingLabelDisplay, c0522c.leadingLabelDisplay) && AbstractC22676k.m65745e(this.leadingRangeDisplay, c0522c.leadingRangeDisplay) && AbstractC22676k.m65745e(this.trailingLabelDisplay, c0522c.trailingLabelDisplay) && AbstractC22676k.m65745e(this.trailingRangeDisplay, c0522c.trailingRangeDisplay) && AbstractC22676k.m65745e(this.unitDisplay, c0522c.unitDisplay);
    }

    public int hashCode() {
        return this.unitDisplay.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.leadingLabelDisplay.hashCode() * 31, 31, this.leadingRangeDisplay), 31, this.trailingLabelDisplay), 31, this.trailingRangeDisplay);
    }

    public String toString() {
        String str = this.leadingLabelDisplay;
        String str2 = this.leadingRangeDisplay;
        String str3 = this.trailingLabelDisplay;
        String str4 = this.trailingRangeDisplay;
        String str5 = this.unitDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageScrubberDetailsState(leadingLabelDisplay=", str, ", leadingRangeDisplay=", str2, ", trailingLabelDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", trailingRangeDisplay=", str4, ", unitDisplay=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
