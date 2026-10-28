package yh0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yh0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lyh0/d;", "", "", "ageValueDisplay", "ageTitleDisplay", "ageSubtitleDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39538d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String ageValueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String ageTitleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String ageSubtitleDisplay;

    public C39538d(String ageValueDisplay, String ageTitleDisplay, String ageSubtitleDisplay) {
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(ageTitleDisplay, "ageTitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleDisplay, "ageSubtitleDisplay");
        this.ageValueDisplay = ageValueDisplay;
        this.ageTitleDisplay = ageTitleDisplay;
        this.ageSubtitleDisplay = ageSubtitleDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAgeSubtitleDisplay() {
        return this.ageSubtitleDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAgeTitleDisplay() {
        return this.ageTitleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAgeValueDisplay() {
        return this.ageValueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39538d)) {
            return false;
        }
        C39538d c39538d = (C39538d) other;
        return AbstractC22676k.m65745e(this.ageValueDisplay, c39538d.ageValueDisplay) && AbstractC22676k.m65745e(this.ageTitleDisplay, c39538d.ageTitleDisplay) && AbstractC22676k.m65745e(this.ageSubtitleDisplay, c39538d.ageSubtitleDisplay);
    }

    public int hashCode() {
        return this.ageSubtitleDisplay.hashCode() + AbstractC11266d.m30450d(this.ageValueDisplay.hashCode() * 31, 31, this.ageTitleDisplay);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.ageSubtitleDisplay, ")", AbstractC11895b.m32001t("DebugWhoopAgeAmoeba(ageValueDisplay=", this.ageValueDisplay, ", ageTitleDisplay=", this.ageTitleDisplay, ", ageSubtitleDisplay="));
    }

    public /* synthetic */ C39538d(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3);
    }
}
