package tp1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: tp1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u0018\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, m65681d2 = {"Ltp1/l;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "descriptionDisplay", "Lgz0/m0;", "icon", "ctaTextDisplay", "ctaIcon", "Lcom/whoop/navigation/e;", "ctaDestination", "", "dismissable", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "g", "()Lgz0/m0;", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "f", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34072l implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f142804g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaTextDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 ctaIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e ctaDestination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean dismissable;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f142804g = i13 | i14 | i14;
    }

    public C34072l(TextResource descriptionDisplay, EnumC16313m0 icon, TextResource textResource, EnumC16313m0 enumC16313m0, C9598e c9598e, boolean z4) {
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(icon, "icon");
        this.descriptionDisplay = descriptionDisplay;
        this.icon = icon;
        this.ctaTextDisplay = textResource;
        this.ctaIcon = enumC16313m0;
        this.ctaDestination = c9598e;
        this.dismissable = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34072l)) {
            return false;
        }
        C34072l c34072l = (C34072l) other;
        return AbstractC22676k.m65745e(this.descriptionDisplay, c34072l.descriptionDisplay) && this.icon == c34072l.icon && AbstractC22676k.m65745e(this.ctaTextDisplay, c34072l.ctaTextDisplay) && this.ctaIcon == c34072l.ctaIcon && AbstractC22676k.m65745e(this.ctaDestination, c34072l.ctaDestination) && this.dismissable == c34072l.dismissable;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDismissable() {
        return this.dismissable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.icon, this.descriptionDisplay.hashCode() * 31, 31);
        TextResource textResource = this.ctaTextDisplay;
        int iHashCode = (iM48500b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.ctaIcon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.ctaDestination;
        return Boolean.hashCode(this.dismissable) + ((iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.descriptionDisplay;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource2 = this.ctaTextDisplay;
        EnumC16313m0 enumC16313m1 = this.ctaIcon;
        C9598e c9598e = this.ctaDestination;
        boolean z4 = this.dismissable;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("HormonalInsightsUpsellState(descriptionDisplay=", textResource, ", icon=", enumC16313m0, ", ctaTextDisplay=");
        sbM61140k.append(textResource2);
        sbM61140k.append(", ctaIcon=");
        sbM61140k.append(enumC16313m1);
        sbM61140k.append(", ctaDestination=");
        sbM61140k.append(c9598e);
        sbM61140k.append(", dismissable=");
        sbM61140k.append(z4);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
