package jx1;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jx1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u000e¨\u0006!"}, m65681d2 = {"Ljx1/k;", "", "", "title", "subtitle", "Ljx1/h;", "daysLeft", "Ljx1/g;", "primaryCta", "secondaryCta", "trackingTier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljx1/h;Ljx1/g;Ljx1/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljx1/h;", "()Ljx1/h;", "Ljx1/g;", "()Ljx1/g;", "f", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22021k {

    /* JADX INFO: renamed from: g */
    public static final int f85389g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22018h daysLeft;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C22016g primaryCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22016g secondaryCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String trackingTier;

    public C22021k(String title, String subtitle, C22018h c22018h, C22016g primaryCta, C22016g c22016g, String trackingTier) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        this.title = title;
        this.subtitle = subtitle;
        this.daysLeft = c22018h;
        this.primaryCta = primaryCta;
        this.secondaryCta = c22016g;
        this.trackingTier = trackingTier;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22018h getDaysLeft() {
        return this.daysLeft;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C22016g getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22016g getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22021k)) {
            return false;
        }
        C22021k c22021k = (C22021k) other;
        return AbstractC22676k.m65745e(this.title, c22021k.title) && AbstractC22676k.m65745e(this.subtitle, c22021k.subtitle) && AbstractC22676k.m65745e(this.daysLeft, c22021k.daysLeft) && AbstractC22676k.m65745e(this.primaryCta, c22021k.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, c22021k.secondaryCta) && AbstractC22676k.m65745e(this.trackingTier, c22021k.trackingTier);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle);
        C22018h c22018h = this.daysLeft;
        int iHashCode = (this.primaryCta.hashCode() + ((iM30450d + (c22018h == null ? 0 : c22018h.hashCode())) * 31)) * 31;
        C22016g c22016g = this.secondaryCta;
        return this.trackingTier.hashCode() + ((iHashCode + (c22016g != null ? c22016g.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        C22018h c22018h = this.daysLeft;
        C22016g c22016g = this.primaryCta;
        C22016g c22016g2 = this.secondaryCta;
        String str3 = this.trackingTier;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InactiveInfoViewState(title=", str, ", subtitle=", str2, ", daysLeft=");
        sbM32001t.append(c22018h);
        sbM32001t.append(", primaryCta=");
        sbM32001t.append(c22016g);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(c22016g2);
        sbM32001t.append(", trackingTier=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
