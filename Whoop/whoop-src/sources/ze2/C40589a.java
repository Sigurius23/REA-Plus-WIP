package ze2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ze2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lze2/a;", "", "", "descriptionTextDisplay", "calloutTextHeaderDisplay", "", "scheduleComplete", "shouldShowCalloutText", "shouldShowDescriptionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "e", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40589a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String descriptionTextDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String calloutTextHeaderDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean scheduleComplete;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldShowCalloutText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean shouldShowDescriptionText;

    public C40589a(String descriptionTextDisplay, String calloutTextHeaderDisplay, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(descriptionTextDisplay, "descriptionTextDisplay");
        AbstractC22676k.m65750j(calloutTextHeaderDisplay, "calloutTextHeaderDisplay");
        this.descriptionTextDisplay = descriptionTextDisplay;
        this.calloutTextHeaderDisplay = calloutTextHeaderDisplay;
        this.scheduleComplete = z4;
        this.shouldShowCalloutText = z13;
        this.shouldShowDescriptionText = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalloutTextHeaderDisplay() {
        return this.calloutTextHeaderDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescriptionTextDisplay() {
        return this.descriptionTextDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getScheduleComplete() {
        return this.scheduleComplete;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShouldShowCalloutText() {
        return this.shouldShowCalloutText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldShowDescriptionText() {
        return this.shouldShowDescriptionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40589a)) {
            return false;
        }
        C40589a c40589a = (C40589a) other;
        return AbstractC22676k.m65745e(this.descriptionTextDisplay, c40589a.descriptionTextDisplay) && AbstractC22676k.m65745e(this.calloutTextHeaderDisplay, c40589a.calloutTextHeaderDisplay) && this.scheduleComplete == c40589a.scheduleComplete && this.shouldShowCalloutText == c40589a.shouldShowCalloutText && this.shouldShowDescriptionText == c40589a.shouldShowDescriptionText;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowDescriptionText) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.descriptionTextDisplay.hashCode() * 31, 31, this.calloutTextHeaderDisplay), 31, this.scheduleComplete), 31, this.shouldShowCalloutText);
    }

    public String toString() {
        String str = this.descriptionTextDisplay;
        String str2 = this.calloutTextHeaderDisplay;
        boolean z4 = this.scheduleComplete;
        boolean z13 = this.shouldShowCalloutText;
        boolean z14 = this.shouldShowDescriptionText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AlarmScheduleFooterDomain(descriptionTextDisplay=", str, ", calloutTextHeaderDisplay=", str2, ", scheduleComplete=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", shouldShowCalloutText=", z13, ", shouldShowDescriptionText=");
        return AbstractC18489d0.m53372m(sbM32001t, z14, ")");
    }
}
