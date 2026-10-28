package o21;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: o21.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lo21/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "magnitudeDisplay", "countDisplay", "impactDisplay", "Ly81/f;", "impactStyle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27465c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f110669e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource magnitudeDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource countDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource impactDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f impactStyle;

    public C27465c(TextResource magnitudeDisplay, TextResource countDisplay, TextResource impactDisplay, EnumC39333f impactStyle) {
        AbstractC22676k.m65750j(magnitudeDisplay, "magnitudeDisplay");
        AbstractC22676k.m65750j(countDisplay, "countDisplay");
        AbstractC22676k.m65750j(impactDisplay, "impactDisplay");
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        this.magnitudeDisplay = magnitudeDisplay;
        this.countDisplay = countDisplay;
        this.impactDisplay = impactDisplay;
        this.impactStyle = impactStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCountDisplay() {
        return this.countDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getImpactDisplay() {
        return this.impactDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getImpactStyle() {
        return this.impactStyle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMagnitudeDisplay() {
        return this.magnitudeDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27465c)) {
            return false;
        }
        C27465c c27465c = (C27465c) other;
        return AbstractC22676k.m65745e(this.magnitudeDisplay, c27465c.magnitudeDisplay) && AbstractC22676k.m65745e(this.countDisplay, c27465c.countDisplay) && AbstractC22676k.m65745e(this.impactDisplay, c27465c.impactDisplay) && this.impactStyle == c27465c.impactStyle;
    }

    public int hashCode() {
        return this.impactStyle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.magnitudeDisplay.hashCode() * 31, this.countDisplay, 31), this.impactDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.magnitudeDisplay;
        TextResource textResource2 = this.countDisplay;
        TextResource textResource3 = this.impactDisplay;
        EnumC39333f enumC39333f = this.impactStyle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MagnitudeDetailCardState(magnitudeDisplay=", textResource, ", countDisplay=", textResource2, ", impactDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", impactStyle=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
