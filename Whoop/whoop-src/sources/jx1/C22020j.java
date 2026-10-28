package jx1;

import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: jx1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001e\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b \u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b%\u0010\u0010¨\u0006&"}, m65681d2 = {"Ljx1/j;", "", "", "title", "Lkd1/o;", "fromMembership", "toMembership", "Ljx1/h;", "daysLeft", "Ljx1/g;", "primaryCta", "secondaryCta", "trackingTier", "<init>", "(Ljava/lang/String;Lkd1/o;Lkd1/o;Ljx1/h;Ljx1/g;Ljx1/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lkd1/o;", "()Lkd1/o;", "c", "f", "d", "Ljx1/h;", "()Ljx1/h;", "Ljx1/g;", "()Ljx1/g;", "g", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22020j {

    /* JADX INFO: renamed from: h */
    public static final int f85381h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o fromMembership;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o toMembership;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C22018h daysLeft;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22016g primaryCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C22016g secondaryCta;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String trackingTier;

    static {
        int i13 = C9598e.f28134d;
        int i14 = AbstractC22403o.f87638a;
        f85381h = i13 | i14 | i14;
    }

    public C22020j(String title, AbstractC22403o fromMembership, AbstractC22403o toMembership, C22018h c22018h, C22016g primaryCta, C22016g c22016g, String trackingTier) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(fromMembership, "fromMembership");
        AbstractC22676k.m65750j(toMembership, "toMembership");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        this.title = title;
        this.fromMembership = fromMembership;
        this.toMembership = toMembership;
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
    public final AbstractC22403o getFromMembership() {
        return this.fromMembership;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22016g getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C22016g getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22020j)) {
            return false;
        }
        C22020j c22020j = (C22020j) other;
        return AbstractC22676k.m65745e(this.title, c22020j.title) && AbstractC22676k.m65745e(this.fromMembership, c22020j.fromMembership) && AbstractC22676k.m65745e(this.toMembership, c22020j.toMembership) && AbstractC22676k.m65745e(this.daysLeft, c22020j.daysLeft) && AbstractC22676k.m65745e(this.primaryCta, c22020j.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, c22020j.secondaryCta) && AbstractC22676k.m65745e(this.trackingTier, c22020j.trackingTier);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getToMembership() {
        return this.toMembership;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.toMembership, AbstractC30007c.m91833c(this.fromMembership, this.title.hashCode() * 31, 31), 31);
        C22018h c22018h = this.daysLeft;
        int iHashCode = (this.primaryCta.hashCode() + ((iM91833c + (c22018h == null ? 0 : c22018h.hashCode())) * 31)) * 31;
        C22016g c22016g = this.secondaryCta;
        return this.trackingTier.hashCode() + ((iHashCode + (c22016g != null ? c22016g.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        AbstractC22403o abstractC22403o = this.fromMembership;
        AbstractC22403o abstractC22403o2 = this.toMembership;
        C22018h c22018h = this.daysLeft;
        C22016g c22016g = this.primaryCta;
        C22016g c22016g2 = this.secondaryCta;
        String str2 = this.trackingTier;
        StringBuilder sb4 = new StringBuilder("DowngradingInfoViewState(title=");
        sb4.append(str);
        sb4.append(", fromMembership=");
        sb4.append(abstractC22403o);
        sb4.append(", toMembership=");
        sb4.append(abstractC22403o2);
        sb4.append(", daysLeft=");
        sb4.append(c22018h);
        sb4.append(", primaryCta=");
        sb4.append(c22016g);
        sb4.append(", secondaryCta=");
        sb4.append(c22016g2);
        sb4.append(", trackingTier=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
