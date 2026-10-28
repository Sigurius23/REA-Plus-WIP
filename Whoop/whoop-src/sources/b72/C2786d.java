package b72;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lb72/d;", "", "", "subtextTitleDisplay", "subtextValueDisplay", "subtextUnitsDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2786d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String subtextTitleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtextValueDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtextUnitsDisplay;

    public C2786d(String subtextTitleDisplay, String subtextValueDisplay, String subtextUnitsDisplay) {
        AbstractC22676k.m65750j(subtextTitleDisplay, "subtextTitleDisplay");
        AbstractC22676k.m65750j(subtextValueDisplay, "subtextValueDisplay");
        AbstractC22676k.m65750j(subtextUnitsDisplay, "subtextUnitsDisplay");
        this.subtextTitleDisplay = subtextTitleDisplay;
        this.subtextValueDisplay = subtextValueDisplay;
        this.subtextUnitsDisplay = subtextUnitsDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubtextTitleDisplay() {
        return this.subtextTitleDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtextUnitsDisplay() {
        return this.subtextUnitsDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtextValueDisplay() {
        return this.subtextValueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2786d)) {
            return false;
        }
        C2786d c2786d = (C2786d) other;
        return AbstractC22676k.m65745e(this.subtextTitleDisplay, c2786d.subtextTitleDisplay) && AbstractC22676k.m65745e(this.subtextValueDisplay, c2786d.subtextValueDisplay) && AbstractC22676k.m65745e(this.subtextUnitsDisplay, c2786d.subtextUnitsDisplay);
    }

    public int hashCode() {
        return this.subtextUnitsDisplay.hashCode() + AbstractC11266d.m30450d(this.subtextTitleDisplay.hashCode() * 31, 31, this.subtextValueDisplay);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.subtextUnitsDisplay, ")", AbstractC11895b.m32001t("SageGaugeSubtext(subtextTitleDisplay=", this.subtextTitleDisplay, ", subtextValueDisplay=", this.subtextValueDisplay, ", subtextUnitsDisplay="));
    }
}
