package jx1;

import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jx1.y */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, m65681d2 = {"Ljx1/y;", "Lm91/u;", "Lkd1/o;", "tierImage", "", "Ljx1/w;", "features", "Ljx1/g;", "cta", "Ljx1/x;", "style", "<init>", "(Lkd1/o;Ljava/util/List;Ljx1/g;Ljx1/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "e", "()Lkd1/o;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljx1/g;", "()Ljx1/g;", "d", "Ljx1/x;", "()Ljx1/x;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22035y implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o tierImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C22033w> features;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22016g cta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC22034x style;

    public C22035y(AbstractC22403o tierImage, List<C22033w> features, C22016g c22016g, EnumC22034x style) {
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(features, "features");
        AbstractC22676k.m65750j(style, "style");
        this.tierImage = tierImage;
        this.features = features;
        this.cta = c22016g;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22016g getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b */
    public final List<C22033w> m63014b() {
        return this.features;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC22034x getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getTierImage() {
        return this.tierImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22035y)) {
            return false;
        }
        C22035y c22035y = (C22035y) other;
        return AbstractC22676k.m65745e(this.tierImage, c22035y.tierImage) && AbstractC22676k.m65745e(this.features, c22035y.features) && AbstractC22676k.m65745e(this.cta, c22035y.cta) && this.style == c22035y.style;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.tierImage.hashCode() * 31, 31, this.features);
        C22016g c22016g = this.cta;
        return this.style.hashCode() + ((iM31983b + (c22016g == null ? 0 : c22016g.hashCode())) * 31);
    }

    public String toString() {
        return "MembershipFeaturesCardViewState(tierImage=" + this.tierImage + ", features=" + this.features + ", cta=" + this.cta + ", style=" + this.style + ")";
    }
}
