package jx1;

import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jx1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, m65681d2 = {"Ljx1/i;", "Lm91/u;", "Lkd1/o;", "tierImage", "", "text", "Ljx1/g;", "cta", "trackingTier", "<init>", "(Lkd1/o;Ljava/lang/String;Ljx1/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "c", "()Lkd1/o;", "b", "Ljava/lang/String;", "Ljx1/g;", "()Ljx1/g;", "d", "e", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22019i implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f85376e = C9598e.f28134d | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o tierImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22016g cta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String trackingTier;

    public C22019i(AbstractC22403o tierImage, String text, C22016g cta, String trackingTier) {
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        this.tierImage = tierImage;
        this.text = text;
        this.cta = cta;
        this.trackingTier = trackingTier;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22016g getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getTierImage() {
        return this.tierImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22019i)) {
            return false;
        }
        C22019i c22019i = (C22019i) other;
        return AbstractC22676k.m65745e(this.tierImage, c22019i.tierImage) && AbstractC22676k.m65745e(this.text, c22019i.text) && AbstractC22676k.m65745e(this.cta, c22019i.cta) && AbstractC22676k.m65745e(this.trackingTier, c22019i.trackingTier);
    }

    public int hashCode() {
        return this.trackingTier.hashCode() + ((this.cta.hashCode() + AbstractC11266d.m30450d(this.tierImage.hashCode() * 31, 31, this.text)) * 31);
    }

    public String toString() {
        return "DowngradeMembershipCardViewState(tierImage=" + this.tierImage + ", text=" + this.text + ", cta=" + this.cta + ", trackingTier=" + this.trackingTier + ")";
    }
}
