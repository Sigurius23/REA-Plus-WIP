package qx1;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qx1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lqx1/d;", "", "", "analyticsCategory", "", "receivedKit", "upcycleOffer", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30757d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String analyticsCategory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean receivedKit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String upcycleOffer;

    public C30757d(String analyticsCategory, boolean z4, String upcycleOffer) {
        AbstractC22676k.m65750j(analyticsCategory, "analyticsCategory");
        AbstractC22676k.m65750j(upcycleOffer, "upcycleOffer");
        this.analyticsCategory = analyticsCategory;
        this.receivedKit = z4;
        this.upcycleOffer = upcycleOffer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getReceivedKit() {
        return this.receivedKit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUpcycleOffer() {
        return this.upcycleOffer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30757d)) {
            return false;
        }
        C30757d c30757d = (C30757d) other;
        return AbstractC22676k.m65745e(this.analyticsCategory, c30757d.analyticsCategory) && this.receivedKit == c30757d.receivedKit && AbstractC22676k.m65745e(this.upcycleOffer, c30757d.upcycleOffer);
    }

    public int hashCode() {
        return this.upcycleOffer.hashCode() + AbstractC2875y.m8289b(this.analyticsCategory.hashCode() * 31, 31, this.receivedKit);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.upcycleOffer, ")", AbstractC25012a.m73379l("UpcycleLandingAnalyticData(analyticsCategory=", this.analyticsCategory, ", receivedKit=", ", upcycleOffer=", this.receivedKit));
    }
}
