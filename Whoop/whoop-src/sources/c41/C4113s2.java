package c41;

import hy0.EnumC17727b2;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c41.s2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, m65681d2 = {"Lc41/s2;", "", "", "titleDisplay", "trendTitleDisplay", "Lhy0/b2;", "trendType", "description", "disclaimer", "Lny0/p0;", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhy0/b2;Ljava/lang/String;Ljava/lang/String;Lny0/p0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "getTrendTitleDisplay", "c", "Lhy0/b2;", "getTrendType", "()Lhy0/b2;", "e", "f", "Lny0/p0;", "()Lny0/p0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4113s2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String trendTitleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17727b2 trendType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String disclaimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27273p0 secondaryButton;

    public C4113s2(String titleDisplay, String trendTitleDisplay, EnumC17727b2 trendType, String description, String disclaimer, C27273p0 c27273p0) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trendTitleDisplay, "trendTitleDisplay");
        AbstractC22676k.m65750j(trendType, "trendType");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        this.titleDisplay = titleDisplay;
        this.trendTitleDisplay = trendTitleDisplay;
        this.trendType = trendType;
        this.description = description;
        this.disclaimer = disclaimer;
        this.secondaryButton = c27273p0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27273p0 getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4113s2)) {
            return false;
        }
        C4113s2 c4113s2 = (C4113s2) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c4113s2.titleDisplay) && AbstractC22676k.m65745e(this.trendTitleDisplay, c4113s2.trendTitleDisplay) && this.trendType == c4113s2.trendType && AbstractC22676k.m65745e(this.description, c4113s2.description) && AbstractC22676k.m65745e(this.disclaimer, c4113s2.disclaimer) && AbstractC22676k.m65745e(this.secondaryButton, c4113s2.secondaryButton);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.trendType.hashCode() + AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.trendTitleDisplay)) * 31, 31, this.description), 31, this.disclaimer);
        C27273p0 c27273p0 = this.secondaryButton;
        return iM30450d + (c27273p0 == null ? 0 : c27273p0.hashCode());
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.trendTitleDisplay;
        EnumC17727b2 enumC17727b2 = this.trendType;
        String str3 = this.description;
        String str4 = this.disclaimer;
        C27273p0 c27273p0 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("KeyMetricTileDialogContentState(titleDisplay=", str, ", trendTitleDisplay=", str2, ", trendType=");
        sbM32001t.append(enumC17727b2);
        sbM32001t.append(", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", disclaimer=");
        sbM32001t.append(str4);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(c27273p0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
