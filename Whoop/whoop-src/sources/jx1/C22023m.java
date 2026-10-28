package jx1;

import kd1.AbstractC22403o;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: jx1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Ljx1/m;", "Lm91/u;", "", "title", "Lkd1/o;", "tierImage", "subtitle", "<init>", "(Ljava/lang/String;Lkd1/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lkd1/o;", "()Lkd1/o;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22023m implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f85402d = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o tierImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    public C22023m(String title, AbstractC22403o tierImage, String subtitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.title = title;
        this.tierImage = tierImage;
        this.subtitle = subtitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getTierImage() {
        return this.tierImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22023m)) {
            return false;
        }
        C22023m c22023m = (C22023m) other;
        return AbstractC22676k.m65745e(this.title, c22023m.title) && AbstractC22676k.m65745e(this.tierImage, c22023m.tierImage) && AbstractC22676k.m65745e(this.subtitle, c22023m.subtitle);
    }

    public int hashCode() {
        return this.subtitle.hashCode() + AbstractC30007c.m91833c(this.tierImage, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.title;
        AbstractC22403o abstractC22403o = this.tierImage;
        String str2 = this.subtitle;
        StringBuilder sb4 = new StringBuilder("MembershipAdjustmentCheckoutHeaderViewState(title=");
        sb4.append(str);
        sb4.append(", tierImage=");
        sb4.append(abstractC22403o);
        sb4.append(", subtitle=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
